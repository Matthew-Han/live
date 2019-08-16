package xyz.yuanmo.live.bulletscreen.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import xyz.yuanmo.live.bulletscreen.consts.MsgTypeReqConst;
import xyz.yuanmo.live.bulletscreen.service.ClientConnectService;
import xyz.yuanmo.live.bulletscreen.util.ReadBoxUtil;
import xyz.yuanmo.live.bulletscreen.util.SendBoxUtil;
import java.io.IOException;
import java.net.Socket;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName ClientConnectServiceImpl
 * @Description TODO
 * @Author MatthewHan
 * @Date 2019-08-15 15:31
 * @Version 1.0
 **/
@Service
public class ClientConnectServiceImpl implements ClientConnectService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private boolean isConnect = false;
    public ReadBoxUtil readBoxUtil;
    private Socket socket;
    private String host;
    private Integer port;
    private Integer roomId;

    @Override
    public Map<String, Object> connectServer(String host, Integer port) throws IOException {
        /*
         * 默认装载两个元素
         */
        Map<String, Object> map = new HashMap<>(4);
        this.host = host;
        this.port = port;
        this.socket = new Socket(host, port);
        logger.info("========== 连接弹幕服务器 [ {} : {} ] 成功 ==========", host, port);
        map.put("host", host);
        map.put("port", port);
        map.put("timestamp", Instant.now().getEpochSecond());
        isConnect = true;
        return map;

    }

    @Override
    public Map<String, Object> joinRoom(Integer roomId) throws IOException {
        Map<String, Object> map = new HashMap<>(4);
        this.roomId = roomId;
        String logonMsg = String.format(MsgTypeReqConst.LOGIN_MESSAGE,roomId);
        String joinRoomMsg = String.format(MsgTypeReqConst.JOIN_GROUP, roomId, MsgTypeReqConst.FULL_SCREEN);

        SendBoxUtil sendBoxUtil = SendBoxUtil.getInstance(socket);
        sendBoxUtil.send(logonMsg);
        sendBoxUtil.send(joinRoomMsg);
        readBoxUtil = new ReadBoxUtil(socket);
        logger.info("========== 登陆房间号是 [ {} ] 的房间成功 ==========", roomId);
        logger.info("========== 开始接收消息 ==========");
        map.put("roomId", roomId);
        map.put("full", "默认开启海量弹幕模式");
        map.put("timestamp", Instant.now().getEpochSecond());
        return map;
    }


    @Override
    public void logout() throws IOException {
        String logoutMsg = MsgTypeReqConst.LOGOUT_MESSAGE;
        SendBoxUtil sendBoxUtil = SendBoxUtil.getInstance(socket);
        sendBoxUtil.send(logoutMsg);
        logger.info("========== 已登出房间 ==========");

    }

    @Override
    public void keepAlive() throws IOException {
        String keepLive = MsgTypeReqConst.KEEP_ALIVE;
        SendBoxUtil sendBoxUtil = SendBoxUtil.getInstance(socket);
        sendBoxUtil.send(keepLive);
        logger.info("========== 发送心跳消息，保持通信 ==========");
    }



}
