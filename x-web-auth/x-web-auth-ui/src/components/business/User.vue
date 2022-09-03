<template>
  <el-main>
    <div class="tableContent">
      <el-page-header style="line-height: 56px; height: 56px; margin-bottom: 0px" @back="goBack" content="用户管理">
      </el-page-header>
      <el-button @click="userAddDialog = true" size="small" type="success" style="margin-bottom: 10px">添加</el-button>
      <el-table
        :data="users"
        border
        :header-cell-style="{'text-align':'center'}"
        @selection-change="handleSelectionChange" size="mini">
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
          label="用户账号">
          <template slot-scope="scope">
            <span style="margin-left: 10px">{{ scope.row.account }}</span>
          </template>
        </el-table-column>
        <el-table-column
          label="用户名">
          <template slot-scope="scope">
            <span style="margin-left: 10px">{{ scope.row.name }}</span>
          </template>
        </el-table-column>
        <el-table-column
          label="用户密码">
          <template slot-scope="scope">
            <span style="margin-left: 10px">{{ scope.row.password }}</span>
          </template>
        </el-table-column>
        <el-table-column
          label="创建时间">
          <template slot-scope="scope">
            <i class="el-icon-time"></i>
            <span style="margin-left: 10px">{{ scope.row.create_time }}</span>
          </template>
        </el-table-column>
        <el-table-column label="操作">
          <template slot-scope="scope">
            <el-button
              size="mini"
              icon="el-icon-edit" type="primary" circle
              @click="handleEdit(scope.$index, scope.row)">
            </el-button>
            <el-button
              size="mini"
              type="danger"
              icon="el-icon-setting" circle
              @click="handleAuthorize(scope.$index, scope.row)">
            </el-button>
            <el-button
              size="mini"
              type="danger"
              icon="el-icon-delete" circle
              @click="handleDelete(scope.$index, scope.row)">
            </el-button>
          </template>
        </el-table-column>
      </el-table>
      <el-pagination
        align="center"
        background
        layout="prev, pager, next"
        @current-change="selectUsers"
        :total="user_total">
      </el-pagination>
    </div>
    <el-dialog title="添加用户" :visible.sync="userAddDialog">
      <el-form :model="userForm">
        <el-form-item label="用户账号" :label-width="formLabelWidth">
          <el-input v-model="userForm.account" autocomplete="off"></el-input>
        </el-form-item>
        <el-form-item label="用户名称" :label-width="formLabelWidth">
          <el-input v-model="userForm.name" autocomplete="off"></el-input>
        </el-form-item>
        <el-form-item label="密码" :label-width="formLabelWidth">
          <el-input v-model="userForm.password" autocomplete="off"></el-input>
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button @click="clientAddDialog = false">取 消</el-button>
        <el-button type="primary" @click="addUser()">确 定</el-button>
      </div>
    </el-dialog>
    <el-dialog title="编辑用户" :visible.sync="userEditDialog">
      <el-form :model="userForm">
        <el-form-item label="用户账号" :label-width="formLabelWidth">
          <el-input v-model="userForm.account" autocomplete="off"></el-input>
        </el-form-item>
        <el-form-item label="用户名称" :label-width="formLabelWidth">
          <el-input v-model="userForm.name" autocomplete="off"></el-input>
        </el-form-item>
        <el-form-item label="密码" :label-width="formLabelWidth">
          <el-input v-model="userForm.password" autocomplete="off"></el-input>
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button @click="clientAddDialog = false">取 消</el-button>
        <el-button type="primary" @click="updateUser()">确 定</el-button>
      </div>
    </el-dialog>
    <el-dialog title="授权管理" :visible.sync="authorizeDialog">
      <template>
        <el-cascader size="small" style="margin-bottom: 10px" :options="options" v-model="value" clearable
                     placeholder="请选择授权的应用"
                     @change="changeClient">
        </el-cascader>
        <el-transfer
          filterable
          :filter-method="filterMethod"
          :titles="transferTitles"
          clearable
          filter-placeholder="请输入城市拼音"
          v-model="selectRoles"
          :data="optionRoles">
        </el-transfer>
      </template>

      <el-button style="margin-top: 10px" type="success" size="small" @click="addRole()"> 添加角色</el-button>
    </el-dialog>
  </el-main>
