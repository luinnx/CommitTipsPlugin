package com.luinnx.commit.model;

/**
 * 提交类型实体
 */
public class Commit {

    /**
     * 提交类型
     */
    private ChangeType mChangeType;

    /**
     * Bug id
     */
    private String mBugId;

    /**
     * Bug解决结果
     */
    private BugFixedType mBugFixedType;

    /**
     * Bug分析
     */
    private BugAnalysisType mBugAnalysisType;

    /**
     * 需求id
     */
    private String mRequirementId;

    /**
     * 简单描述
     */
    private String mSimple;

    /**
     * Bug原因
     */
    private String mBugReason;

    /**
     * Bug解决方式
     */
    private String mBugSolution;

    /**
     * Bug 影响范围
     */
    private String mBugScope;

    /**
     * 详细描述
     */
    private String mDetail;



    public Commit(ChangeType changeType, String bugId, BugFixedType bugFixedType, BugAnalysisType bugAnalysisType, String requirementId, String simple, String bugReason, String bugSolution, String bugScope, String detail) {
        mChangeType = changeType;
        mBugId = bugId;
        mBugFixedType = bugFixedType;
        mBugAnalysisType = bugAnalysisType;
        mRequirementId = requirementId;
        mSimple = simple;
        mBugReason = bugReason;
        mBugSolution = bugSolution;
        mBugScope = bugScope;
        mDetail = detail;
    }

    public ChangeType getChangeType() {
        return mChangeType;
    }

    public void setChangeType(ChangeType changeType) {
        mChangeType = changeType;
    }

    public String getBugId() {
        return mBugId;
    }

    public void setBugId(String bugId) {
        mBugId = bugId;
    }

    public BugFixedType getBugFixedType() {
        return mBugFixedType;
    }

    public void setBugFixedType(BugFixedType bugFixedType) {
        mBugFixedType = bugFixedType;
    }

    public BugAnalysisType getBugAnalysisType() {
        return mBugAnalysisType;
    }

    public void setBugAnalysisType(BugAnalysisType bugAnalysisType) {
        mBugAnalysisType = bugAnalysisType;
    }

    public String getRequirementId() {
        return mRequirementId;
    }

    public void setRequirementId(String requirementId) {
        mRequirementId = requirementId;
    }

    public String getSimple() {
        return mSimple;
    }

    public void setSimple(String simple) {
        mSimple = simple;
    }

    public String getBugReason() {
        return mBugReason;
    }

    public void setBugReason(String bugReason) {
        mBugReason = bugReason;
    }

    public String getBugSolution() {
        return mBugSolution;
    }

    public void setBugSolution(String bugSolution) {
        mBugSolution = bugSolution;
    }

    public String getBugScope() {
        return mBugScope;
    }

    public void setBugScope(String bugScope) {
        mBugScope = bugScope;
    }

    public String getDetail() {
        return mDetail;
    }

    public void setDetail(String detail) {
        mDetail = detail;
    }
}
