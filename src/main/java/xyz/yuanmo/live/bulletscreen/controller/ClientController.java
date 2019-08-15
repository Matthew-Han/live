package xyz.yuanmo.live.bulletscreen.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.yuanmo.live.bulletscreen.base.BaseResult;
import xyz.yuanmo.live.bulletscreen.enums.HttpCodeEnum;
import xyz.yuanmo.live.bulletscreen.exception.MatthewHanException;
import xyz.yuanmo.live.bulletscreen.service.DouYuClientService;
import javax.annotation.Resource;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import static xyz.yuanmo.live.bulletscreen.consts.ServerConst.DY_HOST;
import static xyz.yuanmo.live.bulletscreen.consts.ServerConst.DY_PORT;

/**
 * @ClassName ClientController
 * @Description TODO
 * @Author MatthewHan
 * @Date 2019-08-15 15:39
 * @Version 1.0
 **/
@RestController
@RequestMapping("/server")
public class ClientController {

    @Resource
    private DouYuClientService douYuClientService;

    /**
     * 连接弹幕服务器
     * @return
     * @throws IOException
     */
    @PostMapping("/connect")
    public BaseResult<Map<String, Object>> connect() {
        BaseResult<Map<String, Object>> result = new BaseResult<>();
        Map<String, Object> map = new HashMap<>(4);
        try {
            map = douYuClientService.connectServer(DY_HOST,DY_PORT);
        } catch (IOException e) {
            throw new MatthewHanException(HttpCodeEnum.SERVER_ERROR_CONNECT.getCode(), e.toString());
        }
        result.setData(map);
        return result;
    }

    @PostMapping("/setRoomId/{roomId}")
    public BaseResult<Map<String, Object>> setRoomId(@PathVariable("roomId") Integer roomId) {
        BaseResult<Map<String, Object>> result = new BaseResult<>();
        Map<String, Object> map = new HashMap<>(4);
        try {
            map = douYuClientService.setRoomId(roomId);
        } catch (IOException e) {
            throw new MatthewHanException(HttpCodeEnum.ERROR_JOIN_ROOM.getCode(), e.toString());
        }
        result.setData(map);
        return result;
    }
}
