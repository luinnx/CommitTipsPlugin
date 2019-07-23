package com.luinnx.commit.model;

public enum ChangeType {


//    BUG("BUG","修改bug"),
//    MYBUG("自测","自己测试发现的bug"),
//    REQUIREMENT("需求","新增的需求"),
//    OPTIMIZE("优化","优化代码"),
//    BUILD("依赖", "影响构建系统或外部依赖项的更改:build.gradle、package.json、Podfile等"),
//    STYLE("样式修改","不影响代码功能的修改:XML样式、代码格式化等"),
//    PERF("性能优化","代码更改可以提高性能"),
//    TEST("测试代码","review别人代码的时候提交的commit"),
//    DOCS("文档", "只是修改了文档:注释、README.md等"),
//    REVIEW("REVIEW","review别人代码的时候提交的commit"),
//    OTHER("其他提交", "除以上所有类型之外的提交更改");

    BUG("BUG","修改bug"),
    REQUIREMENT("需求","新增的需求"),
    MYBUG("自测","自己测试发现的bug"),
    OPTIMIZE("优化","优化代码"),
    BUILD("依赖", "影响构建系统或外部依赖项的更改:build.gradle、package.json、Podfile等"),
    DOCS("文档", "只是修改了文档:注释、README.md等"),
    REVIEW("REVIEW","review别人代码的时候提交的commit"),
    OTHER("其他", "除以上所有类型之外的提交更改");

    public final String title;
    public final String description;

    ChangeType(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return String.format("%s - %s", this.title, this.description);
    }
}
