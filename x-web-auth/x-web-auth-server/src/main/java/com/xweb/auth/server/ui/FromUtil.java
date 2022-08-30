package com.xweb.auth.server.ui;

import java.util.ArrayList;
import java.util.List;

public class FromUtil {


    private static final String TENANT = "tenant";


    public static List<FormInfo> buildForm(String type) {

        List<FormInfo> list = null;

        switch (type) {
            case TENANT:
                list = buildTenant();
                break;
        }
        return list;
    }

    public static List<FormInfo> buildTenant() {
        List<FormInfo> list = new ArrayList<>();
        FormInfo formInfo = new FormInfo();
        formInfo = new FormInfo();
        formInfo.setName("name");
        formInfo.setText("租户名");
        formInfo.setTip("请添加租户名称");
        formInfo.setVerify("nikename");
        list.add(formInfo);
        formInfo = new FormInfo();
        formInfo.setName("description");
        formInfo.setText("描述");
        formInfo.setTip("描述");
        formInfo.setVerify("");
        list.add(formInfo);
        return list;
    }

    public static List<FormInfo> buildUser() {
        List<FormInfo> list = new ArrayList<>();
        FormInfo formInfo = new FormInfo();
        formInfo = new FormInfo();
        formInfo.setName("account");
        formInfo.setText("账号");
        formInfo.setTip("请填写账号");
        formInfo.setVerify("phone");
        list.add(formInfo);
        formInfo = new FormInfo();
        formInfo.setName("name");
        formInfo.setText("姓名");
        formInfo.setTip("请填写姓名");
        formInfo.setVerify("");
        list.add(formInfo);
        formInfo = new FormInfo();
        formInfo.setName("password");
        formInfo.setText("密码");
        formInfo.setTip("请填写密码");
        formInfo.setVerify("");
        list.add(formInfo);
        return list;
    }
    public static List<FormInfo> buildClient() {
        List<FormInfo> list = new ArrayList<>();
        FormInfo formInfo = new FormInfo();
        formInfo = new FormInfo();
        formInfo.setName("name");
        formInfo.setText("应用名称");
        formInfo.setTip("请填写应用名称");
        formInfo.setVerify("name");
        list.add(formInfo);
        formInfo = new FormInfo();
        formInfo.setName("authorized_grant_types");
        formInfo.setText("授权");
        formInfo.setTip("请填写授权");
        formInfo.setVerify("");
        list.add(formInfo);
        formInfo = new FormInfo();
        formInfo.setName("redirect_uris");
        formInfo.setText("授权地址");
        formInfo.setTip("多个授权地址用，分割");
        formInfo.setVerify("");
        list.add(formInfo);
        formInfo = new FormInfo();
        formInfo.setName("scope");
        formInfo.setText("授权范围");
        formInfo.setTip("多个授权用，分割");
        formInfo.setVerify("");
        list.add(formInfo);
        return list;
    }
}
