package xyz.yuanmo.live.bulletscreen.old;

import lombok.*;

/**
 * @ClassName FishBallGiftDTO
 * @Description TODO
 * @Author MatthewHan
 * @Date 2019-08-14 17:56
 * @Version 1.0
 **/
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class FishBallGiftDTO {

    private String type;
    private String rid;
    private String uid;
    private String gid;
    private String sil;
    private String ifish;
    private String ct;
    private String nn;
    private String ur;
    private String level;
    private String btype;
    /*
     * type
     * 表示为“领取在线鱼丸”消息，固定为 onlinegift
     * rid
     * 房间 ID
     * uid
     * 用户 ID
     * gid
     * 弹幕分组 ID
     * sil
     * 鱼丸数
     * if ==> ifish
     * 领取鱼丸的等级（斗鱼这什么JB命名啊？？？if都来了）
     * ct
     * 客户端类型标识
     * nn
     * 用户昵称
     * ur
     * 鱼丸之刃倍率
     * level
     * 用户等级
     * btype
     * 广播类型
     */
}
