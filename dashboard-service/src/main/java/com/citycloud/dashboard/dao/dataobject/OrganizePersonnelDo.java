package com.citycloud.dashboard.dao.dataobject;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author sf
 * @date 2022-04-01
 */
@Data
@TableName("organize_personnel")
public class OrganizePersonnelDo {

  @TableId private Integer id;

  /** 组织ID */
  private String organizeId;

  /** 人才ID */
  private String personnelId;
}
