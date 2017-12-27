package com.zzax.mall;

import com.zzax.mall.domain.Userinfo;
import com.zzax.mall.service.LoginService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.CountDownLatch;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MallApplicationTests {
	public static final Logger logger = LoggerFactory.getLogger(MallApplicationTests.class);

	@Autowired
	private LoginService loginService;

	public static final String USER_CODE = "u001";
	//并发的用户数量
	public static final int threadNum = 300;
	//倒计数器 用于制造线程的并发执行
	private CountDownLatch cdl = new CountDownLatch(threadNum);


	public void init(){

	}

	@Test
	public void cacheTest() throws InterruptedException {
		for (int i = 0; i < threadNum; i++) {
			new Thread(new UserRequest()).start();
			cdl.countDown();
		}
		Thread.currentThread().join();
	}


	//模拟用户请求,继承线程接口
	private class UserRequest implements Runnable{
		@Override
		public void run() {
			try {
				cdl.await();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//这里写某个服务的方法
			loginService.login(new Userinfo("aaa","vvv"));
			logger.info("当前的数量是:" );
		}
	}

	@Test
	public void contextLoads() {
		System.out.println("=================================================?????=======================");
	}

}
