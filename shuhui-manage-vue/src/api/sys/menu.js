import axios from '@/utils/request'
import layout from '@/layout/index'
import router from '@/router/index'

export function tree() {
  return axios({
    url: '/api/sysMenu/tree',
    method: 'GET'
  })
}

export function generateRoute(menuList) {
  for (const item of menuList) {
    // 创建顶级路由信息
    if (item.type === 2) {
      console.log(1)
      const route = getRoute(item)
      router.addRoute(route)
    }
    // 判断是否有子路由
    if (item.children && item.children.length > 0) {
      generateRoute(item.children)
    }
  }
}

function getRoute(item) {
  let route = {
    component: () => import('@/layout/index.vue'),
    path: '/',
    redirect: item.path,
    children: [
      {
        component: (resolve) => require([`@/views/${item.component}`], resolve),
        path: item.path
      }
    ]
  }
  return route
}