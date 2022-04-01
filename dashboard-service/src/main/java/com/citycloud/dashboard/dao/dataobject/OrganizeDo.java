package com.citycloud.dashboard.dao.dataobject;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author sf
 * @date 2022-04-01
 */
@Data
@TableName("organize")
public class OrganizeDo {

  @TableId private String organizeId;

  /** 组织类型 */
  private Integer type;

  /** 组织名称 */
  private String name;

  /** 组织地址 */
  private String address;

  /** 组织电话 */
  private String tel;

  /** 组织简介 */
  private String intro;

  /** 组织官网 */
  private String web;

  /** 省 */
  private String province;

  /** 市 */
  private String city;

  /** 区 */
  private String area;
}
