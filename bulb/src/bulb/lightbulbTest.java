package bulb;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class lightbulbTest {
   lightbulb mybulb;
	@Before
	public void setUp() throws Exception {
		mybulb= new lightbulb(100);
	}

	@Test
	public void test() {
		mybulb.addcap(100);
		assertEquals(200,mybulb.getBulbwattage());
	}

}
