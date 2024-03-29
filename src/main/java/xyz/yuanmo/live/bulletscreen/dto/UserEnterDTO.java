package xyz.yuanmo.live.bulletscreen.dto;

import lombok.*;

/**
 * @ClassName UserEnterDTO true
 * @Description 用户进房通知消息
 * @Author MatthewHan
 * @Date 2019-08-15 09:40
 * @Version 1.0
 **/
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class UserEnterDTO {

    /**
     * type@=uenter/rid@=9999/uid@=30270690/nn@=Leo就是莱奥/level@=38/ic@=avanew@Sface@S201804@S103f1668fc8cc6a892d74fc33cca53f4/
     * nl@=1/rni@=0/el@=eid@AA=1500000113@ASetp@AA=1@ASsc@AA=1@ASef@AA=0@AS@S/sahf@=0/wgei@=0/cbid@=491067/fl@=10/ 
     */
    private String type;
    private String rid;
    private String uid;
    private String nn;
    private String level;
    private String ic;
    private String nl;
    private String rni;
    private String el;
    private String sAhf;
    private String wGei;
    private String cBid;
    private String fl;

    /*
     * rid
     * 房间 ID
     * gid
     * 弹幕分组 ID
     * uid
     * 用户 ID
     * nn
     * 用户昵称
     * str
     * 战斗力
     * level
     * 新用户等级
     * gt
     * 礼物头衔:默认值 0(表示没有头衔)
     * rg
     * 房间权限组:默认值 1(表示普通权限用户)
     * pg
     * 平台身份组:默认值 1(表示普通权限用户)
     * dlv
     * 酬勤等级:默认值 0(表示没有酬勤)
     * dc
     * 酬勤数量:默认值 0(表示没有酬勤数量)
     * bdlv
     * 最高酬勤等级:默认值 0
     * ic
     * 用户头像
     * nl
     * 贵族等级
     * ceid
     * 扩展功能字段 id
     * crw
     * 用户栏目上周排名
     * ol
     * 主播等级
     * el
     * 用户获得的连击特效:数组类型，数组包含 eid(特效 id),etp(特 效类型), ,sc(特效次数)信息，ef(特效标志)。
     * sahf
     * 扩展字段，一般不使用，可忽略
     * wgei
     * 页游欢迎特效 id
     */
}
