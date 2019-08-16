package xyz.yuanmo.live.bulletscreen.consts;

/**
 * @ClassName MsgTypeRespConst
 * @Description 响应的斗鱼弹幕服务器消息类型
 * @Author MatthewHan
 * @Date 2019-08-14 17:01
 * @Version 1.0
 **/
public class MsgTypeRespConst {

    /** 登录响应，收到则提示登陆弹幕服务器成功 */
    public static final String LOGIN_RES = "loginres";

    /** 服务心跳响应， */
    public static final String KEEP_ALIVE = "loginres";

    /** 弹幕消息 */
    public static final String CHAT_MSG = "chatmsg";

    /** 领取鱼丸暴击 */
    public static final String ONLINE_GIFT = "onlinegift";

    /** 赠送礼物消息 */
    public static final String D_GIFT_B = "dgb";

    /** 用户进入房间 */
    public static final String USER_ENTER = "uenter";

    /** 房间开播关播 */
    public static final String RSS = "rss";

    /** 房间贡献排行榜更新广播 */
    public static final String RANK_LIST = "ranklist";

    /** 超级弹幕 */
    public static final String SSD = "ssd";

    /** 房间内礼物广播 */
    public static final String SP_BC = "spbc";

    /** 房间用户抢红包 */
    public static final String GG_BB = "ggbb";

    /** 房间分区排名变化消息 */
    public static final String RANK_UP = "rankup";

    /** 错误信息 */
    public static final String ERROR = "error";
}
