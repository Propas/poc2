package cz.zoomint.e2e.poc2.avayaTests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("smoke")
public class AvayaTest {
	@BeforeAll
	static void beforeAll() {
		System.out.println("AVAYA BeforeAll test");
	}

	@BeforeEach
	void setUp() {
		System.out.println("AVAYA BeforeEach test");
	}

	@AfterEach
	void tearDown() {
		System.out.println("AVAYA AfterEach test");
	}

	@AfterAll
	static void afterAll() {
		System.out.println("AVAYA AfterAll test");
	}

	@Test
	void name() {
		System.out.println("AVAYA Test 1");
	}
}
