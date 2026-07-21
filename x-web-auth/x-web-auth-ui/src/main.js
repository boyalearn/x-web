// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';
import App from './App'
import router from './router'
import axios from 'axios'
import {SessionManager} from "./components/SessionManager";

let sessionManager = new SessionManager(axios);
sessionManager.requestBefore();
sessionManager.responseAfter();

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
