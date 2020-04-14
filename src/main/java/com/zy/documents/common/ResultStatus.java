package com.zy.documents.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 错误码
 * @author Administrator
 *
 */
public enum  ResultStatus {
	 // -1为通用失败（根据ApiResult.java中的构造方法注释而来）
    FAIL(-1, "common fail"),
    // 0为成功
    SUCCESS(0, "success"),
    error_no_have__permission(403,"没有操作权限"),
    error_pic_file(3,"非法图片文件"),
    error_pic_upload(4,"图片上传失败"),
    error_record_not_found(5, "没有找到对应的数据"),
    error_max_page_size(6, "请求记录数超出每次请求最大允许值"),
    error_create_failed(7,"新增失败"),
    error_update_failed(8,"修改失败"),
    error_delete_failed(9,"删除失败"),
    error_search_failed(10,"查询失败"),
    error_count_failed(11,"查询数据总数失败"),
    error_string_to_obj(12,"字符串转java对象失败"),
    error_invalid_argument(13,"参数不合法"),
    error_update_not_allowed(14,"更新失败：%s"),
    error_duplicated_data(15,"数据已存在"),
    error_unknown_database_operation(16,"未知数据库操作失败，请联系管理员解决"),
    error_column_unique(17,"字段s%违反唯一约束性条件"),
    error_file_download(18,"文件下载失败"),
    error_file_upload(19,"文件上传失败"),
    error_start_workflow(20,"没有部署流程"),
    error_exist_account(21,"账号已存在"),
    error_claim_workflow(22,"任务已签收"),
    //100-511为http 状态码
    // --- 4xx Client Error ---
    http_status_bad_request(400, "Bad Request"),
    http_status_unauthorized(401, "Unauthorized"),
    http_status_payment_required(402, "Payment Required"),
    http_status_forbidden(403, "Forbidden"),
    http_status_not_found(404, "Not Found"),
    http_status_method_not_allowed(405, "Method Not Allowed"),
    http_status_not_acceptable(406, "Not Acceptable"),
    http_status_proxy_authentication_required(407, "Proxy Authentication Required"),
    http_status_request_timeout(408, "Request Timeout"),
    http_status_conflict(409, "Conflict"),
    http_status_gone(410, "Gone"),
    http_status_length_required(411, "Length Required"),
    http_status_precondition_failed(412, "Precondition Failed"),
    http_status_payload_too_large(413, "Payload Too Large"),
    http_status_uri_too_long(414, "URI Too Long"),
    http_status_unsupported_media_type(415, "Unsupported Media Type"),
    http_status_requested_range_not_satisfiable(416, "Requested range not satisfiable"),
    http_status_expectation_failed(417, "Expectation Failed"),
    http_status_im_a_teapot(418, "I'm a teapot"),
    http_status_unprocessable_entity(422, "Unprocessable Entity"),
    http_status_locked(423, "Locked"),
    http_status_failed_dependency(424, "Failed Dependency"),
    http_status_upgrade_required(426, "Upgrade Required"),
    http_status_precondition_required(428, "Precondition Required"),
    http_status_too_many_requests(429, "Too Many Requests"),
    http_status_request_header_fields_too_large(431, "Request Header Fields Too Large"),

    // --- 5xx Server Error ---
    http_status_internal_server_error(500, "系统错误"),
    http_status_not_implemented(501, "Not Implemented"),
    http_status_bad_gateway(502, "Bad Gateway"),
    http_status_service_unavailable(503, "Service Unavailable"),
    http_status_gateway_timeout(504, "Gateway Timeout"),
    http_status_http_version_not_supported(505, "HTTP Version not supported"),
    http_status_variant_also_negotiates(506, "Variant Also Negotiates"),
    http_status_insufficient_storage(507, "Insufficient Storage"),
    http_status_loop_detected(508, "Loop Detected"),
    http_status_bandwidth_limit_exceeded(509, "Bandwidth Limit Exceeded"),
    http_status_not_extended(510, "Not Extended"),
    http_status_network_authentication_required(511, "Network Authentication Required"),
    
    //---------cms error---------
    error_file_can_delete(800,"该文件夹不允许删除"),

    // --- 8xx common error ---
    EXCEPTION(800, "exception"),
    INVALID_PARAM(801, "invalid.param"),
    INVALID_PRIVI(802, "invalid.privi"),

    //1000以内是系统错误，
    no_login(1000,"没有登录"),
    config_error(1001,"参数配置表错误"),
    user_exist(1002,"用户名已存在"),
    userpwd_not_exist(1003,"用户名不存在或者密码错误"),
    code_exist(1005,"code码已存在"),
    data_name_exist(1006,"名称已存在"),
    account_exist(1004,"账号已存在"),
    old_pwd_error(1007,"原密码错误"),
    old_pwd_isNull(1008,"原密码或新密码不能为空"),

    //密码校验
    password_length_error(2001,"密码长度为8到16位"),
    password_num_error(2002,"密码必须包含数字"),
    password_up_char_error(2003,"密码必须包含大写字母"),
    password_low_char_error(2004,"密码必须包含小写字母"),
    password_special_error(2005,"密码必须包含特殊字符"),

     //11开头为第三方平台相关的错误
	not_trust_third_party_system(1101,"非信任第三方系统"),
	authorization_isnull(1102,"请求头中authorization为空"),

    license_is_ok(0,"校验成功"),
    license_is_not_fount(1,"获取license key失败"),
    license_server_not_connect(2,"获取授权验证失败，请重试"),
    license_environment_variable_not_defined(3, "环境变量未定义"),
    license_file_has_invalid_format(4,"请初始化认证授权"),
    license_mandatory_field_are_missing(5,"校验授权码失败，授权参数丢失"),
    license_has_not_defined(6,"产品未授权"),
    license_has_expired(7,"license key已过期，请重新申请"),
    license_sign_not_match(8,"授权签名不正确"),
    license_not_match(9,"授权信息不正确"),
    large_max_num(10,"大于最大授权用户账号数，请联系管理员"),
    license_date_expired(11,"产品授权已到期"),
    company_is_null(12,"单位名称或编号不能为空"),
    company_is_not_exist(13,"单位名称或编号输入有误"),
    password_is_error(504,"密码不正确"),
    username_or_password_error(505,"用户名或密码不正确"),
    username_or_password_not_activite(506,"用户未激活"),
    username_not_exist(507,"账号不存在"),
    authorization_is_null(508,"访问此资源需要完全的身份验证"),
    token_is_expire(509,"无效token"),

    authorization_company_status(510,"用户单位已停用，请联系管理员启用本单位")
    ;


    private static final Logger LOGGER =       LoggerFactory.getLogger(ResultStatus.class);
    private int code;
    private String msg;

    ResultStatus(int code, String msg){
        this.code = code;
        this.msg = msg;
    }

    public static int getCode(String define){
        try {
            return ResultStatus.valueOf(define).code;
        } catch (IllegalArgumentException e) {
            LOGGER.error("undefined error code: {}", define);
            return FAIL.getErrorCode();
        }
    }

    public static String getMsg(String define){
        try {
            return ResultStatus.valueOf(define).msg;
        } catch (IllegalArgumentException e) {
            LOGGER.error("undefined error code: {}", define);
            return FAIL.getErrorMsg();
        }
    }

    public static String getMsg(int code){
        for(ResultStatus err : ResultStatus.values()){
            if(err.code==code){
                return err.msg;
            }
        }
        return "errorCode not defined ";
    }

    public int getErrorCode(){
        return code;
    }

    public String getErrorMsg(){
        return msg;
    }
}
