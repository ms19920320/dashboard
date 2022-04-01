package com.citycloud.dashboard.dao.dataobject;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author guopeng
 * @since 2022-03-30
 */
@Data
@TableName("person")
public class PersonDo {

  @TableId(type = IdType.AUTO)
  private Integer id;

  /** 姓名 */
  private String name;

  /** 年龄 */
  private Integer age;
}
