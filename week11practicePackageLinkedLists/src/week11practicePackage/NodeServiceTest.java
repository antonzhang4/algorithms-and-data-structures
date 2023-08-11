package week11practicePackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NodeServiceTest {
	Node a, b, c, d, e, f;

	@BeforeEach
	public void run() {
		f = new Node(10, null);
		e = new Node(-70, f);
		d = new Node(0, e);
		c = new Node(-20, d);
		b = new Node(-60, c);
		a = new Node(-20, b);
		//a -> -20 -> -60 -> -20 -> 0 -> -70 -> 10 -> null
	}

	@Test
	void testGetFirstValue() {
		assertEquals((Integer)(-20), NodeService.getFirstValue(a));
		assertEquals((Integer)(10), NodeService.getFirstValue(f));
		assertNull(NodeService.getFirstValue(null));
	}

	@Test
	void testSum() {
		assertEquals(-160, NodeService.sum(a));
		assertEquals(-60, NodeService.sum(d));
		assertEquals(0, NodeService.sum(null));
	}

	@Test
	void testSumInRange() {
		assertEquals(-160, NodeService.sumInRange(a, -100, 100));
		assertEquals(10, NodeService.sumInRange(a, 0, 100));
		assertEquals(0, NodeService.sumInRange(a, 10000, 20000));
		assertEquals(0, NodeService.sumInRange(null, -100, 100));
	}

	@Test
	void testContains() {
		assertTrue(NodeService.contains(a, 10));
		assertTrue(NodeService.contains(a, -20));
		assertFalse(NodeService.contains(a, -30));
		assertTrue(NodeService.contains(d, 10));
		assertFalse(NodeService.contains(null, 10));
	}

	@Test
	void testAllNegative() {
		assertFalse(NodeService.allNegative(a));
		e.next = null; //get rid of last node
		assertFalse(NodeService.allNegative(a)); //zero still there
		c.next = null; //now it's a -> -20 -> -60 -> -20 -> null
		assertTrue(NodeService.allNegative(a)); 
	}

	@Test
	void testGetLastValue() {
		assertEquals((Integer)10, NodeService.getLastValue(a));
		c.next = null; //now it's a -> -20 -> -60 -> -20 -> null
		assertEquals((Integer)(-20), NodeService.getLastValue(a));
		assertNull(NodeService.getLastValue(null));
	}

	@Test
	void testOccursExactlyOnce() {
		assertTrue(NodeService.occursExactlyOnce(a, 10));
		assertFalse(NodeService.occursExactlyOnce(a, -20));
		assertFalse(NodeService.occursExactlyOnce(a, 100));			
		assertFalse(NodeService.occursExactlyOnce(null, -20));
	}

	@Test
	void testFirstPositive() {
		assertEquals(10, NodeService.firstPositiveNode(a).data);
		assertNull(NodeService.firstPositiveNode(a).next);
		assertEquals(10, NodeService.firstPositiveNode(a).data);
		assertNull(NodeService.firstPositiveNode(a).next);
		
		e.next = null; //get rid of the 10
		
		assertNull(NodeService.firstPositiveNode(a));
	}

}
