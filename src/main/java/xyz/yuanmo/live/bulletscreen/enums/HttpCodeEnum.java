package xyz.yuanmo.live.bulletscreen.enums;

/**
 * @ClassName HttpCode
 * @Description TODO
 * @Author MatthewHan
 * @Date 2019/4/10 2:30 PM
 * @Version 1.0
 **/
public enum HttpCodeEnum {
    /**
     * 成功
     */
    SUCCESS(200, "OK"),

    /**
     * 没有登录
     */
    NOT_LOGIN(400, "没有登录"),



    /**
     * 系统错误
     */
    SYS_ERROR(402, "系统错误"),

    /**
     * 参数错误
     */
    PARAMS_ERROR(403, "参数错误"),

    /**
     * 404
     */
    RESULT_EMPTY(404, "没有找到任何信息"),

    /**
     * 不支持或已经废弃
     */
    NOT_SUPPORTED(410, "不支持或已经废弃"),


    /**
     * AuthCode错误
     */
    INVALID_AUTHCODE(411, "无效的AuthCode"),

    /**
     * 太频繁的调用
     */
    TOO_FREQUENT(445, "太频繁的调用"),

    /**
     * 请求类型错误
     */
    REQUEST_ERROR(446, "不正确的请求类型:"),

    /**
     * 账号不存在或者密码错误辣,重打吧.
     */
    USERNAME_PASSWORD_ERROR(490, "账号不存在或者密码错误辣"),

    /**
     * 登陆失败
     */
    LOGON_ERROR(491, "登录失败"),

    /**
     * 重复登录
     */
    RE_LOGON(492, "重复登录"),

    /**
     * 未知的错误
     */
    UNKNOWN_ERROR(499, "未知错误"),

    /**
     * 服务端出现错误
     */
    INTERNAL_SERVER_ERROR(500, "Internal Server Error"),


    /** ================================================================ */


    /**
     * 发生异常
     */
    EXCEPTION(1001, "发生异常"),

    SERVER_ERROR_CONNECT(1002,"服务连接失败"),

    ERROR_JOIN_ROOM(1003,"登陆房间失败 [ %d ] "),

    ERROR_LOROUT_SERVER(1004,"登出房间失败"),
    ;


    private Integer code;
    private String message;

    HttpCodeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}

