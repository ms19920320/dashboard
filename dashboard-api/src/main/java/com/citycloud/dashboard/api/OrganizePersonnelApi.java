package com.citycloud.dashboard.api;

import com.citycloud.ccuap.web.api.annotation.ApiDomain;
import com.citycloud.ccuap.web.api.response.ApiResponse;
import com.citycloud.dashboard.parameter.command.organizepersonnel.CreateOrganizePersonnelCmd;
import com.citycloud.dashboard.parameter.command.organizepersonnel.UpdateOrganizePersonnelCmd;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author sf
 * @date 2022-04-01
 */
@Api(tags = "组织和人才关联表接口")
public interface OrganizePersonnelApi {
}
