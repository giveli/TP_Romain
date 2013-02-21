import static org.junit.Assert.*;

import org.junit.Test;


public class RomanComputerTest {

	RomanComputer computer = new RomanComputer();
	
	@Test
	public void testASum() {
		  assertEquals("XI", computer.compute("IX + II"));
	}

}
