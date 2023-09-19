<template>
  <el-menu @open="handleOpen" @close="handleClose" style="height: 100vh;" background-color="#304156" text-color="#bfcbd9"
    active-text-color="#409EFF" router>

    <template v-for="item in menuList">
      <el-menu-item v-if="!item.children" :index="item.path">
        <template slot="title">
          <span>首页</span>
        </template>
      </el-menu-item>

      <sub-menu v-else :menu="item"></sub-menu>

    </template>
  </el-menu>
</template>

<script>
import SubMenu from './subMenu.vue'
export default {
  components: {
    SubMenu
  },
  data() {
    return {
      menuList: [
        {
          name: '首页',
          path: '/home/index',
          children: null
        },
        {
          name: '权限管理',
          path: '/permission',
          children: [
            {
              name: '角色管理',
              path: '/permission/role',
              children: null
            },
            {
              name: '用户管理',
              path: '/permission/user',
              children: [
                {
                  name: '测试',
                  path: '/permission/role',
                  children: null
                }
              ]
            }
          ]
        }
      ]
    }
  },
  methods: {
    handleOpen() {

    },
    handleClose() {

    }
  }
}
</script>

<style scoped>
.el-submenu {
  .el-menu-item {
    /* background: #283847 !important; */
    background: #1f2d3d;

  }

  .el-menu-item:hover {
    /* background: #283847 !important; */
    background: rgb(0, 21, 40);

  }

}
</style>
