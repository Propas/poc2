package cz.zoomint.e2e.poc2.cucmTests;

import cz.zoomint.e2e.poc2.annotations.CucmEnvironment;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@CucmEnvironment
public class CucmEnvironmentIT {

	@BeforeAll
	static void beforeAll() {
		System.out.println("CUCM BeforeAll IT");
	}

	@BeforeEach
	void setUp() {
		System.out.println("CUCM BeforeEach IT");
	}

	@AfterEach
	void tearDown() {
		System.out.println("CUCM AfterEach IT");
	}

	@AfterAll
	static void afterAll() {
		System.out.println("CUCM AfterAll IT");
	}

	@Test
	void name() {
		System.out.println("CUCM IT");
	}
}
