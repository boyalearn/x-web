import Vue from 'vue'
import Router from 'vue-router'
import Business from '@/components/Business'
import Login from '@/components/Login'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      redirect: 'business/home'
    },
    {
      path: '/business',
      name: 'Business',
      component: Business,
      children: [
        {
          path: 'home',
          name: 'Home',
          components: {
            business: () => import('@/components/business/Home')
          },
        },
        {
          path: 'tenant',
          name: 'Tenant',
          components: {
            business: () => import('@/components/business/Tenant')
          },
        },
        {
          path: 'client',
          name: 'lient',
          components: {
            business: () => import('@/components/business/Client')
          }
        },
        {
          path: 'user',
          name: 'User',
          components: {
            business: () => import('@/components/business/User')
          }
        }
      ]
    },
    {
      path: '/login',
      name: 'Login',
      component: Login,
    }
  ]
})
