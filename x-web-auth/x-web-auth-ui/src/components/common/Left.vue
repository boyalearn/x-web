<template>
  <el-aside>
    <el-menu :router="true" id="menu">
      <el-submenu id="first-item" index="1">
        <template slot="title"><i style="color: #E6A23C" class="el-icon-s-data"></i>数据总览</template>
        <el-menu-item-group>
          <el-menu-item index="/business/home"><i class="el-icon-s-home"></i>主页</el-menu-item></el-menu-item-group>
      </el-submenu>
      <el-submenu index="2">
        <template slot="title"><i style="color: #67C23A" class="el-icon-s-platform"></i>权限管理</template>
        <el-menu-item-group>
          <el-menu-item index="/business/tenant"><i style="color: #E6A23C" class="el-icon-office-building"></i>租户管理</el-menu-item>
          <el-menu-item index="/business/client"><i class="el-icon-mobile-phone"></i>应用管理</el-menu-item>
          <el-menu-item index="/business/user"><i style="color: #409EFF" class="el-icon-s-custom"></i>用户管理</el-menu-item>
        </el-menu-item-group>
      </el-submenu>
      <el-submenu index="3">
        <template slot="title"><i style="color: #F56C6C" class="el-icon-document"></i>日志管理</template>
        <el-menu-item-group>
          <el-menu-item index="/business/option"><i class="el-icon-date"></i>操作日志</el-menu-item>
        </el-menu-item-group>
      </el-submenu>
    </el-menu>
  </el-aside>
</template>
<style>
.el-aside {
  width: 200px !important;
  height: 100%;
}

#menu {
  border-right: none;
  margin-top: 10px;
}
</style>
<script>
export default {
  name: 'Left',
  data() {
    return {
      isCollapse: false
    };
  },
  created() {
    window.addEventListener('resize', this.getHeight);
  },
  methods: {
    getHeight() {
      var height = window.innerHeight - 65 + 'px';  //获取浏览器高度减去顶部导航栏
      document.getElementById("menu").style.height = height;
    },
    handleOpen(key, keyPath) {
      console.log(key, keyPath);
    },
    handleClose(key, keyPath) {
      console.log(key, keyPath);
    }
  },
  mounted() {
    this.getHeight();
  }
}
</script>
