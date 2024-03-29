package xyz.yuanmo.live.bulletscreen.dto;

import lombok.*;

/**
 * @ClassName RoomExpDTO true
 * @Description 房间等级与经验exp消息
 * @Author MatthewHan
 * @Date 2019-08-15 11:17
 * @Version 1.0
 **/
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class RoomExpDTO {

    /**
     * type@=synexp/o_exp@=134235900804/o_lev@=100/o_minexp@=23554500000/o_upexp@=0/rid@=9999/ 
     * type@=synexp/o_exp@=12208342246/o_lev@=88/o_minexp@=11654500000/o_upexp@=146157754/rid@=88660/ 
     */
    private String type;
    private String oExp;
    private String oLev;
    private String oMinExp;
    private String oUpExp;
    private String rid;

    /*
     * type
     * 类型
     * o_exp
     * 主播owner经验
     * o_lev
     * 主播等级
     * o_minexp
     * 暂未推测出
     * o_upexp
     * 升下一级级还需要的经验
     * rid
     * 房间id
     */
}
