package com.github.liangyunfeng.mvvm.bindingmethod;

public class Util {
    public static String displayPassowrdText(String text) {
        if (text == null) {
            return null;
        }
        String s = "";
        for (int i = 0; i < text.length(); i++) {
            s = s + "*";
        }
        return s;
    }
}
