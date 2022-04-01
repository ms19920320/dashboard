package com.citycloud.dashboard.dao.dataobject;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author sf
 * @date 2022-04-01
 */
@Data
@TableName("soft_patent")
public class SoftPatentDo {

  @TableId private String softPatentId;

  /** 专利/软著名称 */
  private String name;

  /** 类型 */
  private Integer type;

  /** 专利/软著编号 */
  private String code;

  /** 日期 */
  private java.sql.Timestamp date;
}
