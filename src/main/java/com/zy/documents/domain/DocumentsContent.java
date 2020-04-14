package com.zy.documents.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @author JackyZhao
 * @date 2020/4/11 15:53
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DocumentsContent implements Serializable {
    private String id;
    private int contentStatus;  //0未处理，1正在处理，2已完成
    private String content;
    private String followUser;  //跟进人
    private String createUser;
    private Date createDate;
    private Date followDate;
    private Date finishDate;
    private String code;
}
