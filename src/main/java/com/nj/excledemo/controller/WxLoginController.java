package com.nj.excledemo.controller;

import com.alibaba.fastjson.JSONObject;
import com.nj.excledemo.util.WeixinUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * 服务站登录
 */
@Controller
@RequestMapping("web")
public class WxLoginController {

    private String appId = "wxab5944013aa1dbbf";

    private String APPSECRET = "7fbe826bcf3690f13fe017e4f7876586";

    //进入登录
    @RequestMapping("/wxLogin")
    public String cjhd(Model model, @RequestParam(value = "setpId", required = false) Integer setpId) {

        //首先进行一次微信登录 通过后在跳转到登录页面

        return "https://open.weixin.qq.com/connect/oauth2/authorize?appid=wxab5944013aa1dbbf&redirect_uri=？？？&response_type=code&scope=snsapi_userinfo&state=123&connect_redirect=1#wechat_redirect;";
    }

    @RequestMapping("test")
    public void test(HttpServletRequest request) {
        String code = request.getParameter("code");
        System.out.println(code);
    }

    public static void main(String[] args) throws Exception {
        String url = "https://api.weixin.qq.com/sns/oauth2/access_token";

        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("appid", "wxab5944013aa1dbbf");
        paramMap.put("secret", "7fbe826bcf3690f13fe017e4f7876586");
        paramMap.put("code", "code");
        paramMap.put("grant_type", "authorization_code");

        JSONObject json;
        json = JSONObject.parseObject(WeixinUtil.sendGet(url, paramMap));
    }


}
