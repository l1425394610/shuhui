export function getStatus(status) {
  let val = ''
  switch (status) {
    case 1:
      val = '正常'
      break
    case 2:
      val = '禁用'
      break
    case 3:
      val = '删除'
      break
    default:
      val = '无'
  }
  console.log(val)
  return val
}