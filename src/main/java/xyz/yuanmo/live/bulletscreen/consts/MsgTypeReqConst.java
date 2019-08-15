package xyz.yuanmo.live.bulletscreen.consts;

/**
 * @ClassName MsgTypeReqConst
 * @Description 请求的斗鱼弹幕服务器类型
 * @Author MatthewHan
 * @Date 2019-08-14 17:09
 * @Version 1.0
 **/
public class MsgTypeReqConst {

    /**
     * 登录请求消息
     * roomId就是斗鱼直播间房间号
     */
    public static final String LOGIN_MESSAGE = "type@=loginreq/roomid@=%s/";

    /**
     * 心跳消息
     * 固定格式
     */
    public static final String KEEP_LIVE = "type@=mrkl/";

    /**
     * 该消息用于完成加入房间分组，rid就是roomId，完整的数据部分应包含的字段如下
     * <code> example: type@=joingroup/rid@=9999/gid@=-9999/ </code>
     * F G N B
     */
    public static final String JOIN_GROUP = "type@=joingroup/rid@=%s/gid@=%s/";

    /**
     * 表示为登出消息，固定为logout
     */
    public static final String LOGOUT_MESSAGE = "type@=logout/";

}
