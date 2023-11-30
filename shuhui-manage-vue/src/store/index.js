import Vue from 'vue'
import Vuex from 'vuex'
import { tree } from '@/api/sys/menu'


Vue.use(Vuex)

const store = new Vuex.Store({
  modules: {
    sys: {
      namespaced: true,
      state: {
        // 用户信息
        user: {},
        // 菜单路由
        menuTree: []
      },
      getters: {
        user(state) {
          return state.user
        },
        menuTree(state) {
          return state.menuTree
        }
      },
      mutations: {},
      // 异步请求
      actions: {
        getMenu() {
          tree().then(res => {
            this.state.menuTree = res.data.data
          })
        }
      }
    },
    permission: {
      namespaced: true,
      state: {
        // 用户信息
        user: {},
        // 菜单路由
        menuTree: []
      },
      getters: {
        user(state) {
          return state.user
        },
        menuTree(state) {
          return state.menuTree
        }
      },
      mutations: {},
      // 异步请求
      actions: {
      }
    }
  }
})

export default store