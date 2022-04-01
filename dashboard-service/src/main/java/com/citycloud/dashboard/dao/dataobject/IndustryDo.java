package com.citycloud.dashboard.dao.dataobject;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author MoliCode
 * @since 2022-03-31
 */
@Data
@TableName("industry")
public class IndustryDo {

  @TableId private String industryId;

  /** 产业名称 */
  private String name;

  /** 父级产业编号 */
  private String parentId;

  /** 层级，01-电机产业链 */
  private String hierarchy;

  /** 处于产业位置 */
  private String position;
}
