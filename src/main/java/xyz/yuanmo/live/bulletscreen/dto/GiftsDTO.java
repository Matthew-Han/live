package xyz.yuanmo.live.bulletscreen.dto;

import lombok.*;

/**
 * @ClassName GiftsDTO true
 * @Description 赠送礼物的消息
 * @Author MatthewHan
 * @Date 2019-08-14 18:01
 * @Version 1.0
 **/
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class GiftsDTO {

    /**
     * type@=dgb/rid@=9999/gfid@=824/gs@=0/uid@=10245625/nn@=Scorio/ic@=avatar@S010@S24@S56@S25_avatar/eid@=0/
     * eic@=0/level@=13/dw@=0/gfcnt@=15/hits@=15/bcnt@=1/bst@=8/ct@=2/el@=/cm@=0/bnn@=小僵尸/bl@=9/brid@=9999/
     * hc@=8ccfd113d28375263b0964c7221773bf/sahf@=0/fc@=0/gpf@=1/pid@=268/bnid@=1/bnl@=1/from@=2/ 
     *
     * type@=spbc/sn@=LBET送奔驰TI9/dn@=DOTA2赛事频道1/gn@=火箭/gc@=1/drid@=32180/gs@=0/gb@=0/es@=1/gfid@=20004/
     * eid@=20002/bgl@=3/ifs@=32567/rid@=0/gid@=0/bid@=106003_1565851303_9598/sid@=314886972/cl2@=3/eic@=20002/
     * bbi@=20002/from@=1/gpf@=0/pid@=0/shid@=0/shn@=/ 
     *
     */
    private String type;
    private String rid;
    private String gfId;
    private String gs;
    private String uid;
    private String nn;
    private String ic;
    private String eid;
    private String eic;
    private String level;
    private String dw;
    private String gfCnt;
    private String hits;
    private String bCnt;
    private String bst;
    private String ct;
    private String el;
    private String cm;
    private String bnn;
    private String bl;
    private String brId;
    private String hc;
    private String sAhf;
    private String fc;
    private String gpf;
    private String pid;
    private String bnId;
    private String bnl;
    private String from;
    /*
     * type
     * 表示为“赠送礼物”消息，固定为 dgb
     * rid
     * 房间 ID
     * gid
     * 弹幕分组 ID
     * gfid
     * 礼物 id
     * gs
     * 礼物显示样式
     * uid
     * 用户 id
     * nn
     * 用户昵称
     * bg
     * 大礼物标识:默认值为 0(表示是小礼物)
     * ic
     * 用户头像
     * eid
     * 礼物关联的特效 id
     * level
     * 用户等级
     * dw
     * 主播体重
     * gfcnt
     * 礼物个数:默认值 1(表示 1 个礼物)
     * hits
     * 礼物连击次数:默认值 1(表示 1 连击)
     * dlv
     * 酬勤头衔:默认值 0(表示没有酬勤)
     * dc
     * 酬勤个数:默认值 0(表示没有酬勤数量)
     * bdl
     * 全站最高酬勤等级:默认值 0(表示全站都没有酬勤)
     * rg
     * 房间身份组:默认值 1(表示普通权限用户)
     * pg
     * 平台身份组:默认值 1(表示普通权限用户)
     * rpid
     * 扩展字段 id
     * rpidn
     * 扩展字段 id
     * slt
     * 扩展字段，一般不使用
     * elt
     * 扩展字段，一般不使用
     * nl
     * 贵族等级:默认值 0(表示不是贵族)
     * sahf
     * 扩展字段，一般不使用，可忽略
     * bnn
     * 徽章昵称
     * bl
     * 徽章等级
     * brid
     * 徽章房间 id
     * hc
     * 徽章信息校验码
     * fc
     * 攻击道具的攻击力
     */
}
