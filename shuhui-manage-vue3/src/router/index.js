import * as VueRouter from 'vue-router'

const routes = [
  // {
  //   path: '/',
  //   name: 'Home',
  //   component: () => import('@/layout/index.vue'),
  //   children:[
  //     {
  //       path:'/home',
  //       name:'home',
  //       component:() => import ('@/views/index.vue')
  //     }
  //   ]
  // }
  {
    path: '/',
    redirect: '/index'
  },
  {
    path: '/index',
    component: () => import('@/layout/index.vue'),
    children:[
      {
        path:'/a',
        component: () => import('@/views/a.vue')
      },
      {
        path: '/b',
        component: () => import('@/views/b.vue')
      }
    ]
  }
]

const router = VueRouter.createRouter({
  history: VueRouter.createWebHistory(),
  routes
})

export default router 