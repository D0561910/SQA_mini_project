package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Tests for {@link Main}.
 *
 * @author Charles@example.com (Author)
 */
@RunWith(JUnit4.class)
public class MainTest {

    @Test
	public void testNextDate01() {
		assertEquals("month: 2 day: 3", Main.nextDate(2, 2));
	}

	@Test
	public void testNextDate02() {
		assertEquals("month: 3 day: 1", Main.nextDate(2, 28));
	}

	@Test
	public void testNextDate03() {
		assertEquals("month: 3 day: 29", Main.nextDate(3, 28));
	}

	@Test
	public void testNextDate04() {
		assertEquals("month: 5 day: 1", Main.nextDate(4, 30));
	}

	@Test
	public void testNextDate05() {
		assertEquals("month: 7 day: 1", Main.nextDate(6, 30));
	}

	@Test
	public void testNextDate06() {
		assertEquals("month: 10 day: 1", Main.nextDate(9, 30));
	}

	@Test
	public void testNextDate07() {
		assertEquals("month: 12 day: 1", Main.nextDate(11, 30));
	}

	@Test
	public void testNextDate08() {
		assertEquals("month: 1 day: 31", Main.nextDate(1, 30));
	}

	@Test
	public void testNextDate09() {
		assertEquals("month: 2 day: 1", Main.nextDate(1, 31));
	}

	@Test
	public void testNextDate10() {
		assertEquals("month: 4 day: 1", Main.nextDate(3, 31));
	}

	@Test
	public void testNextDate11() {
		assertEquals("month: 6 day: 1", Main.nextDate(5, 31));
	}

	@Test
	public void testNextDate12() {
		assertEquals("month: 8 day: 1", Main.nextDate(7, 31));
	}

	@Test
	public void testNextDate13() {
		assertEquals("month: 9 day: 1", Main.nextDate(8, 31));
	}

	@Test
	public void testNextDate14() {
		assertEquals("month: 11 day: 1", Main.nextDate(10, 31));
	}

	@Test
	public void testNextDate15() {
		assertEquals("month: 1 day: 1", Main.nextDate(12, 31));
	}

	@Test
	public void testNextDate16() {
		assertEquals("month: 11 day: 28", Main.nextDate(11, 27));
	}
}
