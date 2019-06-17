import junit.framework.TestCase;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;

import static org.junit.Assert.*;

public class JUnitTest {
  @Test
  public void assertTests() {
    JUnitCalculations ju = new JUnitCalculations();
    String responseString = "The first value needs to be greater than the second value";

    int[] testArray1= {1,2,3,4,5};
    int[] testArray2 = {1,2,3,4,5};


    assertEquals(ju.getNames(2), "Sally");
    assertSame(ju.multiplyNumbers(2,5), 10);
    assertNotSame(ju.getNames(0), "Bob");
    assertNull(ju.getNames(3));
    assertNotNull(ju.getNames(2));
    assertFalse("1 is greater than 2", ju.isGreaterThan(1,2));
    assertTrue("2 is greater than 1", ju.isGreaterThan(2,1));
    assertArrayEquals(testArray1, testArray2);
    assertThat(responseString, anyOf(containsString("value")));

  }


}
