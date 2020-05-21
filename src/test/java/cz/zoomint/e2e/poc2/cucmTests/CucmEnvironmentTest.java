package cz.zoomint.e2e.poc2.cucmTests;

import cz.zoomint.e2e.poc2.annotations.CucmEnvironment;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


@CucmEnvironment
@Tag("fire")
public class CucmEnvironmentTest {

	@BeforeAll
	static void beforeAll() {
		System.out.println("CUCM BeforeAll test");
	}

	@BeforeEach
	void setUp() {
		System.out.println("CUCM BeforeEach test");
	}

	@AfterEach
	void tearDown() {
		System.out.println("CUCM AfterEach test");
	}

	@AfterAll
	static void afterAll() {
		System.out.println("CUCM AfterAll test");
	}

	@Test
	void name() {
		System.out.println("CUCM Test 1");
	}
}
