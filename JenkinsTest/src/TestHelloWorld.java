import org.junit.Assert;
import org.junit.Test;

public class TestHelloWorld {

/** A test that always fails. **/
	@Test public void helloTest() {
		HelloWorld hw = new HelloWorld();
		String output = hw.getM();
        	Assert.assertEquals("Hello, World!", output);
    	}
}