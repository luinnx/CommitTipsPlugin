package com.luinnx.commit;

import com.luinnx.commit.model.ChangeType;

enum TipsType {
    BUG(ChangeType.BUG, genBugTips()),
    REQUIREMENT(ChangeType.REQUIREMENT,"")
    ;

    public ChangeType tipsType;
    public String tips;
    TipsType(ChangeType tipsType, String tips) {
        this.tipsType = tipsType;
        this.tips = tips;
    }

    public ChangeType getTipsType() {
        return tipsType;
    }

    public String getTips() {
        return tips;
    }

    private static String genBugTips(){
        String tips =
                "[解决结果] 描述解决结果, 有固定选项,  默认为已解决\n" +
                "[BUG分析] 描述BUG产生阶段, 有固定选项, 默认为无\n" +
                "[产生原因] 描述产生原因, 无默认\n" +
                "[解决方案] 描述解决方案, 无默认\n" +
                "[BUG影响范围] 描述影响了哪些模块, 无默认\n" +
                "[备注] 描述备注, 非必填, 无默认";
        return tips;
    }

}
