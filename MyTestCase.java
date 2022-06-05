package myproject;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class MyTestCase {

	@Test
	public void test1() {
		System.out.println("test 1 method");
	}
	@Test
	public void test2() {
		int i=20;
		int j=30;
		int sum=i+j;
		assertEquals(sum,50);
		System.out.println("Addition passed");
	}
	@Test
	public void test3() {
		int a=10;
		int b=30;
		int diff=b-a;
		assertEquals(diff, 20);
		System.out.println("difference passed");
	}
	@Test
	public void test4() {
		int l=5;
		int m=3;
		int prod=l*m;
		assertEquals(prod,15);
		System.out.println("multiplication passed");
	}
	@Test
	public void test5() {
		int y=2;
		int z=4;
		int div=y/z;
		assertEquals(div,0);
		System.out.println("division passed");
	}
	
	@BeforeClass
	public static void beforeClassMethod() {
		System.out.println("Before class method(connect DB)");
		     //real time connect DB
	}
	@AfterClass
	public static void afterClassMethod() {
		System.out.println("after class method(Disconnect DB)");
	}
	@Before
	 public void myMethodBefore() {
		System.out.println("Executes before each method");
	}
	@After
	    public void myMethodAfter() {
		System.out.println("Executes after each method");
	}
	@Ignore("not yet implemented")
	@Test
	public void test6() {
		int a=10,b=5;
		int s=a-b;
		assertEquals(s,20);  //@Ignore will not execute the particular test case and do not bother about answer
		
	}

}
