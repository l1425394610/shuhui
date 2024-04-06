<template>
  <div>
    <el-table :data="dictData" style="width: 100%">
      <el-table-column label="字典名称" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.name }}</span>
          <span style="margin-left: 10px">{{ scope.row.date }}</span>
        </template>
      </el-table-column>
      <el-table-column label="字典编码" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.code }}</span>
        </template>
      </el-table-column>
      <el-table-column label="状态" align="center">
        <template slot-scope="scope">
          <el-tag>{{ getStatus(scope.row.status) }}</el-tag>
        </template>
      </el-table-column>

      <el-table-column label="描述" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.description }}</span>
        </template>
      </el-table-column>
      <el-table-column label="操作" align="center">
        <template slot-scope="scope">
          <el-button size="mini" @click="handleEdit(scope.row)">编辑</el-button>
          <el-button size="mini" type="danger" @click="handleDelete(scope.row)"
            >删除</el-button
          >
        </template>
      </el-table-column>
    </el-table>
  </div>
</template>

<script>
import { getStatus } from '@/api/common/index'
import { page } from '@/api/sys/dict'
export default {
  data() {
    return {
      dictData: []
    }
  },
  filters: {},
  computed: {
    getStatus() {
      return function (status) {
        return getStatus(status)
      }
    }
  },
  created() {
    this.page()
  },
  methods: {
    page() {
      page().then((res) => {
        this.dictData = res.data.data.records
      })
    },
    handleEdit(record) {},
    handleDelete(record) {}
  }
}
</script>

<style scoped></style>
