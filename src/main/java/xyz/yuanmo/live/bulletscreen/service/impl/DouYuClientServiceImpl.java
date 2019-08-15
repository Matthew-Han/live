package xyz.yuanmo.live.bulletscreen.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import xyz.yuanmo.live.bulletscreen.base.BaseResult;
import xyz.yuanmo.live.bulletscreen.consts.MsgTypeReqConst;
import xyz.yuanmo.live.bulletscreen.service.DouYuClientService;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName DouYuClientServiceImpl
 * @Description TODO
 * @Author MatthewHan
 * @Date 2019-08-15 15:31
 * @Version 1.0
 **/
@Service
public class DouYuClientServiceImpl implements DouYuClientService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());


    private Socket socket;
    private String host;
    private Integer port;
    private Integer roomId;


    public DouYuClientServiceImpl() {
        // this.roomId = roomId;
    }
    @Override
    public Map<String, Object> connectServer(String host, Integer port) throws IOException {
        /*
         * 默认装载两个元素
         */
        Map<String, Object> map = new HashMap<>(4);
        this.host = host;
        this.port = port;
        this.socket = new Socket(host, port);
        logger.info("连接弹幕服务器( {} : {} )成功", host, port);
        map.put("host", host);
        map.put("port", port);
        map.put("timestamp", Instant.now().getEpochSecond());
        return map;

    }

    @Override
    public Map<String, Object> setRoomId(Integer roomId) throws IOException {
        Map<String, Object> map = new HashMap<>(4);
        this.roomId = roomId;
        String logonMsg = String.format(MsgTypeReqConst.LOGIN_MESSAGE,roomId);
        OutputStream out = socket.getOutputStream();
        out.write(logonMsg.getBytes());
        out.flush();
        logger.info("登陆房间号是 {} 的房间成功", roomId);
        map.put("roomId",roomId);
        return map;
    }

    @Override
    public void logout() throws IOException {
        String logoutMsg = MsgTypeReqConst.LOGOUT_MESSAGE;
        OutputStream out = socket.getOutputStream();
        out.write(logoutMsg.getBytes());
        out.flush();
        logger.info("已登出房间");

    }
}
