package org.jabref.logic.importer.fileformat.mods;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Field;

import org.junit.jupiter.api.Test;

class testAreaDefinition {

	@Test
	public void validateSetAreaType() throws NoSuchFieldException, IllegalAccessException{
		AreaDefinition ad = new AreaDefinition();
		ad.setAreaType("Testando");
		final Field field = ad.getClass().getDeclaredField("areaType");
		field.setAccessible(true);
		assertEquals(field.get(ad), "Testando");
	}
	
	@Test
	public void validateGetAreaType() throws NoSuchFieldException, IllegalAccessException{
		AreaDefinition ad = new AreaDefinition();
		final Field field = ad.getClass().getDeclaredField("areaType");
		field.setAccessible(true);
		ad.setAreaType("Testando");
		String resultado = ad.getAreaType();
		assertEquals(resultado, "Testando");
	}

}
