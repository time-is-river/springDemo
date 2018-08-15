package com.example.demo;

import com.example.demo.web.util.POIUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
		POIUtil.readExcel("D:/testDownloads/承运地址.xlsx");
		System.out.println("");
	}

}
