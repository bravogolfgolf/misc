package stringCalculator;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import static org.junit.Assert.*;

public class TestStringCalculator {

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test
	public void testEmptyStingReturns0() {
		checkStringCalculatorResuts("",0);
	}

	@Test
	public void testStingWith1Returns1() {
		checkStringCalculatorResuts("1",1);
	}

	@Test
	public void testStingWith2Returns2() {
		checkStringCalculatorResuts("2",2);
	}

	@Test
	public void testStingWith1And2Returns3() {
		checkStringCalculatorResuts("1,2",3);
	}

	@Test
	public void testStingOflongListReturnsCorrectSum() {
		checkStringCalculatorResuts("1,2,56,2,3,45,76,98436",185);
	}

	@Test
	public void testStingNewLineAndCommas() {
		checkStringCalculatorResuts("1\n2,3",6);
	}

	@Test
	public void testStingDefaultDelimiter() {
		checkStringCalculatorResuts("//;\n1;2",3);
	}

	@Test
	public void testStingDefaultDelimiterOther() {
		checkStringCalculatorResuts("//|\n1|2,3\n1000",1006);
	}

	@Test
	public void throwsExceptionWhenNegativeNumbersAreGiven() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("negatives not allowed: [-1, -2]");
		StringCalculator sc = new StringCalculator();
		sc.add("-1,-2,3");
	}

	@Test
	public void testIgnoreNumbersOver1000() {
		checkStringCalculatorResuts("//#\n1\n2,3#4,1001",10);
	}
	 
	@Test
	public void testDelimitersOfMultiLenght() {
		checkStringCalculatorResuts("//[***]\n1***2***3",6);
	}
	
	@Test
	public void testMultipleDelimitersOfMultiLenght() {
		checkStringCalculatorResuts("//[***];[##########][^^][|||||]\n1,2\n|||||3^^4;5##########6***7,2000",28);
	}

	
	private void checkStringCalculatorResuts(String input, int result) {
		StringCalculator sc = new StringCalculator();
		assertEquals(result, sc.add(input));
	}
}
