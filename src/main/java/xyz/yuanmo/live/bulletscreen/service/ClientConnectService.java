package xyz.yuanmo.live.bulletscreen.service;

import java.io.IOException;
import java.util.Map;

/**
 * @ClassName ClientConnectService
 * @Description 客户通过TCP协议连接弹幕服务端
 * @Author MatthewHan
 * @Date 2019-08-15 15:11
 * @Version 1.0
 **/
public interface ClientConnectService {

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
     * 默认海量弹幕模式
     * 加入房间接收消息
     * @param roomId
     * @return
     * @throws IOException
     */
    Map<String, Object> joinRoom(Integer roomId) throws IOException;


    /**
     * 登出房间
     * @return
     * @throws IOException
     */
    void logout() throws IOException;


    /**
     * 保持心跳
     * @throws IOException
     */
    void keepAlive() throws IOException;

}
