package xyz.yuanmo.live.bulletscreen.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.Arrays;

/**
 * @ClassName ReadMsgServiceImpl
 * @Description TODO
 * @Author MatthewHan
 * @Date 2019-08-16 15:15
 * @Version 1.0
 **/
public class ReadBoxUtil {

    private Socket socket;

    public ReadBoxUtil(Socket socket){
        this.socket = socket;
    }
    public String getAllMsg() throws IOException {
        InputStream inputStream = this.socket.getInputStream();
        int contentLen = 0;

        int len;
        int readLen;
        for(len = 0; len < 4; ++len) {
            readLen = inputStream.read();
            contentLen = (int)((double)contentLen + (double)readLen * Math.pow(16.0D, (double)(2 * len)));
        }

        readLen = 0;
        byte[] bytes = new byte[contentLen];
        ByteArrayOutputStream byteArray = new ByteArrayOutputStream();

        System.out.println("qqq"+inputStream.read(bytes, 0, contentLen - readLen));

        while((len = inputStream.read(bytes, 0, contentLen - readLen)) != -1) {
            byteArray.write(bytes, 0, len);
            readLen += len;
            if (readLen == contentLen) {
                break;
            }
        }

        String msg = new String(Arrays.copyOfRange(bytes, 8, bytes.length));
        return msg;
    }
}
