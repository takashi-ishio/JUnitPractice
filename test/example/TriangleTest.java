package example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import example.Triangle.Type;

public class TriangleTest {

	@Test
	public void testEquilateral() {
		Assertions.assertEquals(Type.Equilateral, Triangle.getType(1, 1, 1));
	}
	
}
