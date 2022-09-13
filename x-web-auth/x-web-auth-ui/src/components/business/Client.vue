<template>
  <el-main>
    <div class="tableContent">
      <el-page-header style="line-height: 56px; height: 56px; margin-bottom: 0px" @back="goBack" content="应用管理">
      </el-page-header>
      <el-button style="margin-bottom: 10px" type="success" @click="showAddDialog()" size="small">添加</el-button>
      <el-table
        :data="clients"
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
          label="应用名称">
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
            <el-button icon="el-icon-edit" type="primary" circle @click="handleEdit(scope.$index, scope.row)"
                       size="mini">
            </el-button>
            <el-button icon="el-icon-user-solid" type="success" circle
                       @click="role =true; showRight('/xauth/roles',scope.row)" size="mini">
            </el-button>
            <el-button icon="el-icon-unlock" type="success" circle
                       @click="auth=true; showRight('/xauth/resources', scope.row)" size="mini">
            </el-button>
            <el-button
              icon="el-icon-delete" circle
              size="mini"
              type="danger"
              @click="handleDelete(scope.$index, scope.row)">
            </el-button>
          </template>
        </el-table-column>
      </el-table>
      <el-pagination
        align="center"
        background
        layout="prev, pager, next"
        @current-change="selectClients"
        :total="client_total">
      </el-pagination>
    </div>
    <el-dialog title="添加应用" :visible.sync="clientAddDialog">
      <el-form :model="clientForm">
        <el-form-item label="租户" :label-width="formLabelWidth">
          <el-select v-model="clientForm.tenant_id" placeholder="请选择租户">
            <el-option v-for="(item,index) in tenants"
                       :label="item.name"
                       :key="index"
                       :value="item.id">
            </el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="应用名称" :label-width="formLabelWidth">
          <el-input v-model="clientForm.name" autocomplete="off"></el-input>
        </el-form-item>
        <el-form-item label="应用描述" :label-width="formLabelWidth">
          <el-input v-model="clientForm.description" autocomplete="off"></el-input>
        </el-form-item>
        <el-form-item label="授权地址" :label-width="formLabelWidth">
          <el-input v-model="clientForm.redirect_uris" autocomplete="off"></el-input>
        </el-form-item>
        <el-form-item label="授权范围" :label-width="formLabelWidth">
          <el-input v-model="clientForm.scope" autocomplete="off"></el-input>
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button @click="clientAddDialog = false">取 消</el-button>
        <el-button type="primary" @click="addClient()">确 定</el-button>
      </div>
    </el-dialog>
    <el-dialog title="编辑应用" :visible.sync="clientEditDialog">
      <el-form :model="clientForm">
        <el-form-item label="租户" :label-width="formLabelWidth">
          <el-select v-model="clientForm.tenant_id" @change="$forceUpdate()" placeholder="请选择租户">
            <el-option v-for="(item,index) in tenants"
                       :label="item.name"
                       :key="index"
                       :value="item.id+''">
            </el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="应用名称" :label-width="formLabelWidth">
          <el-input v-model="clientForm.name" autocomplete="off"></el-input>
        </el-form-item>
        <el-form-item label="应用描述" :label-width="formLabelWidth">
          <el-input v-model="clientForm.description" autocomplete="off"></el-input>
        </el-form-item>
        <el-form-item label="授权地址" :label-width="formLabelWidth">
          <el-input v-model="clientForm.redirect_uris" autocomplete="off"></el-input>
        </el-form-item>
        <el-form-item label="授权范围" :label-width="formLabelWidth">
          <el-input v-model="clientForm.scope" autocomplete="off"></el-input>
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button @click="clientEditDialog = false">取 消</el-button>
        <el-button type="primary" @click="clientEditDialog = false;handleUpdate()">确 定</el-button>
      </div>
    </el-dialog>

    <el-dialog title="添加角色" :visible.sync="roleAddDialog">
      <el-form :model="roleForm">
        <el-form-item label="角色名称" :label-width="formLabelWidth">
          <el-input v-model="roleForm.name" autocomplete="off"></el-input>
        </el-form-item>
        <el-form-item label="角色编码" :label-width="formLabelWidth">
          <el-input v-model="roleForm.code" autocomplete="off"></el-input>
        </el-form-item>
        <el-form-item label="角色描述" :label-width="formLabelWidth">
          <el-input v-model="roleForm.description" autocomplete="off"></el-input>
        </el-form-item>

      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button @click="roleAddDialog = false">取 消</el-button>
        <el-button type="primary" @click="addRole()">确 定</el-button>
      </div>
    </el-dialog>
    <el-dialog title="编辑角色" :visible.sync="roleEditDialog">
      <el-form :model="roleForm">
        <el-form-item label="角色名称" :label-width="formLabelWidth">
          <el-input v-model="roleForm.name" autocomplete="off"></el-input>
        </el-form-item>
        <el-form-item label="角色编码" :label-width="formLabelWidth">
          <el-input v-model="roleForm.code" autocomplete="off"></el-input>
        </el-form-item>
        <el-form-item label="角色描述" :label-width="formLabelWidth">
          <el-input v-model="roleForm.description" autocomplete="off"></el-input>
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button @click="roleEditDialog = false">取 消</el-button>
        <el-button type="primary" @click="updateRole()">确 定</el-button>
      </div>
    </el-dialog>
    <el-dialog title="添加资源" :visible.sync="authAddDialog">
      <el-form :model="authForm">
        <el-form-item label="资源名称" :label-width="formLabelWidth">
          <el-input v-model="authForm.name" autocomplete="off"></el-input>
        </el-form-item>
        <el-form-item label="资源编码" :label-width="formLabelWidth">
          <el-input v-model="authForm.code" autocomplete="off"></el-input>
        </el-form-item>
        <el-form-item label="应用描述" :label-width="formLabelWidth">
          <el-input v-model="authForm.description" autocomplete="off"></el-input>
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button @click="authAddDialog = false">取 消</el-button>
        <el-button type="primary" @click="addAuth()">确 定</el-button>
      </div>
    </el-dialog>
    <el-dialog title="编辑资源" :visible.sync="authEditDialog">
      <el-form :model="authForm">
        <el-form-item label="资源名称" :label-width="formLabelWidth">
          <el-input v-model="authForm.name" autocomplete="off"></el-input>
        </el-form-item>
        <el-form-item label="资源编码" :label-width="formLabelWidth">
          <el-input v-model="authForm.code" autocomplete="off"></el-input>
        </el-form-item>
        <el-form-item label="应用描述" :label-width="formLabelWidth">
          <el-input v-model="authForm.description" autocomplete="off"></el-input>
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button @click="authEditDialog = false">取 消</el-button>
        <el-button type="primary" @click="updateAuth()">确 定</el-button>
      </div>
    </el-dialog>
    <el-dialog title="角色权限管理" :visible.sync="roleAuthDialog">
      <template>
        <el-transfer
          filterable
          :filter-method="filterMethod"
          clearable
          filter-placeholder="请输入权限"
          v-model="selectAuths"
          :data="optionAuths">
        </el-transfer>
      </template>

      <el-button @click="addAuthToRole()">添加权限</el-button>
    </el-dialog>
    <el-drawer
      title="角色管理"
      :visible.sync="role"
      :direction="direction"
      :with-header="false"
      size="50%"
      :before-close="handleClose">
      <el-button @click="showAddRole()" type="success" style="margin-bottom: 10px" size="small">添加角色</el-button>
      <el-table
        :data="roles"
        border
        size="small"
        @selection-change="handleSelectionChange">
        <el-table-column
          type="selection"
          align="center">
        </el-table-column>
        <el-table-column
          label="编码">
          <template slot-scope="scope">
            <span style="margin-left: 10px">{{ scope.row.code }}</span>
          </template>
        </el-table-column>
        <el-table-column
          label="角色名称">
          <template slot-scope="scope">
            <span style="margin-left: 10px">{{ scope.row.name }}</span>
          </template>
        </el-table-column>

        <el-table-column prop="description"
                         label="描述">
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
          label="操作">
          <template slot-scope="scope">
            <el-button @click="roleEditDialog=true; showEditRole(scope.row)" type="success" icon="el-icon-edit" circle
                       size="mini">
            </el-button>
            <el-button @click="showRoleAuth(scope.row)" type="warning" size="mini" icon="el-icon-user-solid" circle>
            </el-button>
            <el-button @click="deleteRole(scope.row)" type="danger" size="mini" icon="el-icon-delete" circle>
            </el-button>
          </template>
        </el-table-column>
      </el-table>
      <el-pagination
        align="center"
        background
        layout="prev, pager, next"
        @current-change="selectRoles"
        :total="role_total">
      </el-pagination>
    </el-drawer>
    <el-drawer
      title="权限管理"
      :visible.sync="auth"
      :with-header="false"
      :direction="direction"
      size="50%"
      :before-close="handleClose">
      <el-button style="margin-bottom: 10px" @click="showAddAuth()" size="small">添加权限</el-button>
      <el-table
        :data="auths"
        border
        size="mini"
        @selection-change="handleSelectionChange">
        <el-table-column
          type="selection"
          align="center">
        </el-table-column>
        <el-table-column
          label="编码">
          <template slot-scope="scope">
            <span style="margin-left: 10px">{{ scope.row.code }}</span>
          </template>
        </el-table-column>
        <el-table-column
          label="权限名称">
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
          label="操作">
          <template slot-scope="scope">
            <el-button type="success" circle icon="el-icon-edit" @click="authEditDialog=true; showEditAuth(scope.row)"
                       size="mini">
            </el-button>
            <el-button type="danger" circle icon="el-icon-delete" @click="deleteAuth(scope.row)" size="mini">
            </el-button>
          </template>
        </el-table-column>
      </el-table>
      <el-pagination
        align="center"
        background
        layout="prev, pager, next"
        @current-change="selectClientAuths"
        :total="auth_total">
      </el-pagination>
    </el-drawer>
  </el-main>
