package com.zeal.auth;

import org.jasypt.encryption.StringEncryptor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AuthApplication.class)
public class AuthApplicationTests {
	@Autowired
	private StringEncryptor stringEncryptor;

	@Test
	public void contextLoads() {
		System.out.println("******************->"+stringEncryptor.encrypt("zeal"));
	}
	@Test
	public void testEnvironmentProperties() {
		System.out.println("******************->"+stringEncryptor.encrypt("zeal"));
		System.out.println("******************->"+stringEncryptor.encrypt("123456"));
		System.out.println("******************->"+stringEncryptor.encrypt("zeal3230"));
		System.out.println("******************->"+stringEncryptor.encrypt("$2a$10$XT5zYpF7PnDVl0xeBM/c0Okk3zhTb0fNOJGaOXjqD3WB/hT3AVbcO"));
	}

}
