import static org.junit.Assert.*;

import java.util.List;

import org.junit.*;

public class ListTests {

    @Test 
	public void testFilter() {
    List<String> arr = new ArrayList<>();
    arr.add("letter");
    arr.add("12345");
    arr.add("123");
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}
}
