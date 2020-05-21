package cz.zoomint.e2e.poc2.cucmTests;

import cz.zoomint.e2e.poc2.annotations.GenesysEnvironment;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("smoke")
@GenesysEnvironment
public class GenesysTest {
	@BeforeAll
	static void beforeAll() {
		System.out.println("GENESYS_C BeforeAll test");
	}

	@BeforeEach
	void setUp() {
		System.out.println("GENESYS_C BeforeEach test");
	}

	@AfterEach
	void tearDown() {
		System.out.println("GENESYS_C AfterEach test");
	}

	@AfterAll
	static void afterAll() {
		System.out.println("GENESYS_C AfterAll test");
	}

	@Test
	void name() {
		System.out.println("GENESYS_C Test 1");
	}
}
