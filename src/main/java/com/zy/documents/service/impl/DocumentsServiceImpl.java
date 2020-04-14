package com.zy.documents.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zy.documents.common.BaseResp;
import com.zy.documents.dao.InitMapper;
import com.zy.documents.domain.DocumentsInit;
import com.zy.documents.service.DocumentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author JackyZhao
 * @date 2020/4/11 15:28
 */
@Service("documentsService")
public class DocumentsServiceImpl implements DocumentsService {

    @Autowired
    private InitMapper initMapper;
    @Override
    public BaseResp getCompanyUserList(String queryValue, int queryType, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<DocumentsInit> list =  initMapper.getCompanyUserList(queryValue,queryType);
        return new BaseResp(new PageInfo<>(list));
    }
}
