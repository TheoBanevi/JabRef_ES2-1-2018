package org.jabref.logic.importer.fileformat.mods;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Field;

import org.junit.jupiter.api.Test;

class testAlternativeNameDefinition {

	@Test
	public void validateSetDisplayLabel() throws NoSuchFieldException, IllegalAccessException{
		AlternativeNameDefinition and = new AlternativeNameDefinition();
		and.setDisplayLabel("Testando");
		final Field field = and.getClass().getDeclaredField("displayLabel");
		field.setAccessible(true);
		assertEquals(field.get(and), "Testando");
	}
	
	@Test
	public void validateGetDisplayLabel() throws NoSuchFieldException, IllegalAccessException{
		AlternativeNameDefinition and = new AlternativeNameDefinition();
		final Field field = and.getClass().getDeclaredField("displayLabel");
		field.setAccessible(true);
		and.setDisplayLabel("Testando");
		String resultado = and.getDisplayLabel();
		assertEquals(resultado, "Testando");
	}

}
