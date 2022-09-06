<template>
  <div id="home-box" style=" width: 100%; margin: 10px; background-color: #FFFFFF;">
    <h3 style="text-indent: 10px">系统逻辑架构图</h3>
    <img style="display:block;margin:20px auto;text-align: center" src="../../assets/logicfunction.png"/>
  </div>
</template>
<style>
.el-header {
  width: 100%;
}
</style>
<script>


export default {
  name: 'Home',
  methods: {
    getHeight() {
      var height = window.innerHeight - 65 + 'px';  //获取浏览器高度减去顶部导航栏
      document.getElementById("home-box").style.height = height;
    },
  },
  mounted() {
    this.getHeight();
  }
}
</script>
