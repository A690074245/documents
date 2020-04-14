package com.zy.documents.service;

import com.zy.documents.common.BaseResp;

public interface DocumentsService {
    BaseResp getCompanyUserList(String queryValue,int queryType,int pageNum,int pageSize);
}
