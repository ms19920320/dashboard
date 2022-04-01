package com.citycloud.dashboard.viewobject.company;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 孟帅
 * @since 2022-03-31
 */
@Data
@ApiModel("company")
public class CompanyVo implements Serializable {

  @ApiModelProperty(value = "编号")
  private String companyId;

  @ApiModelProperty(value = "公司中文名称")
  private String cnName;

  @ApiModelProperty(value = "公司英文名称")
  private String enName;

  @ApiModelProperty(value = "公司注册时间")
  private Date registerTime;

  @ApiModelProperty(value = "经营状态")
  private String businessStatus;

  @ApiModelProperty(value = "经营范围")
  private String businessScope;

  @ApiModelProperty(value = "经营期限")
  private String businessPeriod;

  @ApiModelProperty(value = "所属区域")
  private String belongArea;

  @ApiModelProperty(value = "注册资本")
  private String capital;

  @ApiModelProperty(value = "实缴资本")
  private String paidInCapital;

  @ApiModelProperty(value = "人员规模")
  private String personnelScale;

  @ApiModelProperty(value = "法定代表人")
  private String legalRepresent;

  @ApiModelProperty(value = "地址")
  private String address;

  @ApiModelProperty(value = "统一社会新用代码")
  private String newCode;

  @ApiModelProperty(value = "企业类型")
  private String type;

  @ApiModelProperty(value = "核准日期")
  private Date approvalDate;

  @ApiModelProperty(value = "成立日期")
  private Date establishDate;

  @ApiModelProperty(value = "参保人数")
  private String insuredPersons;

  @ApiModelProperty(value = "所属行业")
  private String industry;

  @ApiModelProperty(value = "纳税人识别号")
  private String tid;

  @ApiModelProperty(value = "登记机关")
  private String registerAuthority;

  @ApiModelProperty(value = "组织机构代码")
  private String organizeCode;

  @ApiModelProperty(value = "股权结构")
  private String ownershipStructure;

  @ApiModelProperty(value = "省")
  private String province;

  @ApiModelProperty(value = "市")
  private String city;

  @ApiModelProperty(value = "区")
  private String area;

  @ApiModelProperty(value = "产品")
  private String product;
}
