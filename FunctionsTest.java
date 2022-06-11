import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FunctionsTest {

	@Test
	void test() {
		Functions obj=new Functions();
		int output=obj.even(4);
		assertEquals(4,output);
	}

}
