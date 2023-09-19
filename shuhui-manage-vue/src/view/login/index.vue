<template>
  <div>

    <div style="width: 300px;margin: 0 auto;">
      <el-form label-width="80px">
        <el-form-item label="用户名">
          <el-input v-model="sysUser.username"></el-input>
        </el-form-item>
        <el-form-item label="密码">
          <el-input v-model="sysUser.password" show-password></el-input>
        </el-form-item>
        <el-button @click="login">登陆</el-button>
        <el-button @click="login">登出</el-button>

        <div>
          <el-button @click="adminOperation">只有admin可以点击</el-button>
          <el-button @click="userOperation">user或admin可以点击</el-button>
          <el-button @click="commonOperation">不用登陆即可点击</el-button>
        </div>

        <el-button @click="toSystem">跳转</el-button>
      </el-form>
    </div>
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
    adminOperation() {
      axios({
        url: '/api/admin/test',
        method: 'get',
      }).then(res => {
        console.log(res);
      })
    },
    userOperation() {
      axios({
        url: '/api/user/test',
        method: 'get',
      }).then(res => {
        console.log(res);
      })
    },
    commonOperation() {
      axios({
        url: '/api/public/test',
        method: 'get',
      }).then(res => {
        console.log(res);
      })
    },

    login() {
      axios({
        url: '/api/login',
        method: 'post',
        headers: { "Content-Type": "application/x-www-form-urlencoded" },
        data: this.sysUser
      }).then(res => {
        console.log(res);
      })
    },
    toSystem() {
      this.$router.push('/home')
    }
  }
}
</script>

<style scoped></style>
