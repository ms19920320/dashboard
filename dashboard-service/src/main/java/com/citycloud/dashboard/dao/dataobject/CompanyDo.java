package com.citycloud.dashboard.dao.dataobject;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * @author MoliCode
 * @since 2022-03-31
 */
@Data
@TableName("company")
public class CompanyDo {

  @TableId private String companyId;

  /** 公司中文名称 */
  private String cnName;

  /** 公司英文名称 */
  private String enName;

  /** 公司注册时间 */
  private Date registerTime;

  /** 经营状态 */
  private String businessStatus;

  /** 经营范围 */
  private String businessScope;

  /** 经营期限 */
  private String businessPeriod;

  /** 所属区域 */
  private String belongArea;

  /** 注册资本 */
  private String capital;

  /** 实缴资本 */
  private String paidInCapital;

  /** 人员规模 */
  private String personnelScale;

  /** 法定代表人 */
  private String legalRepresent;

  /** 地址 */
  private String address;

  /** 统一社会新用代码 */
  private String newCode;

  /** 企业类型 */
  private String type;

  /** 核准日期 */
  private Date approvalDate;

  /** 成立日期 */
  private Date establishDate;

  /** 参保人数 */
  private String insuredPersons;

  /** 纳税人识别号 */
  private String tid;

  /** 登记机关 */
  private String registerAuthority;

  /** 组织机构代码 */
  private String organizeCode;

  /** 股权结构 */
  private String ownershipStructure;

  /** 省 */
  private String province;

  /** 市 */
  private String city;

  /** 区 */
  private String area;

  /** 产品 */
  private String product;
}
