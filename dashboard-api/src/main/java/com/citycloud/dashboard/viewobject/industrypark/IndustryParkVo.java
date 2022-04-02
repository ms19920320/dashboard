package com.citycloud.dashboard.viewobject.industrypark;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author 孟帅
 * @since 2022-04-01
 */
@Data
@ApiModel("industry_park")
public class IndustryParkVo implements Serializable {
    public static final String ID = "id";
    public static final String NAME = "name";
    public static final String PROVINCE = "province";

    @ApiModelProperty(value = "主键")
    private Integer id;

    @ApiModelProperty(value = "名称", position = 1)
    private String name;

    @ApiModelProperty(value = "省", position = 2)
    private String province;

    @ApiModelProperty(value = "市", position = 3)
    private String city;

    @ApiModelProperty(value = "区/县", position = 4)
    private String area;
}
