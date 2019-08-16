package xyz.yuanmo.live.bulletscreen.socket;

import org.apache.tomcat.util.threads.ThreadPoolExecutor;
import org.springframework.stereotype.Component;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName SocketService
 * @Description TODO
 * @Author MatthewHan
 * @Date 2019-08-15 15:13
 * @Version 1.0
 **/
@Component
public class SocketService implements Runnable{

    private int num;
    private Socket socket;

    @Override
    public void run() {
        System.out.println("正在执行任务  "+num);
        try {

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("线程"+num+"执行完毕");
    }

    public static void main(String[] args) {
        ThreadPoolExecutor pool=new ThreadPoolExecutor(5,10,200, TimeUnit.MILLISECONDS,  new ArrayBlockingQueue<Runnable>(5));
        for(int i=0;i<2;i++) {
            SocketService task=new SocketService();
            pool.execute(task);
            System.out.println("线程池中线程数目："+pool.getPoolSize()+"，队列中等待执行的任务数目："+
                    pool.getQueue().size()+"，已执行玩别的任务数目："+pool.getCompletedTaskCount());
        }
        pool.shutdown();
    }
}

