package xyz.yuanmo.live.bulletscreen.enums;


/**
 * @ClassName ErrorCodeEnum
 * @Description 斗鱼弹幕服务器error code
 * @Author MatthewHan
 * @Date 2019-08-15 10:43
 * @Version 1.0
 **/
public enum ErrorCodeEnum {

    /*
     * 0
     * 操作成功
     * 51
     * 数据传输出错
     * 52
     * 服务器关闭
     * 204
     * 房间 id 错误
     */
    SUCCESS_OPERATION(0,"操作成功"),
    ERROR_DATA_TRANSMISSION(51,"数据传输错误"),
    SERVER_CLOSED(52,"服务器关闭"),
    ERROR_ROOM_ID(204,"房间id错误"),
    ;
    private Integer code;
    private String message;

    ErrorCodeEnum(Integer code, String message){
        this.code = code;
        this.message = message;
    }


}