</template>
<style>
.el-drawer {
  padding: 10px;
}

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
  name: 'Client',
  components: {
    Left,
    Header
  },
  data() {
    return {
      clientAddDialog: false,
      clientEditDialog: false,
      role: false,
      roleAddDialog: false,
      roleEditDialog: false,
      roleAuthDialog: false,
      auth: false,
      authAddDialog: false,
      authEditDialog: false,
      tenants: [],
      selectedTenant: {},
      clients: [],
      client_total: 0,
      roles: [],
      current_role_page: 1,
      role_total: 0,
      auths: [],
      current_auth_page: 1,
      auth_total: 0,
      clientForm: {
        name: '',
        tenant_id: 0,
        description: '',
        redirect_uris: '',
        scope: ''
      },
      roleForm: {
        name: '',
        client_id: this.current_client_id,
        description: '',
        code: ''
      },
      authForm: {
        name: '',
        client_id: this.current_client_id,
        description: '',
        code: ''
      },
      filterMethod(query, item) {
        return item.pinyin.indexOf(query) > -1;
      },
      selectAuths: [],
      optionAuths: [],
      direction: 'rtl',
      formLabelWidth: '120px',
      current_client_id: '',
      current_role_id: '',
      current_auth_id: ''
    }
  },
  methods: {
    init() {
      var _this = this;
      this.$axios.get("/xauth/tenants").then(function (data) {
        _this.tenants = data.data.data.list;
      })
      this.$axios.get("/xauth/clients").then(function (data) {
        _this.clients = data.data.data.list;
        _this.client_total = data.data.data.total;

      })
    },
    selectClients(page) {
      var _this = this;
      this.$axios.get("/xauth/clients?page=" + page).then(function (data) {
        _this.clients = data.data.data.list;
        _this.client_total = data.data.data.total;

      })
    },
    showAddDialog() {
      this.clientAddDialog = true;
      this.clientForm = {};
    },
    showAddRole() {
      this.roleAddDialog = true;
      this.roleForm = {}
    },
    showEditRole(item) {
      this.roleForm = item;
      this.current_role_id = item.id;
      this.roleEditDialog = true;
    },
    showRoleAuth(row) {
      var _this = this;
      this.roleAuthDialog = true;
      _this.current_role_id = row.id;
      this.$axios.get("/xauth/roles/" + row.id + "/resources").then(function (data) {
        _this.selectAuths = data.data.data.selected;
        _this.optionAuths = data.data.data.options;
      })
    },
    addAuthToRole() {
      var _this = this;
      this.roleAuthDialog = true;
      this.$axios.put("/xauth/roles/" + _this.current_role_id + "/resources", JSON.stringify(_this.selectAuths)).then(function (data) {
        _this.$message({
          message: data.data.message,
          type: 'success'
        });
      })
    },
    showEditAuth(item) {
      this.authForm = item;
      this.current_auth_id = item.id;
      this.authEditDialog = true;
    },
    showAddAuth() {
      this.authForm = {}
      this.authAddDialog = true;
    },
    addRole() {
      this.roleForm.client_id = this.current_client_id;
      var _this = this;
      this.$axios.post("/xauth/roles", JSON.stringify(this.roleForm)).then(function (data) {
        _this.roleAddDialog = false;
        _this.$message({
          message: data.data.message,
          type: 'success'
        });
        _this.refreshRoles();
      })
    },
    updateRole() {
      var _this = this;
      this.roleForm.id = this.current_role_id;
      this.$axios.put("/xauth/roles/" + this.current_role_id, JSON.stringify(this.roleForm)).then(function (data) {
        _this.roleAddDialog = false;
        _this.$message({
          message: data.data.message,
          type: 'success'
        });
        _this.refreshRoles();
      })
    },
    deleteRole() {
      var _this = this;
      this.$confirm('此操作将永久删除, 是否继续?', '提示', {
        confirmButtonText: '确定',
        cancelButtonText: '取消',
        type: 'warning'
      }).then(() => {
        this.roleForm.id = this.current_role_id;
        this.$axios.delete("/xauth/roles/" + this.current_role_id).then(function (data) {
          _this.roleAddDialog = false;
          _this.$message({
            message: data.data.message,
            type: 'success'
          });
          _this.refreshRoles();
        })
      }).catch(() => {
        this.$message({
          type: 'info',
          message: '已取消删除'
        });
      });

    },
    addAuth() {
      this.authForm.client_id = this.current_client_id;
      var _this = this;
      this.$axios.post("/xauth/resources", JSON.stringify(this.authForm)).then(function (data) {
        _this.authAddDialog = false;
        _this.$message({
          message: data.data.message,
          type: 'success'
        });
        _this.refreshAuths();
      })
    },
    updateAuth() {
      this.authForm.id = this.current_auth_id;
      var _this = this;
      this.$axios.put("/xauth/resources/" + this.current_auth_id, JSON.stringify(this.authForm)).then(function (data) {
        _this.authAddDialog = false;
        _this.$message({
          message: data.data.message,
          type: 'success'
        });
        _this.refreshAuths();
      })
    },
    deleteAuth(item) {
      var _this = this;
      this.current_auth_id = item.id;
      this.$confirm('此操作将永久删除, 是否继续?', '提示', {
        confirmButtonText: '确定',
        cancelButtonText: '取消',
        type: 'warning'
      }).then(() => {
        this.$axios.delete("/xauth/resources/" + this.current_auth_id).then(function (data) {
          _this.authAddDialog = false;
          _this.$message({
            message: data.data.message,
            type: 'success'
          });
          _this.refreshAuths();
        })
      }).catch(() => {
        this.$message({
          type: 'info',
          message: '已取消删除'
        });
      });

    },
    handleEdit(index, row) {
      this.clientForm = row;
      this.clientEditDialog = true;
    },
    addClient() {
      var _this = this;
      this.$axios.post("/xauth/clients", JSON.stringify(this.clientForm)).then(function (data) {
        _this.clientAddDialog = false;
        _this.$message({
          message: data.data.message,
          type: 'success'
        });
        _this.init();
      })
    },
    handleUpdate() {
      var _this = this;
      this.$axios.put("/xauth/clients/" + _this.clientForm.id, JSON.stringify(this.clientForm)).then(function (data) {
        _this.clientAddDialog = false;
        _this.$message({
          message: data.data.message,
          type: 'success'
        });
        _this.init();
      })
    },
    handleDelete(index, row) {
      var _this = this;
      this.$confirm('此操作将永久删除, 是否继续?', '提示', {
        confirmButtonText: '确定',
        cancelButtonText: '取消',
        type: 'warning'
      }).then(() => {
        this.$axios.delete("/xauth/clients/" + row.id).then(function (data) {
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
    showRight(url, row) {
      var _this = this;
      _this.current_client_id = row.id;
      var _url = url
      this.$axios.get(url + "?client_id=" + row.id).then(function (data) {
        if (_url.indexOf("roles") >= 0) {
          _this.roles = data.data.data.list;
          _this.role_total = data.data.data.total;
        } else {
          _this.auths = data.data.data.list;
          _this.auth_total = data.data.data.total;
        }
      });
    },
    selectRoles(page) {
      this.current_role_page = page;
      this.refreshRoles();
    },
    refreshRoles() {
      var _this = this;
      this.$axios.get("/xauth/roles?client_id=" + _this.current_client_id + "&page=" + _this.current_role_page).then(function (data) {
        _this.roles = data.data.data.list;
        _this.role_total = data.data.data.total;
      });
    },
    selectClientAuths(page) {
      var _this = this;
      _this.current_auth_page = page;
      _this.refreshAuths();
    },
    refreshAuths() {
      var _this = this;
      _this.$axios.get("/xauth/resources?client_id=" + _this.current_client_id + "&page=" + _this.current_auth_page).then(function (data) {
        _this.auths = data.data.data.list;
        _this.auth_total = data.data.data.total;

      });
    },
    handleClose(done) {
      done();
    }
  }
  ,
  mounted() {
    this.init();
  }
}
</script>

