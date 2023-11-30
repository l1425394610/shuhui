<template>
  <div>
    <div style="width: 300px; margin: 0 auto">
      <el-form label-width="80px">
        <el-form-item label="用户名">
          <el-input v-model="sysUser.username" />
        </el-form-item>
        <el-form-item label="密码">
          <el-input v-model="sysUser.password" show-password />
        </el-form-item>
        <el-button @click="login">
          登陆
        </el-button>
        <el-button @click="login">
          登出
        </el-button>
      </el-form>
    </div>
  </div>
</template>

<script>
import axios from 'axios'

export default {
  data() {
    return {
      sysUser: {
        username: '',
        password: ''
      }
    }
  },
  methods: {
    login() {
      this.$router.push('/home')
    },
    toSystem() {
      this.$router.push('/home')
    }
  }
}
</script>

<style scoped></style>
