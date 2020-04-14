package com.zy.documents.dao;

import com.zy.documents.domain.DocumentsInit;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface InitMapper {
    List<DocumentsInit> getCompanyUserList(@Param("queryValue")String queryValue,@Param("queryType")int queryType);
}
