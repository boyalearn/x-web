<template>
  <el-header class="header-top" :span="24">
    <div class="logo">
      <a>XAuth Admin v1.0</a>
    </div>
    <div style="height: 45px;float:right;">
      <div class="block">
        <el-avatar :size="35" :src="circleUrl"></el-avatar>
      </div>
      <el-dropdown>
        <span class="el-dropdown-link">
          下拉菜单<i class="el-icon-arrow-down el-icon--right"></i>
        </span>
        <el-dropdown-menu slot="dropdown">
          <el-dropdown-item>黄金糕</el-dropdown-item>
          <el-dropdown-item>狮子头</el-dropdown-item>
          <el-dropdown-item>螺蛳粉</el-dropdown-item>
          <el-dropdown-item disabled>双皮奶</el-dropdown-item>
          <el-dropdown-item divided>蚵仔煎</el-dropdown-item>
        </el-dropdown-menu>
      </el-dropdown>
    </div>
  </el-header>
</template>
<style>
.el-dropdown-link{
  float: right;
}
.login-user{
  display: block;
  float: right;
  margin-left: 10px;
  line-height: 45px !important;
}
.block{
  float: left;
  height: 45px;
  margin-top: 5px;
  margin-right: 10px;
  line-height: 45px;
}
.el-header {
  background-color: #222;
  line-height: 45px;
  height: 45px !important;
  color: #FFFFFF;
}

.logo {
  float: left;
  width: 200px;
}
</style>
<script>
export default {
  name: 'Header',
  data() {
    return {
      activeIndex: '1',
      circleUrl:'./assets/logo.png'
    };
  },
  methods: {
    handleSelect(key, keyPath) {
      console.log(key, keyPath);
    }
  }
}
</script>
