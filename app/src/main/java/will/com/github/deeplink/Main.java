package will.com.github.deeplink;

import android.os.Handler;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.LogRecord;

public class Main {
    public static void main(String[] args) {
/*        普通线程sleep的方式
        Thread thread = new Thread( new Runnable(){
            @Override
            public void run() {
                // TODO Auto-generated method stub
                while (true){
                    System.out.println("Hello");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }


            }
        });
        thread.start();*/

/*        Timer定时器
        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Hello");
            }
        };
        timer.schedule(timerTask, 10000, 3000);*/

/*
        ScheduledExecutorService方式
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello");
            }
        };
        scheduledExecutorService.scheduleAtFixedRate(runnable, 10000, 3000, java.util.concurrent.TimeUnit.MILLISECONDS);
*/


/*        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello");
            }
        }, 3000);*/
















    }
}
