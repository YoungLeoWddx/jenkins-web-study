package com.liuyang.jenkins.web.study.test.unit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.liuyang.jenkins.web.study.Caculator;

public class CaculatorTestCase {
	
	private Caculator caculaor = new Caculator();
	
	@Test
	public void testAdd() {
		assertEquals(7, caculaor.add(3, 4));
	}

	@Test
	public void testMin() {
		assertEquals(3, caculaor.min(3, 4));
		assertEquals(2, caculaor.min(3, 2));
	}

	@Test
	public void testMax() {
		assertEquals(4, caculaor.max(3, 4));
		assertEquals(3, caculaor.max(3, 2));
	}

	@Test
	public void testToSeason() {
		assertEquals("spring", caculaor.toSeason(3));
		assertEquals("summer", caculaor.toSeason(7));
	}

}
