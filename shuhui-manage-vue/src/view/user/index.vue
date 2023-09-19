<template>
  <div>
    <h2>普通用户页面</h2>
    <el-button @click="logout">退出登陆</el-button>
  </div>
</template>

<script>
import axios from 'axios';


export default {
  data() {
    return {
      sysUser: {
        username: '',
        password: '',
      }
    }
  },
  methods: {
    logout() {
      axios({
        url: '/api/login',
        method: 'post',
        data: this.sysUser,
        headers: {
          'Content-Type': 'application/x-www-form-urlencoded;charset=UTF-8'
        }
      }).then(res => {
        console.log(res);
      })
    }
  }
}
</script>

<style scoped></style>
