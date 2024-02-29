package com.example.app.config.enums;

import com.example.app.config.enums.urls.UsersURL;

public class UrlValidator {
    public static void doValidate(String path,String method){
        UsersURL urls;
        int version = Integer.parseInt(path.substring(path.indexOf("v"),path.indexOf("v")+2));
        String mainPath = path.substring(0,path.lastIndexOf("/"));
        String lastPath = path.substring(path.lastIndexOf("/"),path.length()-1);




    }
    private boolean validateVersion(String method,int version) {

        return true;
    }
}
