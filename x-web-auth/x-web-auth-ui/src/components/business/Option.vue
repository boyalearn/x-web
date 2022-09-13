<template>
  <el-main>
    <div class="tableContent">
      <el-page-header style="line-height: 56px; height: 56px; margin-bottom: 0px" @back="goBack" content="操作日志">
      </el-page-header>
      <el-button style="margin-bottom: 10px" size="small" type="success" @click="showTenantAddDialog()">添加</el-button>
      <el-table
        :data="tenants"
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
          label="租户名称">
          <template slot-scope="scope">
            <span style="margin-left: 10px">{{ scope.row.name }}</span>
          </template>
        </el-table-column>
        <el-table-column
          label="描述">
          <template slot-scope="scope">
            <span style="margin-left: 10px">{{ scope.row.description }}</span>
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
        @current-change="selectTenants"
        :total="tenant_total">
      </el-pagination>
    </div>
    <el-dialog title="添加租户" :visible.sync="tenantAddDialog">
      <el-form :model="tenantForm">
        <el-form-item label="租户名称" :label-width="formLabelWidth">
          <el-input v-model="tenantForm.name" autocomplete="off"></el-input>
        </el-form-item>
        <el-form-item label="租户描述" :label-width="formLabelWidth">
          <el-input v-model="tenantForm.description" autocomplete="off"></el-input>
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button @click="clientAddDialog = false">取 消</el-button>
        <el-button type="primary" @click="addTenant()">确 定</el-button>
      </div>
    </el-dialog>
    <el-dialog title="编辑租户" :visible.sync="tenantEditDialog">
      <el-form :model="tenantForm">
        <el-form-item label="租户名称" :label-width="formLabelWidth">
          <el-input v-model="tenantForm.name" autocomplete="off"></el-input>
        </el-form-item>
        <el-form-item label="租户描述" :label-width="formLabelWidth">
          <el-input v-model="tenantForm.description" autocomplete="off"></el-input>
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button @click="clientAddDialog = false">取 消</el-button>
        <el-button type="primary" @click="updateTenant()">确 定</el-button>
      </div>
    </el-dialog>
  </el-main>
</template>
<style>
</style>

<script>

export default {
  name: 'Option',
  data() {
    return {
      tenantEditDialog: false,
      tenantAddDialog: false,
      tenantForm: {
        name: '',
        description: ''
      },
      tenants: [],
      tenant_total: 0,
      formLabelWidth: '120px'
    }
  },
  methods: {
    init() {
      var _this = this;
      this.$axios.get("/xauth/tenants").then(function (data) {
        _this.tenants = data.data.data.list;
        _this.tenant_total = data.data.data.total;
      })
    },
    selectTenants(page) {
      var _this = this;
      this.$axios.get("/xauth/tenants?page=" + page).then(function (data) {
        _this.tenants = data.data.data.list;
        _this.tenant_total = data.data.data.total;
      })
    },
    showTenantAddDialog() {
      this.tenantForm = {}
      this.tenantAddDialog = true;
    },
    handleEdit(index, row) {
      this.tenantForm = row;
      this.tenantEditDialog = true
    },
    handleDelete(index, row) {
      var _this = this;
      this.$confirm('此操作将永久删除, 是否继续?', '提示', {
        confirmButtonText: '确定',
        cancelButtonText: '取消',
        type: 'warning'
      }).then(() => {
        this.$axios.delete("/xauth/tenants/" + row.id).then(function (data) {
          _this.$message({
            message: data.data.message,
            type: 'success'
          });
          _this.init();
        })
      }).catch(() => {
        this.$message({
          type: 'info',
          message: '已取消删除'
        });
      });

    },
    handleSelectionChange(val) {
      this.multipleSelection = val;
    },
    goBack() {

    },
    addTenant() {
      var _this = this;
      this.$axios.post("/xauth/tenants", JSON.stringify(this.tenantForm)).then(function (data) {
        _this.tenantAddDialog = false;
        _this.$message({
          message: data.data.message,
          type: 'success'
        });
        _this.init();
      })
    },
    updateTenant() {
      var _this = this;
      this.$axios.put("/xauth/tenants/" + this.tenantForm.id, JSON.stringify(this.tenantForm)).then(function (data) {
        _this.tenantEditDialog = false;
        _this.$message({
          message: data.data.message,
          type: 'success'
        });
        _this.init();
      })
    }
  },
  mounted() {
    this.init();
  }
}
</script>

