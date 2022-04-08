package com.citycloud.dashboard.dao.dataobject;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Date;

/**
 * @author sf
 * @date 2022-04-01
 */
@Data
@TableName("soft_patent")
public class SoftPatentDo {
    public static final String TYPE = "type";
    public static final String SOFT_PATENT_ID = "soft_patent_id";


    @TableId
    private String softPatentId;

    /**
     * 专利/软著名称
     */
    private String name;

    /**
     * 类型
     */
    private Integer type;

    /**
     * 专利/软著编号
     */
    private String code;

    /**
     * 日期
     */
    private Date date;

    public enum Type {
        PATENT("专利"),

        SOFT("软著");

        private String type;

        Type(String type) {
            this.type = type;
        }

      public String getType() {
        return type;
      }

      public void setType(String type) {
        this.type = type;
      }
    }
}
