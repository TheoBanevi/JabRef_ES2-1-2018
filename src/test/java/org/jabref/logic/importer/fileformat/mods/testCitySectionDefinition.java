package org.jabref.logic.importer.fileformat.mods;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Field;

import org.junit.jupiter.api.Test;

class testCitySectionDefinition {

	@Test
	public void validateSetCitySection() throws NoSuchFieldException, IllegalAccessException{
		CitySectionDefinition csd = new CitySectionDefinition();
		csd.setCitySectionType("Testando");
		final Field field = csd.getClass().getDeclaredField("citySectionType");
		field.setAccessible(true);
		assertEquals(field.get(csd), "Testando");
	}
	
	@Test
	public void validateGetCitySection() throws NoSuchFieldException, IllegalAccessException{
		CitySectionDefinition csd = new CitySectionDefinition();
		final Field field = csd.getClass().getDeclaredField("citySectionType");
		field.setAccessible(true);
		csd.setCitySectionType("Testando");
		String resultado = csd.getCitySectionType();
		assertEquals(resultado, "Testando");
	}

}
