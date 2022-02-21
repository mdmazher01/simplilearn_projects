package Authentication.com.mazher;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;
import org.junit.jupiter.api.Test;
import com.mazher.App;

public class AppTest{
	
	@Test 
	void abc() {
		String result = new App().Authentication("12345");
		assertAll(
//				() -> assertEquals("1",result),
//				() -> assertEquals("12",result),
//				() -> assertEquals("123",result),
//				() -> assertEquals("1234",result),
				() -> assertEquals("12345",result)
				);
	}
}