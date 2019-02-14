package com.mp.stu.demo;

import com.mp.stu.demo.mapper.UserMapper;
import com.mp.stu.demo.wrapper.userWrapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private UserMapper userMapper;
	@Autowired
	private userWrapper userWrapper;
	@Test
	public void testSelect() {
		userWrapper.querywrapper(1104);
	}

}

