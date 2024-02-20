package com.example.springgha;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;

@SpringBootTest
class SpringGhaApplicationTests {


	@Profile("local-test")
	@ConditionalOnProperty("test.run.local")
	@Test
	void contextLoads() {
	}

}
