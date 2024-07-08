package com.example.demofeignclientms.utils;

public class TextoUtil {
    public static boolean validarString(String str){
        if (str != null && !str.isEmpty() && !str.isBlank()){
            return true;
        }
        return false;
    }
}
