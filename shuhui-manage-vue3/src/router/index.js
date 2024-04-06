import * as VueRouter from 'vue-router'

const routes = [
  {
    path: '/',
    name: 'Home',
    component: () => import('@/layout/index.vue'),
    children:[
      {
        path:'/home',
        name:'home',
        component:() => import ('@/views/index.vue')
      }
    ]
  }
]

const router = VueRouter.createRouter({
  history:VueRouter.createWebHistory(),
  routes
})

export default router 