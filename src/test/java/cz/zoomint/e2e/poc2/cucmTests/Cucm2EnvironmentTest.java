package cz.zoomint.e2e.poc2.cucmTests;

import cz.zoomint.e2e.poc2.annotations.CucmEnvironment;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@CucmEnvironment
@Tag("failing")
public class Cucm2EnvironmentTest {

	@BeforeAll
	static void beforeAll() {
		System.out.println("CUCM BeforeAll test2");
	}

	@BeforeEach
	void setUp() {
		System.out.println("CUCM BeforeEach test2");
	}

	@AfterEach
	void tearDown() {
		System.out.println("CUCM AfterEach test2");
	}

	@AfterAll
	static void afterAll() {
		System.out.println("CUCM AfterAll test2");
	}

	@Test
	void assertFail() {
		System.out.println("CUCM Assert.fail Test 2");
		Assertions.fail("fail test");
	}

	@Test
	void pokus() {
		System.out.println("CUCM Pokus Test 2");
	}
}
