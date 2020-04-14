package com.zy.documents.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @author JackyZhao
 * @date 2020/4/11 15:51
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DocumentsUser implements Serializable {
    private String id;
    private String code;
    private String telephone;
    private String unionId;
    private Date createDate;
    private int userStatus; //0停用，1启用，2删除
    private int userType;  //1为客户，2为员工
}
