package com.course.config;

import org.apache.http.client.CookieStore;
import org.apache.http.impl.client.DefaultHttpClient;

public class TestConfig {
    // 声明静态变量，用于装拼接后的完整访问url
    public static String loginurl;
    public static String userinfourl;

    //声明静态对象 用于http请求
    public static DefaultHttpClient defaultHttpClient;

    //声明静态方法，用于存储cookies
    public static CookieStore store;

}
