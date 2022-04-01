package com.citycloud.dashboard.dao.dataobject;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author MoliCode
 * @date 2022-04-01
 */
@Data
@TableName("industry_park")
public class IndustryParkDo {

  @TableId private Integer id;

  /** 名称 */
  private String name;

  /** 省 */
  private String province;

  /** 市 */
  private String city;

  /** 区/县 */
  private String area;
}
