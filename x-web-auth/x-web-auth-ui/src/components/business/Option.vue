<template>
  <el-main>
    <div class="tableContent">
      <el-page-header style="line-height: 56px; height: 56px; margin-bottom: 0px" @back="goBack" content="系统日志">
      </el-page-header>
      <el-form :inline="true" ref="form" label-width="90px" size="small">
        <el-form-item label="时间范围：">
          <el-date-picker
            style="margin-bottom: 10px" size="small"
            value-format="yyyy-MM-dd"
            v-model="timeValue"
            type="daterange"
            range-separator="至"
            start-placeholder="开始日期"
            end-placeholder="结束日期">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="关键字：">
          <el-input v-model="searchText"></el-input>
        </el-form-item>
        <el-form-item>
          <el-button type="success" @click="doSearch">搜索</el-button>
        </el-form-item>
      </el-form>
      <el-table
        :data="systemLogs"
        border
        size="mini"
        :header-cell-style="{'text-align':'center'}"
        @selection-change="handleSelectionChange">
        <el-table-column
          type="selection"
          align="center">
        </el-table-column>
        <el-table-column
          label="ID">
          <template slot-scope="scope">
            <span style="margin-left: 10px">{{ scope.row.id }}</span>
          </template>
        </el-table-column>
        <el-table-column
          label="用户名称">
          <template slot-scope="scope">
            <span style="margin-left: 10px">{{ scope.row.user_name }}</span>
          </template>
        </el-table-column>
        <el-table-column
          label="应用名称">
          <template slot-scope="scope">
            <span style="margin-left: 10px">{{ scope.row.client_name }}</span>
          </template>
        </el-table-column>
        <el-table-column
          label="系统模块">
          <template slot-scope="scope">
            <span style="margin-left: 10px">{{ scope.row.model }}</span>
          </template>
        </el-table-column>
        <el-table-column
          label="操作类型">
          <template slot-scope="scope">
            <span style="margin-left: 10px">{{ scope.row.option }}</span>
          </template>
        </el-table-column>
        <el-table-column
          label="操作内容">
          <template slot-scope="scope">
            <el-popover
              placement="top-start"
              width="200"
              trigger="hover"
              :content="scope.row.description">
              <span slot="reference">{{ scope.row.description| limitContext(12) }}</span>
            </el-popover>
          </template>
        </el-table-column>
        <el-table-column
          label="创建时间">
          <template slot-scope="scope">
            <i class="el-icon-time"></i>
            <span style="margin-left: 10px">{{ scope.row.create_time }}</span>
          </template>
        </el-table-column>
      </el-table>
      <el-pagination
        align="center"
        background
        layout="prev, pager, next"
        @current-change="selectSystemLogs"
        :total="system_logs_total">
      </el-pagination>
    </div>
  </el-main>
</template>
<style>
</style>

<script>

export default {
  name: 'Option',
  data() {
    return {
      timeValue: "",
      searchText: "",
      systemLogs: [],
      system_logs_total: 0,
      system_logs_current_page: 1,
      formLabelWidth: '120px'
    }
  },
  methods: {
    init() {
      var _this = this;
      _this.doSearch();
    },
    selectSystemLogs(page) {
      var _this = this;
      _this.system_logs_current_page = page;
      _this.doSearch();
    },
    doSearch() {
      var _this = this;
      var url = "/xauth/system-logs?page=" + _this.system_logs_current_page;
      if ('' != _this.timeValue) {
        var startTime = _this.timeValue[0] + " 00:00:00";
        var endTime = _this.timeValue[1] + " 23:59:59";
        url += "&start_time=" + startTime + "&ended_time=" + endTime;
      }
      if ('' != _this.searchText) {
        url += "&search=" + _this.searchText;
      }
      this.$axios.get(url).then(function (data) {
        _this.systemLogs = data.data.data.list;
        _this.system_logs_total = data.data.data.total;
      })
    },
    handleSelectionChange(val) {
      this.multipleSelection = val;
    },
    goBack() {
    },
  },
  mounted() {
    this.init();
  }
}
</script>

