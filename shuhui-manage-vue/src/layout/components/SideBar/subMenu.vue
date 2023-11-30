<template functional>
  <el-submenu :index="props.menu.path">
    <template slot="title">
      <span>{{ props.menu.name }}</span>
    </template>

    <template v-for="(item, index) in props.menu.children">
      <el-menu-item
        v-if="!item.children"
        :key="index"
        :index="item.path"
      >
        <template slot="title">
          <span>{{ item.title }}</span>
        </template>
      </el-menu-item>

      <sub-menu
        v-else
        :key="index"
        :menu="item"
      />
    </template>
  </el-submenu>
</template>

<script>
export default {}
</script>