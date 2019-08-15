package xyz.yuanmo.live.bulletscreen.socket;

import java.io.IOException;
import java.net.Socket;

/**
 * @ClassName SocketService
 * @Description TODO
 * @Author MatthewHan
 * @Date 2019-08-15 15:13
 * @Version 1.0
 **/
public class SocketService {

    public static void main(String[] args){
        try {
            Socket socket = new Socket("openbarrage.douyutv.com", 8601);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
