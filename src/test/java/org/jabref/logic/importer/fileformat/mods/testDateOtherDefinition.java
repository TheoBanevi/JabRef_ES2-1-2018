package org.jabref.logic.importer.fileformat.mods;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Field;

import org.junit.jupiter.api.Test;

class testDateOtherDefinition {

	@Test
	public void validateSetType() throws NoSuchFieldException, IllegalAccessException{
		DateOtherDefinition dod = new DateOtherDefinition();
		dod.setType("Testando");
		final Field field = dod.getClass().getDeclaredField("type");
		field.setAccessible(true);
		assertEquals(field.get(dod), "Testando");
	}

	@Test
	public void validateGetType() throws NoSuchFieldException, IllegalAccessException{
		DateOtherDefinition dod = new DateOtherDefinition();
		final Field field = dod.getClass().getDeclaredField("type");
		field.setAccessible(true);
		dod.setType("Testando");
		String resultado = dod.getType();
		assertEquals(resultado, "Testando");
	}
}
