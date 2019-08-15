package xyz.yuanmo.live.bulletscreen.dto;

import lombok.*;

/**
 * @ClassName ShareDTO true
 * @Description 用户分享了直播间通知
 * @Author MatthewHan
 * @Date 2019-08-15 10:40
 * @Version 1.0
 **/
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ShareDTO {
    private String type;
    private String rid;
    private String gid;
    private String uid;
    private String nickname;
    private String exp;
    /*
     * type
     * 表示为“用户分享了直播间通知”，固定为 srres
     * rid
     * 房间 id
     * gid
     * 弹幕分组 id
     * uid
     * 用户(分享者)id
     * nickname
     * 用户(分享者)昵称
     * exp
     * 用户获得的经验值
     */
}
