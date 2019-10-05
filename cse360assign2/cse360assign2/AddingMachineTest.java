/**
 * @author Conner Eilenfeldt
 * CSE360 85141
 * Assignment 2
 * AddingMachineTest the JUnit test of AddingMachine
 */
package cse360assign2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddingMachineTest
{
	@Test
	void testAdd()
	{
		// test the initial value of myCalculator
		AddingMachine myCalculator = new AddingMachine();
		assertTrue(0 == myCalculator.getTotal(), "Initial Total != 0");

		// adding 4
		myCalculator.add(4);
		assertTrue(4 == myCalculator.getTotal(), "Total != 4");
		assertTrue("0 + 4".equals(myCalculator.toString()), "History");

		// adding 54
		myCalculator.add(54);
		assertTrue(58 == myCalculator.getTotal(), "Total != 58");
		assertTrue("0 + 4 + 54".equals(myCalculator.toString()), "History");
	}

	@Test
	void testSubtract()
	{
		// test the initial value of myCalculator
		AddingMachine myCalculator = new AddingMachine();
		assertTrue(0 == myCalculator.getTotal(), "Initial Total != 0");

		// adding 100
		myCalculator.add(100);
		assertTrue(100 == myCalculator.getTotal(), "Total != 100");
		assertTrue("0 + 100".equals(myCalculator.toString()), "History");

		// subtracting 54
		myCalculator.subtract(54);
		assertTrue(46 == myCalculator.getTotal(), "Total != 46");
		assertTrue("0 + 100 - 54".equals(myCalculator.toString()), "History");

		// subtracting 22
		myCalculator.subtract(22);
		assertTrue(24 == myCalculator.getTotal(), "Total != 24");
		assertTrue("0 + 100 - 54 - 22".equals(myCalculator.toString()), "History");

		// subtracting 24
		myCalculator.subtract(24);
		assertTrue(0 == myCalculator.getTotal(), "Total != 0");
		assertTrue("0 + 100 - 54 - 22 - 24".equals(myCalculator.toString()), "History");

		// subtracting 5
		myCalculator.subtract(5);
		assertTrue(-5 == myCalculator.getTotal(), "Total != -5");
		assertTrue("0 + 100 - 54 - 22 - 24 - 5".equals(myCalculator.toString()), "History");
	}

	@Test
	void test()
	{
		// test the initial value of myCalculator
		AddingMachine myCalculator = new AddingMachine();
		assertTrue(0 == myCalculator.getTotal(), "Initial Total != 0");

		// adding 4
		myCalculator.add(4);
		assertTrue(4 == myCalculator.getTotal(), "Total != 4");
		assertTrue("0 + 4".equals(myCalculator.toString()), "History");

		// subtracting 2
		myCalculator.subtract(2);
		assertTrue(2 == myCalculator.getTotal(), "Total != 2");
		assertTrue("0 + 4 - 2".equals(myCalculator.toString()), "History");

		// adding 5
		myCalculator.add(5);
		assertTrue(7 == myCalculator.getTotal(), "Total != 7");
		assertTrue("0 + 4 - 2 + 5".equals(myCalculator.toString()), "History");
	}

}
