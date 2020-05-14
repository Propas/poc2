package cz.zoomint.e2e.poc2.genesysTests;

import cz.zoomint.e2e.poc2.annotations.GenesysEnvironment;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@GenesysEnvironment
public class GenesysEnvironmentTest {

	@BeforeAll
	static void beforeAll() {
		System.out.println("GENESYS BeforeAll test");
	}

	@BeforeEach
	void setUp() {
		System.out.println("GENESYS BeforeEach test");
	}

	@AfterEach
	void tearDown() {
		System.out.println("GENESYS AfterEach test");
	}

	@AfterAll
	static void afterAll() {
		System.out.println("GENESYS AfterAll test");
	}

	@Test
	void name() {
		System.out.println("GENESYS Test 1");
	}
}
