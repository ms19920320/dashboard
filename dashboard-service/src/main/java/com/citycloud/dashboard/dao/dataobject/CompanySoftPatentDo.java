package com.citycloud.dashboard.dao.dataobject;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author MoliCode
 * @date 2022-03-31
 */
@Data
@TableName("company_soft_patent")
public class CompanySoftPatentDo {

  @TableId private Integer id;

  /** 组织ID */
  private String companyId;

  /** 专利ID */
  private String softPatentId;
}
