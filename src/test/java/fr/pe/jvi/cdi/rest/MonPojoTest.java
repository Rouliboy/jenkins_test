package fr.pe.jvi.cdi.rest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MonPojoTest {

	@Test
	public void test()
	{
		MonPojo pojo = new MonPojo();
		pojo.setNom("toto");
		assertEquals("toto", pojo.getNom());
	}
}
