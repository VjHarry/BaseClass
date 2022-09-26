package org.junitFramework;

import org.junit.*;

public class Sample1 {
	@BeforeClass
	public static void method1() {
		System.out.println("Before m1");
	}
	@AfterClass
	public static void method2() {
		System.out.println("After m5");
	}
	@Before
	public void method3() {
		System.out.println("Before m2");
	}
	@After
	public void method4() {
		System.out.println("After m4");
	}
	@Test
	public void test2() {
		System.out.println("Test2");
	}
	@Ignore
	@Test
	public void test3() {
		System.out.println("Test3");
	}
	@Test
	public void test1() {
		System.out.println("Test1");
	}
	@Test
	public void test4() {
		System.out.println("Test4");
	}
}
