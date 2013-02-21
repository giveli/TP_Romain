import static org.junit.Assert.*;
import org.junit.Test;

public class RomanToNumeralTest {

	@Test
	public void test() {
		RomanToNumeral RTN = new RomanToNumeral();
		//RTN.Convert("IV");
		assertEquals(1259, RTN.Convert("MCghkLIX"));
	}
}
