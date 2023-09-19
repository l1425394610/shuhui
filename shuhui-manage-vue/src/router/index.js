import VueRouter from "vue-router"

import Layout from '@/layout'


const router = new VueRouter({
  routes: [
    {
      path: '/',
      component: () => import('../view/login/index.vue')
    },
    {
      path: '/loginSuccess',
      component: () => import('../view/loginSuccess/index.vue')
    },
    {
      path: '/home',
      component: Layout,
      redirect: '/home/index',
      children: [
        {
          path: '/home/index',
          component: () => import('../view/home/index.vue')
        }
      ]
    },
    {
      path: '/tourist',
      component: Layout,
      redirect: '/tourist/index',
      children: [
        {
          path: '/tourist/index',
          component: () => import('../view/tourist/index.vue')
        }
      ]
    },
    {
      path: '/admin',
      component: Layout,
      redirect: '/admin/index',
      children: [
        {
          path: '/admin/index',
          component: () => import('../view/admin/index.vue')
        }
      ]
    },
    {
      path: '/permission',
      component: Layout,
      children: [
        {
          path: 'role',
          component: () => import('../view/permission/role.vue')
        },
        {
          path: 'user',
          component: () => import('../view/permission/user.vue')
        }
      ]
    },

  ]

})

export default router