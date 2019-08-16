package xyz.yuanmo.live.bulletscreen.util;

import org.springframework.stereotype.Component;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @ClassName send
 * @Description 懒汉式静态内部类单例模式
 * @Author MatthewHan
 * @Date 2019-08-16 10:13
 * @Version 1.0
 **/
@Component
public class SendBoxUtil {

    private static Socket socket;

    /**
     * 把业务交给静态子类处理
     */
    private static class Singleton{
        private static SendBoxUtil sendBoxUtil = new SendBoxUtil();
    }
    private SendBoxUtil() {}

    public static SendBoxUtil getInstance(Socket socket){
        SendBoxUtil.socket = socket;
        return Singleton.sendBoxUtil;
    }

    public void send(String message) throws IOException {
        OutputStream os = socket.getOutputStream();
        // 将message对象翻译成输出流需要的消息信息
        MsgReqUtil to = new MsgReqUtil(message);
        os.write(to.getBytes());
        os.flush();
    }
}
