package com.luinnx.commit.model;

public enum BugAnalysisType {
    E("开发bug"),
    Q("历史版本漏测"),
    W("当前版本漏测"),
    R("文档bug"),
    T("外因"),
    Y("设计如此"),
    U("业务组件"),
    I("相机SDK"),
    O("底层"),
    P("无效log"),
    A("不是bug"),
    S("重复bug"),
    D("修改引发")
    ;

    public String getAnalysis() {
        return analysis;
    }

    public String analysis;
    BugAnalysisType(String analysis) {
        this.analysis = analysis;
    }

    @Override
    public String toString() {
        return getAnalysis();
    }
}
