package com.te.junit_demo;

import static org.junit.Assume.assumeFalse;
import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MathUtilsTest {

	MathUtils utils;

//	@AfterAll
//	public void afterAll() {
//		System.out.println("this method should run after everything!!!");
//	}
//
//	@BeforeEach
//	public void init() {
//		utils = new MathUtils();
//		System.out.println("This runs before each method");
//	}
//
//	@AfterEach
//	public void afterEach() {
//		System.out.println("This runs after each method");
//	}
//
//	@Test
//	@DisplayName("Add two integers")
//	@EnabledOnOs(OS.WINDOWS)
//	void addTest() {
//		int expected = 10;
//		int actual = utils.add(5, 5);
//
////		if(actual != expected) {
////			fail("The test failed");
////		}else {
////			System.out.println("Success");
////		}
//
//		assertEquals(expected, actual); // compare and verify the result
//		System.out.println("This is the addtest");
//	}
//
//	// TDD test driven development
//	@Test
//	public void computeAreaTest() {
//
//		Boolean isServerUp = false;
//		assumeFalse(isServerUp);
//		assertEquals(3.141592653589793, utils.computeArea(1));
//		System.out.println("This is the Areatest");
//	}
//
//	// Checking whether the exception thrown and the expected exception verifies
//
//	@Test
//	public void divideTest() {
//
//		assertThrows(ArithmeticException.class, () -> utils.divide(3, 0));
//		System.out.println("This is the divide test");
//	}
//
//	@BeforeAll
//	public void beforeAllInit() {
//		System.out.println("this method should run before everything!!!");
//	}
//
//	@Test
//	public void multiplyTest() {
//
//		assertAll(
//
//				() -> assertEquals(2, utils.multiply(1, 2)),
//				() -> assertEquals(0, utils.multiply(0, 2)),
//				() -> assertEquals(-2, utils.multiply(-1, 2)));
//
//	}
//	
//	@Nested
//	class add{
//		@Test
//		void addTest() {
//			int expected = 10;
//			int actual = utils.add(5, 5);
//
//			assertEquals(expected, actual); // compare and verify the result
//			System.out.println("This is the addtest");
//		}
//		@Test
//		void addTest1() {
//			int expected = 15;
//			int actual = utils.add(10, 5);
//			assertEquals(expected, actual); // compare and verify the result
//			System.out.println("This is the addtest");
//		}
//		@Test
//		void addTest2() {
//			int expected = 20;
//			int actual = utils.add(15, 5);
//			assertEquals(expected, actual); // compare and verify the result
//			System.out.println("This is the addtest");
//		}
//	}

	@ParameterizedTest
	@ValueSource(strings = {"Apples" , "Bananas", "Mangoes"})
	public void parameterized(String a) {
		System.out.println(a);
	}
}

















