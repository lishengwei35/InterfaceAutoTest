package com.course.utils;


import com.course.model.InterfaceName;

import java.util.Locale;
import java.util.ResourceBundle;

public class ConfigFile {

    //声明私有化静态方法，读取application文件
    private static ResourceBundle bundle = ResourceBundle.getBundle("application", Locale.CHINA);

    public static String getUrl(InterfaceName name){

        //获取请求头
        String testurl = bundle.getString("test.url");

        //声明访问的uri
        String Uri = "";

        //声明变量，用于装拼接完成的完整路径
        String Url = "";

        //根据传入的参数判断，然后赋值给Uri
        if (name == InterfaceName.LONGIN){
            Uri = bundle.getString("test.login.uri");
        }
        if (name == InterfaceName.USERINFO){

            Uri = bundle.getString("test.userinfo.uri");
        }

        // 最终拼接出来的完整访问路径
        Url = testurl + Uri;
        return Url;
    }




}
