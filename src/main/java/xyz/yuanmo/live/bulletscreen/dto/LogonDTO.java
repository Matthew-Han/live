package xyz.yuanmo.live.bulletscreen.dto;

import lombok.*;

/**
 * @ClassName LogonDTO true
 * @Description 登录响应消息
 * @Author MatthewHan
 * @Date 2019-08-14 17:37
 * @Version 1.0
 **/
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class LogonDTO {

    /**
     * type@=loginres/userid@=0/roomgroup@=0/pg@=0/sessionid@=0/username@=/nickname@=/live_stat@=0/is_illegal@=0/
     * ill_ct@=/ill_ts@=0/now@=0/ps@=0/es@=0/it@=0/its@=0/npv@=0/best_dlev@=0/cur_lev@=0/nrc@=16384/ih@=0/
     * sid@=70953/sahf@=0/sceneid@=0/ 
     */
    private String type;
    private String userId;
    private String roomGroup;
    private String pg;
    private String sessionId;
    private String username;
    private String nickname;
    private String live_start;
    private String is_illegal;
    private String ill_ct;
    private String ill_ts;
    private String now;
    private String ps;
    private String es;
    private String it;
    private String its;
    private String npv;
    private String bestDlEv;
    private String curLev;
    private String nrc;
    private String ih;
    private String sid;
    private String sAhf;

    /*
     * type
     * 表示为“登录”消息，固定为 loginres
     * userid
     * 用户 ID
     * roomgroup
     * 房间权限组
     * pg
     * 平台权限组
     * sessionid
     * 会话 ID
     * username
     * 用户名
     * nickname
     * 用户昵称
     * live_stat
     * 直播状态
     * is_illegal
     * 是否违规
     * ill_ct
     * 违规提醒内容
     * ill_ts
     * 违规提醒开始时间戳
     * now
     * 系统当前时间
     * ps
     * 手机绑定标示
     * es
     * 邮箱绑定标示
     * it
     * 认证类型
     * its
     * 认证状态
     * npv
     * 是否需要手机验证
     * best_dlev
     * 最高酬勤等级
     * cur_lev
     * 酬勤等级
     * nrc
     * 观看房间需要的条件
     * ih
     * 是否进房隐身
     * sid
     * 服务 id
     * sahf
     * 扩展字段，一般不使用，可忽略
     */
}
