<template functional>
  <el-submenu :index="props.menu.path">
    <template slot="title">
      <span>{{ props.menu.name }}</span>
    </template>

    <template v-for="item in props.menu.children">
      <el-menu-item v-if="!item.children" :index="item.path">
        <template slot="title">
          <span>{{ item.name }}</span>
        </template>
      </el-menu-item>

      <sub-menu v-else :menu="item"></sub-menu>
    </template>


  </el-submenu>
</template>

<script>
export default {
}
</script>





