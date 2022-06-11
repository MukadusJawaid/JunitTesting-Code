import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class FunctionsTest3 {
	@Test
	void test() {
		Functions obj=new Functions();
		int output=obj.Prime(7);
		assertEquals(7,output);}
}
