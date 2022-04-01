package com.citycloud.dashboard.parameter.command.company;

import com.citycloud.ccuap.web.api.parameter.ICommand;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @author 孟帅
 * @since 2022-03-31
 */
@Data
@ApiModel("更新null命令")
public class UpdateCompanyCmd implements ICommand {

  private static final long serialVersionUID = -6105662518559738487L;

  /** 编号 */
  @ApiModelProperty(value = "编号", required = true)
  @NotBlank(message = "[9000,{编号}]")
  private String companyId;

  /** 公司中文名称 */
  @ApiModelProperty(value = "公司中文名称", required = true)
  @NotBlank(message = "[9000,{公司中文名称}]")
  private String cnName;

  /** 公司英文名称 */
  @ApiModelProperty(value = "公司英文名称")
  @NotBlank(message = "[9000,{公司英文名称}]")
  private String enName;

  /** 公司注册时间 */
  @ApiModelProperty(value = "公司注册时间")
  @NotNull(message = "[9000,{公司注册时间}]")
  private Date registerTime;

  /** 经营状态 */
  @ApiModelProperty(value = "经营状态")
  @NotBlank(message = "[9000,{经营状态}]")
  private String businessStatus;

  /** 经营范围 */
  @ApiModelProperty(value = "经营范围")
  @NotBlank(message = "[9000,{经营范围}]")
  private String businessScope;

  /** 经营期限 */
  @ApiModelProperty(value = "经营期限")
  @NotBlank(message = "[9000,{经营期限}]")
  private String businessPeriod;

  /** 所属区域 */
  @ApiModelProperty(value = "所属区域")
  @NotBlank(message = "[9000,{所属区域}]")
  private String belongArea;

  /** 注册资本 */
  @ApiModelProperty(value = "注册资本")
  @NotBlank(message = "[9000,{注册资本}]")
  private String capital;

  /** 实缴资本 */
  @ApiModelProperty(value = "实缴资本")
  @NotBlank(message = "[9000,{实缴资本}]")
  private String paidInCapital;

  /** 人员规模 */
  @ApiModelProperty(value = "人员规模")
  @NotBlank(message = "[9000,{人员规模}]")
  private String personnelScale;

  /** 法定代表人 */
  @ApiModelProperty(value = "法定代表人")
  @NotBlank(message = "[9000,{法定代表人}]")
  private String legalRepresent;

  /** 地址 */
  @ApiModelProperty(value = "地址")
  @NotBlank(message = "[9000,{地址}]")
  private String address;

  /** 统一社会新用代码 */
  @ApiModelProperty(value = "统一社会新用代码")
  @NotBlank(message = "[9000,{统一社会新用代码}]")
  private String newCode;

  /** 企业类型 */
  @ApiModelProperty(value = "企业类型")
  @NotBlank(message = "[9000,{企业类型}]")
  private String type;

  /** 核准日期 */
  @ApiModelProperty(value = "核准日期")
  @NotNull(message = "[9000,{核准日期}]")
  private Date approvalDate;

  /** 成立日期 */
  @ApiModelProperty(value = "成立日期")
  @NotNull(message = "[9000,{成立日期}]")
  private Date establishDate;

  /** 参保人数 */
  @ApiModelProperty(value = "参保人数")
  @NotBlank(message = "[9000,{参保人数}]")
  private String insuredPersons;

  /** 所属行业 */
  @ApiModelProperty(value = "所属行业", required = true)
  @NotBlank(message = "[9000,{所属行业}]")
  private String industry;

  /** 纳税人识别号 */
  @ApiModelProperty(value = "纳税人识别号")
  @NotBlank(message = "[9000,{纳税人识别号}]")
  private String tid;

  /** 登记机关 */
  @ApiModelProperty(value = "登记机关")
  @NotBlank(message = "[9000,{登记机关}]")
  private String registerAuthority;

  /** 组织机构代码 */
  @ApiModelProperty(value = "组织机构代码")
  @NotBlank(message = "[9000,{组织机构代码}]")
  private String organizeCode;

  /** 股权结构 */
  @ApiModelProperty(value = "股权结构")
  @NotBlank(message = "[9000,{股权结构}]")
  private String ownershipStructure;

  /** 省 */
  @ApiModelProperty(value = "省")
  @NotBlank(message = "[9000,{省}]")
  private String province;

  /** 市 */
  @ApiModelProperty(value = "市")
  @NotBlank(message = "[9000,{市}]")
  private String city;

  /** 区 */
  @ApiModelProperty(value = "区")
  @NotBlank(message = "[9000,{区}]")
  private String area;

  /** 产品 */
  @ApiModelProperty(value = "产品")
  @NotBlank(message = "[9000,{产品}]")
  private String product;
}
