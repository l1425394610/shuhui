import { router } from './index'
import { tree, generateDynamicMenu } from '@/api/sys/menu'

// router.beforeEach((to, from, next) => {
//   console.log('123')

//   tree().then(res => {
//     const menuRouter = []
//     generateDynamicMenu(res.data.data, menuRouter)

//     router.addRoutes(menuRouter)
//     console.log(router.getRoutes());
//   })

// })