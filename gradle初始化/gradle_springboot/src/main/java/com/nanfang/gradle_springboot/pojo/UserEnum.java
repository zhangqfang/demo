package com.nanfang.gradle_springboot.pojo;

public enum UserEnum {
    SIX_MAN (1,"男"),
    SIX_WOMAN(0,"女");
    int code;
   String value;

    UserEnum(int code, String dec) {
        this.code = code;
        this.value = dec;
    }

    public int getCode() {
        return code;
    }

    public String getSix() {
        return value;
    }
}
