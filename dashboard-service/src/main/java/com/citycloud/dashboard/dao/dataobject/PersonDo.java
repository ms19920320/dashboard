package com.citycloud.dashboard.dao.dataobject;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author guopeng
 * @date 2022-03-30
 */
@Data
@TableName("person")
public class PersonDo {

  @TableId private Integer id;

  /** 姓名 */
  private String name;

  /** 年龄 */
  private Integer age;
}
