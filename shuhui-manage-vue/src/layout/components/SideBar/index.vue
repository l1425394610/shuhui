<template>
  <el-menu style='height: 100vh' background-color='#304156' text-color='#bfcbd9' active-text-color='#409EFF' router
    @open='handleOpen' @close='handleClose'>
    <template v-for='(item, index) in menuList'>
      <sub-menu v-if='item.children && item.children.length > 0' :key='index' :menu='item' />

      <el-menu-item v-else :key='index' :index='item.path'>
        <template slot='title'>
          <span>{{ item.title }}</span>
        </template>
      </el-menu-item>
    </template>
  </el-menu>
</template>

<script>
import SubMenu from './subMenu.vue'
import { tree } from '@/api/sys/menu'
import router from '@/router/index'
import { generateDynamicMenu } from '@/api/sys/menu'

export default {
  components: {
    SubMenu
  },
  data() {
    return {
      menuList: []
    }
  },
  computed: {},
  created() {
    this.init()
  },
  methods: {
    init() {
      tree().then(res => {
        this.menuList = res.data.data
        let data = []
        generateDynamicMenu(this.menuList, data)
        console.log(data)
        for (let i = 0; i < data.length; i++) {
          router.addRoute(data[i])
        }
        for (const item of data) {
          router.addRoute(item)
        }
        // data.forEach(item => {
        //   router.addRoute(item)
        // })
        // console.log(router)
        console.log(router.getRoutes())
      })
    },
    handleOpen() { },
    handleClose() { }
  }
}
</script>

<style scoped></style>
