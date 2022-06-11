import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class FunctionsTest4 {
	@Test
	void test() {
		Functions obj=new Functions();
		int output=obj.Factorial(6);
		assertEquals(720,output);
	} }
