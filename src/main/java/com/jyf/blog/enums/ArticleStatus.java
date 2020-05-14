package com.jyf.blog.enums;


public enum ArticleStatus {

    PUBLISH(1,"已发布"),
    DRAFT(0,"草稿");

    ArticleStatus(int value,String message){
        this.value=value;
        this.message=message;
    }

    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String message;


}
