import ElementUI from "element-ui";
import router from "../router";

class SessionManager{

  constructor(api) {
    this.api = api;
  }

  requestBefore(){
    this.api.interceptors.request.use(config => {
      let token = sessionStorage.getItem('token');
      if (null != token && config.url.indexOf("oauth") < 0) {
        config.headers["Content-Type"] = 'application/json;charset=UTF-8'
        config.headers['x-access-token'] = sessionStorage.getItem('token')
      }
      return config
    });
  }

  responseAfter(){
    this.api.interceptors.response.use((response) => {
      console.log("response.data",response.data)
      if ("token error" == response.data.message) {
        router.push({
          path: "/login"
        });
      } else if ("0000" != response.data.code && response.data.access_token == null) {
        ElementUI.Notification.error({
          title: '错误',
          message: response.data.message,
        });
        return Promise.reject()
      }
      return response
    })
  }
}

export {SessionManager}
