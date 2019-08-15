package xyz.yuanmo.live.bulletscreen.service;

import java.io.IOException;
import java.util.Map;

/**
 * @ClassName DouYuClientService
 * @Description 客户通过TCP协议连接弹幕服务端
 * @Author MatthewHan
 * @Date 2019-08-15 15:11
 * @Version 1.0
 **/
public interface DouYuClientService {

    /**
     * 连接斗鱼弹幕服务器
     * @param host 服务端地址
     * @param port 服务端端口号
     * @return
     * @throws IOException
     */
    Map<String, Object> connectServer(String host, Integer port) throws IOException;

    /**
     * 房间登陆认证
     * @param roomId
     * @return
     * @throws IOException
     */
    Map<String, Object> setRoomId(Integer roomId) throws IOException;

    /**
     * 登出房间
     * @return
     * @throws IOException
     */
    void logout() throws IOException;
}
