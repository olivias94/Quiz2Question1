package TuitionQuestion;

import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class MainClassJunit {
	
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception{
	}
	
	@Before
	public void setUp() throws Exception{
	}
	
	@After
	public void tearDown() throws Exception{
	}
	
	@Test
	public void testReturnTotalTuitionCost(){
		TotalTuitionBill t1 = new TotalTuitionBill(20000.0, 0.05, .1, 10.0);
		TotalTuitionBill t2 = new TotalTuitionBill(5000.0, 0.10, 0.1, 10.0);
		TotalTuitionBill t3 = new TotalTuitionBill(100000.0, 0.05, .1, 10.0);
		TotalTuitionBill t4 = new TotalTuitionBill(20000.0, 0.5, .1, 10.0);

		
		
		assertTrue("Assertion is False1", t1.returnTotalTuitionCost()==24310.125);
		assertTrue("Assertion is False2", t2.returnTotalTuitionCost()==7320.5);
		assertTrue("Assertion is False3", t3.returnTotalTuitionCost()==131079.601);
		assertTrue("Assertion is False4", t4.returnTotalTuitionCost()==68.024448);
	}

}	