package com.nj.excledemo.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author 成小新
 * @Title: ReadApplicationUNtil
 * @ProjectName wechat
 * @Description: 获取yml配置文件的属性值
 * @date 2018/10/303:36 PM
 * @email zhaoboy9692@163.com
 */
@Component
//接收application.yml中的wechat下面的属性
@ConfigurationProperties(prefix = "wechat")
public class ReadApplicationUntil {
    private String token;
    private String appid;
    private String appsecret;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getAppsecret() {
        return appsecret;
    }

    public void setAppsecret(String appsecret) {
        this.appsecret = appsecret;
    }
}

