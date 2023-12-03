<template functional>
  <el-submenu :index="props.menu.path">
    <template slot="title">
      <span>{{ props.menu.name }}</span>
    </template>

    <template v-for="item in props.menu.children">
      <el-menu-item
        v-if="!item.children"
        :key="item.id"
        :index="item.path"
      >
        <template slot="title">
          <span>{{ item.title }}</span>
        </template>
      </el-menu-item>

      <sub-menu
        v-else
        :key="item.id"
        :menu="item"
      />
    </template>
  </el-submenu>
</template>

<script>
export default {}
</script>