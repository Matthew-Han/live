package xyz.yuanmo.live.bulletscreen.old;

import lombok.*;

/**
 * @ClassName BulletScreen
 * @Description 斗鱼弹幕服务端返回的 <code> type = chatmsg </code> 的弹幕消息
 * @Author MatthewHan
 * @Date 2019-08-14 16:37
 * @Version 1.0
 **/
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class BulletScreenDTO {

    private String type;
    private String gid;
    private String rid;
    private String uid;
    private String nn;
    private String txt;
    private String cid;
    private String level;
    private String gt;
    private String col;
    private String ct;
    private String rg;
    private String pg;
    private String dlv;
    private String dc;
    private String bdlv;
    private String cmt;
    private String sahf;
    private String ic;
    private String nl;
    private String nc;
    private String gatin;
    private String gaout;
    private String chtin;
    private String chout;
    private String repin;
    private String repout;
    private String bnn;
    private String bl;
    private String brid;
    private String hc;
    private String ol;
    private String rev;
    private String hl;
    private String ifs;
    private String p2p;
    private String el;
    /*
     * type
     * 表示为“弹幕”消息，固定为 chatmsg
     * gid
     * 弹幕组 id
     * rid
     * 房间 id
     * uid
     * 发送者 uid
     * nn
     * 发送者昵称
     * txt
     * 弹幕文本内容
     * cid
     * 弹幕唯一 ID
     * level
     * 用户等级
     * gt
     * 礼物头衔:默认值 0(表示没有头衔)
     * col
     * 颜色:默认值 0(表示默认颜色弹幕)
     * ct
     * 客户端类型:默认值 0
     * rg
     * 房间权限组:默认值 1(表示普通权限用户)
     * pg
     * 平台权限组:默认值 1(表示普通权限用户)
     * dlv
     * 酬勤等级:默认值 0(表示没有酬勤)
     * dc
     * 酬勤数量:默认值 0(表示没有酬勤数量)
     * bdlv
     * 最高酬勤等级:默认值 0(表示全站都没有酬勤)
     * cmt
     * 弹幕具体类型: 默认值 0(普通弹幕)
     * sahf
     * 扩展字段，一般不使用，可忽略
     * ic
     * 用户头像
     * nl
     * 贵族等级
     * nc
     * 贵族弹幕标识,0-非贵族弹幕,1-贵族弹幕,默认值 0
     * gatin
     * 进入网关服务时间戳
     * gatout
     * 离开网关服务时间戳
     * chtin
     * 进入房间服务时间戳
     * chtout
     * 离开房间服务时间戳
     * repin
     * 进入发送服务时间戳
     * repout
     * 离开发送服务时间戳
     * bnn
     * 徽章昵称
     * bl
     * 徽章等级
     * brid
     * 徽章房间 id
     * hc
     * 徽章信息校验码
     * ol
     * 主播等级
     * rev
     * 是否反向弹幕标记: 0-普通弹幕，1-反向弹幕, 默认值 0
     * hl
     * 是否高亮弹幕标记: 0-普通，1-高亮, 默认值 0
     * ifs
     * 是否粉丝弹幕标记: 0-非粉丝弹幕，1-粉丝弹幕, 默认值 0
     * p2p
     * 服务功能字段
     * el
     * 用户获得的连击特效:数组类型，数组包含 eid(特效 id),etp(特 效类型),sc(特效次数)信息，ef(特效标志)。
     */



}