</template>
<style>

.el-pagination {
  margin-top: 10px;
}

.el-page-header {
  line-height: 60px;
  background-color: #FFFFFF;
  margin-bottom: 20px;
}
</style>
<script>
import Header from "../common/Header";
import Left from "../common/Left";

export default {
  name: 'User',
  components: {
    Left,
    Header
  },
  data() {
    return {
      datas: [],
      value: [],
      selectRoles: [],
      optionRoles: [],
      options: [],
      filterMethod(query, item) {
        return item.pinyin.indexOf(query) > -1;
      },
      userAddDialog: false,
      userEditDialog: false,
      authorizeDialog: false,
      users: [],
      user_total: 0,
      userForm: {
        name: '',
        account: '',
        password: ''
      },
      formLabelWidth: '120px',
      current_user_id: '',
      transferTitles: ["可选角色", "已选角色"]
    }
  },
  methods: {
    init() {
      var _this = this;
      this.$axios.get("/xauth/users").then(function (data) {
        _this.users = data.data.data.list;
        _this.user_total = data.data.data.total;
      })
    },
    selectUsers(page) {
      var _this = this;
      this.$axios.get("/xauth/users?page=" + page).then(function (data) {
        _this.users = data.data.data.list;
        _this.user_total = data.data.data.total;
      })
    },
    changeClient(value) {

      var _this = this;
      var selected = value;
      if (2 == selected.length) {
        this.$axios.get("/xauth/tenants/" + selected[0] + "/clients/" + selected[1] + "/users/" + _this.current_user_id).then(function (data) {
          _this.optionRoles = data.data.data.options;
          _this.selectRoles = data.data.data.values;
        })
      }
    },
    handleAuthorize(index, row) {
      var _this = this;
      this.$axios.get("/xauth/tenants/tree").then(function (data) {
        _this.options = data.data.data;
        _this.authorizeDialog = true;
      })
      this.current_user_id = row.id

    },
    addRole() {
      var _this = this;
      this.$axios.put("/xauth/clients/" + _this.value[1] + "/users/" + _this.current_user_id,
        JSON.stringify(_this.selectRoles)).then(function (data) {
        _this.$message({
          message: data.data.message,
          type: 'success'
        });
      })
    },
    handleEdit(index, row) {
      this.userForm = row;
      this.userEditDialog = true;
    },
    handleDelete(index, row) {
      var _this = this;
      this.$confirm('此操作将永久删除, 是否继续?', '提示', {
        confirmButtonText: '确定',
        cancelButtonText: '取消',
        type: 'warning'
      }).then(() => {
        this.$axios.delete("/xauth/users/" + row.id).then(function (data) {
          _this.$message({
            message: data.data.message,
            type: 'success'
          });
        })
      }).catch(() => {
        this.$message({
          type: 'info',
          message: '已取消删除'
        });
      });
    },
    addUser() {
      var _this = this;
      this.$axios.post("/xauth/users", JSON.stringify(this.userForm)).then(function (data) {
        _this.userAddDialog = false;
        _this.$message({
          message: data.data.message,
          type: 'success'
        });
      })
    },
    updateUser() {
      var _this = this;
      this.$axios.put("/xauth/users/" + this.userForm.id, JSON.stringify(this.userForm)).then(function (data) {
        _this.userEditDialog = false;
        _this.$message({
          message: data.data.message,
          type: 'success'
        });
      })
    },
    handleSelectionChange(val) {
      this.multipleSelection = val;
    },
    goBack() {

    }
  },
  mounted() {
    this.init();
  }
}
</script>

