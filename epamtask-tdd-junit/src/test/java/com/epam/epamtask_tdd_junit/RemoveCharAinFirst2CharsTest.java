package com.epam.epamtask_tdd_junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveCharAinFirst2CharsTest {
	
	/*TODO list
	 * 1. "ABCD"   =>  "BCD"  - success
	 * 2. "AACD"   =>  "CD"    -  success
	 * 3. "BACD"   => "BCD"  - success
	 * 4. "BBAA"   => "BBAA" - success
	 * 5. "AABAA"  => "BAA" - success
	 */
	RemoveCharAinFirst2Chars removeAinfirstchars;
	String actual,result;
	
	@BeforeEach
	void initialistaion()
	{
		removeAinfirstchars=new RemoveCharAinFirst2Chars();
	}
	
	@Test
	void testcase1() {
		result=removeAinfirstchars.remove("ABCD");
		actual="BCD";
		assertEquals(actual,result);	
	}
	
	@Test
	void testcase2() {
		result=removeAinfirstchars.remove("AACD");
		actual = "CD";
		assertEquals(actual,result);	
	}
	
	@Test
	void testcase3() {
		result=removeAinfirstchars.remove("BACD");
		actual="BCD";
		assertEquals(actual,result);	
	}
	
	@Test
	void testcase4() {
		result=removeAinfirstchars.remove("BBAA");
		actual="BBAA";
		assertEquals(actual,result);	
	}
	
	@Test
	void testcase5() {
		result=removeAinfirstchars.remove("AABAA");
		actual="BAA";
		assertEquals(actual,result);	
	}
}
