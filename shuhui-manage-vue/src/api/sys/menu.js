import axios from '@/utils/request'

export function tree() {
  return axios({
    url: '/api/sysMenu/tree',
    method: 'GET'
  })
}

export function generateDynamicMenu(menuList, routes) {
  // for (let i = 0; i < menuList.length; i++) {
  //   // 创建顶级路由信息
  //   let route = getRoute(menuList[i])
  //   routes.push(route)
  //   // 判断是否有子路由
  //   if (menuList[i].children && menuList[i].children.length > 0) {
  //     generateDynamicMenu(menuList[i].children, route.children)
  //   }
  // }

  for (const item of menuList) {
    // 创建顶级路由信息
    let route = getRoute(item)
    routes.push(route)
    // 判断是否有子路由
    if (item.children && item.children.length > 0) {
      generateDynamicMenu(item.children, route.children)
    }
  }
}

function getRoute(item) {
  let route = {
    path: item.path,
    name: item.title,
    component: () => renderComponent(item.component),
    meta: {
      id: item.id,
      icon: item.icon,
      title: item.title
    },
    children: []
  }
  return route
}


function renderComponent(component) {
  if (component) {
    return (resolve) => require([`@/views${component}`], resolve)
  } else {
    return null
  }
}