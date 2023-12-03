<template>
  <el-menu style='height: 100vh' background-color='#304156' text-color='#bfcbd9' active-text-color='#409EFF' router
    @open='handleOpen' @close='handleClose'>
    <template v-for='(item, index) in menuList'>
      <sub-menu v-if='item.children && item.children.length > 0' :key='item.id' :menu='item' />

      <el-menu-item v-else :key='item.id' :index='item.path'>
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
import { generateRoute } from '@/api/sys/menu'
import router from '@/router/index'

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
        generateRoute(this.menuList)
        console.log(router.getRoutes())
      })
    },
    handleOpen() { },
    handleClose() { }
  }
}
</script>

<style scoped></style>
