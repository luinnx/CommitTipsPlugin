package com.luinnx.commit;

import com.luinnx.commit.model.ChangeType;
import com.luinnx.commit.model.Commit;

import org.apache.commons.lang3.text.WordUtils;

import static org.apache.commons.lang.StringUtils.isNotBlank;

public class CommitMessage {
    private static final int MAX_LINE_LENGTH = 72; // https://stackoverflow.com/a/2120040/5138796
    private String mContent;

    public CommitMessage(Commit commit) {
        this.mContent = commitMsg(commit);
    }

    private String commitMsg(Commit commit){
        ChangeType changeType = commit.getChangeType();
        StringBuilder builder = new StringBuilder();
        if (changeType.equals(ChangeType.BUG)){
            if (commit.getBugId().contains("MTXX-")){
                builder.append(getChineseBracesJoinString("Bugfix-" + commit.getBugId()));
            } else {
                builder.append(getChineseBracesJoinString("Bugfix-MTXX-" + commit.getBugId()));
            }
            builder.append(WordUtils.wrap(commit.getSimple(), MAX_LINE_LENGTH));
            builder.append(System.lineSeparator());
            //解决结果
            builder.append(getChineseBracesJoinString("解决结果"));
            builder.append(commit.getBugFixedType().getType());
            builder.append(System.lineSeparator());
            //bug分析
            builder.append(getChineseBracesJoinString("BUG分析"));
            builder.append(commit.getBugAnalysisType().getAnalysis());
            builder.append(System.lineSeparator());
            //产生原因
            builder.append(getChineseBracesJoinString("产生原因"));
            builder.append(commit.getBugReason());
            builder.append(System.lineSeparator());
            //解决方案
            builder.append(getChineseBracesJoinString("解决方案"));
            builder.append(commit.getBugSolution());
            builder.append(System.lineSeparator());
            //BUG影响范围
            builder.append(getChineseBracesJoinString("BUG影响范围"));
            builder.append(commit.getBugScope());
            builder.append(System.lineSeparator());
            builder.append(commit.getDetail());

        } else {
            builder.append('[');
            builder.append(changeType.getTitle());
            builder.append(']');
            if (isNotBlank(commit.getRequirementId())) {
                builder.append(' ');
                if (commit.getRequirementId().contains("MTXX-")){
                    builder.append(commit.getRequirementId());
                } else {
                    builder.append("MTXX-" + commit.getRequirementId());
                }
            }
            if (isNotBlank(commit.getSimple())){
                builder
                        .append(' ')
                        .append(commit.getSimple());

            }
            if (isNotBlank(commit.getDetail())){
                builder.append(System.lineSeparator())
                        .append(System.lineSeparator())
                        .append(WordUtils.wrap(commit.getDetail(), MAX_LINE_LENGTH));
            }

        }
        return builder.toString();
    }


    /**
     *
     * @param "【" + content + "】" 类型字符串拼接
     * @return string
     */
    private String getChineseBracesJoinString(String content){
        return "【" + content + "】";
    }

    @Override
    public String toString() {
        return mContent;
    }
}