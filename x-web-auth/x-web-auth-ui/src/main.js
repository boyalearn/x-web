// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';
import App from './App'
import router from './router'
import axios from 'axios'

axios.interceptors.request.use(config => {
  // 为请求头添加x-access-token字段为服务端返回的token
  if (config.url.indexOf("oauth") < 0) {
    config.headers["Content-Type"] = 'application/json;charset=UTF-8'
    config.headers['x-access-token'] = sessionStorage.getItem('token')
  }

  // return config是固定用法 必须有返回值
  return config
});
axios.interceptors.request.use(config => {
  // 为请求头添加x-access-token字段为服务端返回的token
  var token = sessionStorage.getItem('token');
  if (null == token) {
    router.push("/login").catch(error=>{
      console.log("error",error)
    })
  }
  config.headers['x-access-token'] = sessionStorage.getItem('token')
  // return config是固定用法 必须有返回值
  return config
});
axios.interceptors.response.use((config) => {
  console.log("config.data",config.data)
  if ("token error" == config.data.message) {
    router.push({
      path: "/login"
    });
  } else if ("0000" != config.data.code && config.data.access_token == null) {
    ElementUI.Notification.error({
      title: '错误',
      message: config.data.message,
    });
    return Promise.reject()
  }
  return config
}, (error) => {
  return Promise.reject(error)
})
Vue.prototype.$axios = axios
Vue.filter('limitContext', function (cellValue, num) {
  if (!cellValue) return "";
  if (cellValue.length > num) {
    return cellValue.slice(0, num - 1) + "...";
  }
  return cellValue;
})

Vue.use(ElementUI);
Vue.config.productionTip = false

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  components: {App},
  template: '<App/>',
  render: h => h(App)
})
