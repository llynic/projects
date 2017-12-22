package com.zzax.mall.starter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @Description 编写想要定时执行的任务
 * @Created By : wangzhenjia
 * @DATE 2017-12-22 9:20 星期五
 */
public class MyTask {
    private Logger logger = LoggerFactory.getLogger(MyTask.class);

    @PostConstruct
    public void sys() {
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                //这里写需要定时执行的任务
            }
        };
        //下面一段代码表示每天06:00:00 会执行上面的run方法的内容
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 06);
        calendar.set(Calendar.MINUTE, 00);
        calendar.set(Calendar.SECOND, 00);
        Timer timer = new Timer();
        timer.schedule(task, calendar.getTime());
    }


}
