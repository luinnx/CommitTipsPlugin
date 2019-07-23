package com.luinnx.commit.model;

public enum BugFixedType {

    FIXED("已解决"),
    UNSOLVED("未解决"),
    BYDESIGN("设计如此"),
    DUPLICATE("重复提交"),
    EXTERNALCAUSE("外因造成"),
    UNABLETOREPRODUCE("无法再次复现"),
    AFTERFIX("以后解决"),
    CONNOTFIX("无法修复"),
    REJECTED("被否决");

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public  String type;

    BugFixedType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return getType();
    }
}
