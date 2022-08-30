package com.xweb.auth.server.ui;

import java.util.ArrayList;
import java.util.List;

public class FromUtil {


    private static final String TENANT = "tenants";

    private static final String CLIENT = "clients";

    private static final String USER = "users";

    private static final String ROLE = "roles";

    private static final String RESOURCE = "resources";


    public static List<FormInfo> buildForm(String type) {

        List<FormInfo> list = null;

        switch (type) {
            case TENANT:
                list = buildTenant();
                break;
            case CLIENT:
                list = buildClient();
                break;
            case USER:
                list = buildUser();
                break;
            case ROLE:
                list = buildRole();
                break;
            case RESOURCE:
                list = buildResource();
                break;
        }
        return list;
    }

    private static List<FormInfo> buildResource() {
        List<FormInfo> list = new ArrayList<>();
        FormInfo formInfo;
        formInfo = new FormInfo();
        formInfo.setName("name");
        formInfo.setText("资源名");
        formInfo.setTip("请添加租户名称");
        formInfo.setVerify("");
        list.add(formInfo);
        formInfo = new FormInfo();
        formInfo.setName("code");
        formInfo.setText("编码");
        formInfo.setTip("请添加编码");
        formInfo.setVerify("");
        list.add(formInfo);
        formInfo = new FormInfo();
        formInfo.setName("description");
        formInfo.setText("描述");
        formInfo.setTip("请添加描述");
        formInfo.setVerify("");
        list.add(formInfo);
        return list;
    }

    private static List<FormInfo> buildRole() {
        List<FormInfo> list = new ArrayList<>();
        FormInfo formInfo;
        formInfo = new FormInfo();
        formInfo.setName("name");
        formInfo.setText("角色名");
        formInfo.setTip("请添加角色名称");
        formInfo.setVerify("");
        list.add(formInfo);
        formInfo = new FormInfo();
        formInfo.setName("code");
        formInfo.setText("角色编码");
        formInfo.setTip("请添加角色编码");
        formInfo.setVerify("");
        list.add(formInfo);
        formInfo = new FormInfo();
        formInfo.setName("description");
        formInfo.setText("角色描述");
        formInfo.setTip("请添加角色描述");
        formInfo.setVerify("");
        list.add(formInfo);
        return list;
    }

    public static List<FormInfo> buildTenant() {
        List<FormInfo> list = new ArrayList<>();
        FormInfo formInfo;
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
        FormInfo formInfo;
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
        FormInfo formInfo;
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
