package com.citycloud.dashboard.dao.dataobject;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author sf
 * @date 2022-04-01
 */
@Data
@TableName("personnel")
public class PersonnelDo {

  @TableId private String personnelId;

  /** 人才姓名 */
  private String name;

  /** 人才简介 */
  private String intro;

  /** 人才领域 */
  private String field;

  /** 人才关联关系 */
  private String relation;
}
