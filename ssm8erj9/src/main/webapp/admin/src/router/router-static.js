import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import youxileibie from '@/views/modules/youxileibie/list'
    import zhanghaotuihuo from '@/views/modules/zhanghaotuihuo/list'
    import news from '@/views/modules/news/list'
    import zhanneilianxi from '@/views/modules/zhanneilianxi/list'
    import maijia from '@/views/modules/maijia/list'
    import yonghu from '@/views/modules/yonghu/list'
    import yonghupingjia from '@/views/modules/yonghupingjia/list'
    import maijiapingjia from '@/views/modules/maijiapingjia/list'
    import storeup from '@/views/modules/storeup/list'
    import jiaoyidingdan from '@/views/modules/jiaoyidingdan/list'
    import config from '@/views/modules/config/list'
    import youxizhanghao from '@/views/modules/youxizhanghao/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/youxileibie',
        name: '游戏类别',
        component: youxileibie
      }
      ,{
	path: '/zhanghaotuihuo',
        name: '账号退货',
        component: zhanghaotuihuo
      }
      ,{
	path: '/news',
        name: '系统公告',
        component: news
      }
      ,{
	path: '/zhanneilianxi',
        name: '站内联系',
        component: zhanneilianxi
      }
      ,{
	path: '/maijia',
        name: '卖家',
        component: maijia
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/yonghupingjia',
        name: '用户评价',
        component: yonghupingjia
      }
      ,{
	path: '/maijiapingjia',
        name: '卖家评价',
        component: maijiapingjia
      }
      ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
      ,{
	path: '/jiaoyidingdan',
        name: '交易订单',
        component: jiaoyidingdan
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/youxizhanghao',
        name: '游戏账号',
        component: youxizhanghao
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
