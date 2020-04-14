package com.zy.documents.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @author JackyZhao
 * @date 2020/4/11 15:49
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DocumentsInit implements Serializable {
    private String id;
    private String checkCode;  //校验码
    private Date createDate;
    private String initName;
    private String status;  //0停用，1启用，2删除
    private String code;
    private String createUnionId;
    private Date updateDate;
    private int initType;  //1为公司，2为员工
}
