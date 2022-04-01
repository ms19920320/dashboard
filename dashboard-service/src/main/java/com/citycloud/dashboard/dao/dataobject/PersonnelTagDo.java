package com.citycloud.dashboard.dao.dataobject;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author sf
 * @date 2022-04-01
 */
@Data
@TableName("personnel_tag")
public class PersonnelTagDo {

  @TableId private Integer id;

  /** 人才编号 */
  private String personnelId;

  /** 产业编号 */
  private String industryId;
}
