import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test 
	public void testReverseInPlace2() {
    int[] input1 = {1,2,3};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{3,2,1}, input1);
	}

  @Test
  public void testReversed2() {
    int[] input1 = {1,2,3};
    assertArrayEquals(new int[]{3,2,1}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testaverageWithoutLowest(){
    double[] input= {3.0,3.0,2.0,-1.0};
    assertEquals((3.0+3.0+2.0)/3, ArrayExamples.averageWithoutLowest(input), 0.0001);
  }


  @Test
  public void testaverageWithoutLowest2(){
    double[] input= {3.0};
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(input), 0.0001);
  }

  @Test
  public void testaverageWithoutLowest3(){
    double[] input= {};
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(input), 0.0001);
  }

  @Test
  public void testaverageWithoutLowest4(){
    double[] input= {3.0,3.0};
    assertEquals(3.0, ArrayExamples.averageWithoutLowest(input), 0.0001);
  }
}
