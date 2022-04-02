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
    public static final String ESTABLISH_DATE = "establish_date";
    public static final String PROVINCE = "province";
    public static final String CITY = "city";
    public static final String AREA = "area";

    @ApiModelProperty(value = "编号")
    private String companyId;

    @ApiModelProperty(value = "公司中文名称", position = 1)
    private String cnName;

    @ApiModelProperty(value = "公司英文名称", position = 2)
    private String enName;

    @ApiModelProperty(value = "公司注册时间", position = 3)
    private Date registerTime;

    @ApiModelProperty(value = "经营状态", position = 4)
    private String businessStatus;

    @ApiModelProperty(value = "经营范围", position = 5)
    private String businessScope;

    @ApiModelProperty(value = "经营期限", position = 6)
    private String businessPeriod;

    @ApiModelProperty(value = "所属区域", position = 7)
    private String belongArea;

    @ApiModelProperty(value = "注册资本", position = 8)
    private String capital;

    @ApiModelProperty(value = "实缴资本", position = 9)
    private String paidInCapital;

    @ApiModelProperty(value = "人员规模", position = 10)
    private String personnelScale;

    @ApiModelProperty(value = "法定代表人", position = 11)
    private String legalRepresent;

    @ApiModelProperty(value = "地址", position = 12)
    private String address;

    @ApiModelProperty(value = "统一社会新用代码", position = 13)
    private String newCode;

    @ApiModelProperty(value = "企业类型", position = 14)
    private String type;

    @ApiModelProperty(value = "核准日期", position = 15)
    private Date approvalDate;

    @ApiModelProperty(value = "成立日期", position = 16)
    private Date establishDate;

    @ApiModelProperty(value = "参保人数", position = 17)
    private String insuredPersons;

    @ApiModelProperty(value = "所属行业", position = 18)
    private String industry;

    @ApiModelProperty(value = "纳税人识别号", position = 19)
    private String tid;

    @ApiModelProperty(value = "登记机关", position = 20)
    private String registerAuthority;

    @ApiModelProperty(value = "组织机构代码", position = 21)
    private String organizeCode;

    @ApiModelProperty(value = "股权结构", position = 22)
    private String ownershipStructure;

    @ApiModelProperty(value = "省", position = 23)
    private String province;

    @ApiModelProperty(value = "市", position = 24)
    private String city;

    @ApiModelProperty(value = "区", position = 25)
    private String area;

    @ApiModelProperty(value = "产品", position = 26)
    private String product;
}
