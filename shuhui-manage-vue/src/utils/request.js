import axios from 'axios'
import Vue from 'vue'
import store from '@/store/index'

const request = axios.create({
  baseUrl: '/api',
  timeOut: 6000
})

request.interceptors.request.use(config => {
  // const token = Vue.ls.get('ACCESS_TOKEN')
  // if (token) {
  //   config.headers['Authorization'] = 'Bearer ' + token
  // }
  return config
})

export default request