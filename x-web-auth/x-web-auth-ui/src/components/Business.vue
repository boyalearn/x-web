<template>
  <div>
    <Header></Header>
    <el-container>
      <Left></Left>
      <Main></Main>
    </el-container>
  </div>
</template>
<style>
.el-header{
  width: 100%;
}
</style>
<script>
import Header from "./common/Header";
import Left from "./common/Left";
import Main from "./common/Main"

export default {
  name: 'Business',
  components: {
    Left,
    Header,
    Main
  },
  methods: {
  }
}
</script>
