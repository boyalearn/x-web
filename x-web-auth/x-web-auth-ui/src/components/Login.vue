<template>
  <div class="login-box">
    <div style="height: 100px"></div>
    <el-form :model="loginForm" status-icon  class="login-form">
      <div class="login-title">
        <a>Xauth admin v1.0 登录</a>
      </div>
      <el-form-item label-width="0" label="">
        <el-input type="text" v-model="loginForm.name" autocomplete="off" placeholder="请输入用户名"></el-input>
      </el-form-item>
      <el-form-item label-width="0" label="">
        <el-input type="password" v-model="loginForm.password" autocomplete="off" placeholder="请输入密码"></el-input>
      </el-form-item>

      <el-form-item label-width="0">
        <el-button type="success" style="width: 100%" @click="submitForm()">提交</el-button>
      </el-form-item>
    </el-form>
  </div>
</template>
<style>
.login-box {
  height: 100%;
  background: url(../assets/bg.png) no-repeat center;
  background-size: 100% 100%;
}

.login-form {
  width: 400px;
  background-color: #FFFFFF;
  padding: 40px;
  border-radius: 5px;
  margin: 0 auto;
}

.login-title {
  margin-top: 40px;
  margin-bottom: 40px;
}

</style>
<script>


export default {
  name: 'Login',
  data() {
    return {
      loginForm: {
        name: '',
        password: ''
      },
    };
  },
  methods: {
    submitForm() {
      var _this = this;
      this.$axios.post("/xauth/oauth/token?grant_type=password&username=" +
        _this.loginForm.name + "&password=" +
        _this.loginForm.password + "&client_id=dae5ba88-befc-495b-903c-ce0a90e0d9ea&client_secret=f90360a0-d4a2-4c60-816f-d0a212de592a").then(function (data) {
        sessionStorage.setItem("token", data.data.access_token)
        if (data.data.access_token) {
          _this.$message({
            message: "登录成功",
            type: 'success'
          });
          _this.$router.push("/business/home");
        }

      }).catch(function (error) {
        console.log("error",error)
        //_this.$message.error(error.response.data.error_description);
      });

    },
    resetForm(formName) {
      this.$refs[formName].resetFields();
    }
  }
}
</script>

<style>

</style>
