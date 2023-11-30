<template>
  <el-container>
    <el-aside width="210px">
      <SideBar></SideBar>
    </el-aside>
    <el-container style="padding: 0;">

      <el-header style="background-color: orange;padding: 0;" height="60px"></el-header>

      <el-main style="background-color: grey;">
        <router-view style="padding: 0;"></router-view>
      </el-main>

    </el-container>
  </el-container>
</template>

<script>
import SideBar from './components/SideBar'
export default {
  components: {
    SideBar
  }
}

</script>

<style scoped></style>
