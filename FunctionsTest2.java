import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FunctionsTest2 {

	@Test
	void test() {
		Functions obj=new Functions();
		int output=obj.oddno(5);
		assertEquals(5,output);
	}

}
