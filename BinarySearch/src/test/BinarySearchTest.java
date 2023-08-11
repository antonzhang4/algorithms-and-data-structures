package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import main.Main;

public class BinarySearchTest {
	@Test
	void testBinarySearch() {
		int[] a = {10,10,10,10,10,10};
		assertTrue(Main.BinarySearch(a, 10, 0, a.length-1) >= 0);
		assertEquals(-1, Main.BinarySearch(a, 20, 0, a.length-1));

		a = new int[]{10,20,30,40,50,60,70,80,80,80,80,80,90};

		assertTrue(Main.BinarySearch(a, 10, 0, a.length-1) >= 0);
		assertTrue(Main.BinarySearch(a, 10, 0, a.length-1) < a.length);
		assertEquals(10, a[Main.BinarySearch(a, 10, 0, a.length-1)]);

		assertTrue(Main.BinarySearch(a, 80, 0, a.length-1) >= 0);
		assertTrue(Main.BinarySearch(a, 80, 0, a.length-1) < a.length);
		assertEquals(80, a[Main.BinarySearch(a, 80, 0, a.length-1)]);

		assertEquals(-1, Main.BinarySearch(a, 100, 0, a.length-1));
	}
}
