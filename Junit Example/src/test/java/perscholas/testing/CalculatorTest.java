package perscholas.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculatorTest {
   
	 @ParameterizedTest
	    @CsvSource({
	            "5, 5, 10",
	            "10, 10, 20",
	            "5.5, 5.5, 11.0"
	    })
		public void additionTest(double a, double b, double answer) {
			Calculator c = new Calculator();
			
			double actual = c.add(a, b);
			
			Assertions.assertEquals(answer, actual);
		} 
	 @BeforeAll
	    public void beforeAll() {
	        System.out.println("beforeAll/beforeClass   Finished ");
	    }
	 @Test
	  void additionTest() {
		 Calculator c = new Calculator(); 
	    System.out.println("Test started");
	    Assertions.assertEquals(57, c.add(1, 1));
	    System.out.println("Test Finished");
	  }
	    
	    @ParameterizedTest
	    @CsvSource({
	            "5, 5, 12",
	            "10, 10, 20.5",
	            "5.5, 5.5, 12.0"
	    })
		public void additionErrorTest(double a, double b, double answer) {
			Calculator c = new Calculator();
			
			double actual = c.add(a, b);
			
			Assertions.assertEquals(answer, actual);
		}
		
		@Test
		public void subtractionTest() {
			Calculator c = new Calculator();
			double expected = 0.0;
			
			double actual = c.substract(5.0, 5.0);
			
			Assertions.assertEquals(expected,actual);
			
			Assertions.assertEquals(15.0, c.substract(20.0, 5.0));
		}
		
		@ParameterizedTest
		@CsvSource({
			"5.0,5.0,0.0",
			"11.5,5.5,6.0",
			"8.3,2.3,6.0"
			
		})
		public void subtractionTest1(double a,double b,double answer) {
			Calculator c = new Calculator();
			double expected = 0.0;
			
			double actual = c.substract(expected, answer);
			
			Assertions.assertEquals(expected,actual);
			
			//Assertions.assertEquals(15.0, c.substract(20.0, 5.0));
		}
	}