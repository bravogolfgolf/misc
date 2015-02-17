package com.convert.www;
import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class ConvertArabicToRomanTest extends TestCase {
	Arabic arabic = new Arabic();
	
	
	@Test
	public void testOnetoI() throws Exception {
		assertEquals("I", arabic.toRoman(1));
	}

	@Test
	public void testTwoToII() throws Exception {
		assertEquals("II", arabic.toRoman(2));
	}

	@Test
	public void testThreeToIII() throws Exception {
		assertEquals("III", arabic.toRoman(3));
	}

	@Test
	public void testFourToIV() throws Exception {
		assertEquals("IV", arabic.toRoman(4));
	}

	@Test
	public void testFiveToV() throws Exception {
		assertEquals("V", arabic.toRoman(5));
	}

	@Test
	public void testSixToVI() throws Exception {
		assertEquals("VI", arabic.toRoman(6));
	}
	@Test
	public void testSevenToVII() throws Exception {
		assertEquals("VII", arabic.toRoman(7));
	}

	@Test
	public void testEightToVIII() throws Exception {
		assertEquals("VIII", arabic.toRoman(8));
	}
	
	@Test
	public void testNineToIX() throws Exception {
		assertEquals("IX", arabic.toRoman(9));
	}

	@Test
	public void testTenToX() throws Exception {
		assertEquals("X", arabic.toRoman(10));
	}
	
	@Test
	public void test11ToXI() throws Exception {
		assertEquals("XI", arabic.toRoman(11));
	}
	
	@Test
	public void test14ToXIV() throws Exception {
		assertEquals("XIV", arabic.toRoman(14));
	}

	@Test
	public void test15ToXV() throws Exception {
		assertEquals("XV", arabic.toRoman(15));
	}

	@Test
	public void test18ToXVIII() throws Exception {
		assertEquals("XVIII", arabic.toRoman(18));
	}

	@Test
	public void test19ToXIX() throws Exception {
		assertEquals("XIX", arabic.toRoman(19));
	}

	@Test
	public void test20ToXX() throws Exception {
		assertEquals("XX", arabic.toRoman(20));
	}

	@Test
	public void test40ToXL() throws Exception {
		assertEquals("XL", arabic.toRoman(40));
	}

}
