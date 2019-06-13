import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class JUnitTest {
  @Test
  public void assertTests() {
    String test1 = "JUnitTest";
    String test2 = "JUnitTest";
    String test3 = "JUnitTest";
    String test4 = "JUnitTest";
    String test5 = "JUnitTest5";
    int test6 = 1;
    int test7 = 2;
    String test8 = null;
    int[] testArray1= {1,2,3,4,5};
    int[] testArray2 = {1,2,3,4,5};


    assertEquals(test1, test2);
    assertSame(test3, test4);
    assertNotSame(test1, test5);
    assertNotNull(test8);

    assertTrue(test6 < test7);
    assertArrayEquals(testArray1, testArray2);

  }


}
