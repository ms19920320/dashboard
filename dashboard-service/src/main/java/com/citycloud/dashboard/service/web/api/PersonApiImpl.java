package com.citycloud.dashboard.service.web.api;

import com.citycloud.ccuap.web.api.annotation.ApiController;
import com.citycloud.ccuap.web.api.annotation.CommandMapping;
import com.citycloud.ccuap.web.api.annotation.QueryMapping;
import com.citycloud.ccuap.web.api.response.ApiResponse;
import com.citycloud.dashboard.api.PersonApi;
import com.citycloud.dashboard.parameter.command.person.CreatePersonCmd;
import com.citycloud.dashboard.parameter.command.person.DeletePersonCmd;
import com.citycloud.dashboard.parameter.command.person.UpdatePersonCmd;
import com.citycloud.dashboard.parameter.query.person.PersonListQuery;
import com.citycloud.dashboard.service.PersonService;
import com.citycloud.dashboard.viewobject.person.PersonVo;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * person类处理入口
 *
 * @author 孟帅
 * @date 2022-03-30
 */
@ApiController(path = "/person")
public class PersonApiImpl implements PersonApi {

  @Autowired private PersonService personService;

  @CommandMapping("/create")
  @Override
  public ApiResponse<Integer> create(CreatePersonCmd cmd) {
    Integer result = personService.create(cmd);
    return ApiResponse.successWithMsgAndData(result, 1000);
  }

  @CommandMapping("/update")
  @Override
  public ApiResponse<Integer> update(UpdatePersonCmd cmd) {
    Integer result = personService.update(cmd);
    return ApiResponse.successWithData(result);
  }

  @CommandMapping("/deleteById")
  @Override
  public ApiResponse<Integer> deleteById(DeletePersonCmd cmd) {
    Integer result = personService.deleteById(cmd.getId());
    return ApiResponse.successWithData(result);
  }

  @QueryMapping("/findById")
  @Override
  public ApiResponse<PersonVo> findById(Integer personId) {
    PersonVo personVo = personService.findById(personId);
    return ApiResponse.successWithData(personVo);
  }

  @QueryMapping(value = "/findListByPage", method = RequestMethod.POST)
  @Override
  public ApiResponse<PageInfo<PersonVo>> findListByPage(PersonListQuery listQuery) {
    PageInfo<PersonVo> personVoPageInfo = personService.findListByPage(listQuery);
    return ApiResponse.successWithData(personVoPageInfo);
  }
}
