package jan10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayTestCase2 {

	@Test
		
		void testIsPass()
		{
			assertTrue(ArrayClass2.isPass(40));
			assertFalse(ArrayClass2.isPass(70));
			
		}
	

}
