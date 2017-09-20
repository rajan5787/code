package testing;

import static org.junit.Assert.*;

import org.junit.Ignore;

import org.junit.Before;
import org.junit.Test;

public class ArithmaticOperationTestTest1 {

	ArithmaticOperationTest aOper =new ArithmaticOperationTest();

	@Before
	public void setUp() throws Exception {
		
		
		System.out.println("Before test method executed");
	}

	
	@Test
	public void testSum() {
		
		int actualvalue = aOper.sum(3,4);
		//fail("Not yet implemented");
	}

	@Test
	public void testMul() {
	//	fail("Not yet implemented");
	}

}
