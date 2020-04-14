package com.zy.documents.controller;

import com.zy.documents.common.BaseResp;
import com.zy.documents.service.DocumentsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author JackyZhao
 * @date 2020/4/11 14:09
 */
@RestController
@RequestMapping("/api/documents")
@Api(tags = "全部接口")
public class DocumentsController {

    @Autowired
    private DocumentsService documentsService;

    @GetMapping("/company_user_list")
    @ApiOperation(value="查询公司或员工列表", notes="")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "queryValue", value = "模糊查询名称或编号", required = false, dataType = "string"),
            @ApiImplicitParam(name = "queryType", value = "1查客户，2查员工", required = false, dataType = "int"),
            @ApiImplicitParam(name = "pageNum", value = "当前页", required = false, dataType = "int"),
            @ApiImplicitParam(name = "pageSize", value = "每页的数量", required = false, dataType = "int")}
    )
    public BaseResp getCompanyUserList(@RequestParam(name = "queryValue",defaultValue = "")String queryValue,
                                         @RequestParam(name = "queryType",defaultValue = "1")int queryType,
                                         @RequestParam(name = "pageNum",defaultValue = "1")int pageNum,
                                         @RequestParam(name = "pageSize",defaultValue = "10")int pageSize){
            return documentsService.getCompanyUserList(queryValue,queryType,pageNum,pageSize);
    }
}
