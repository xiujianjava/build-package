package com.xj.test1;

import java.util.ResourceBundle;

public class T {
    public static void main(String[] args) {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("pom");
//redis配置信息
        String host = resourceBundle.getString("profiles.active");//redis服务器host
        System.out.println("sdf");
        System.out.println(host);
    }
}