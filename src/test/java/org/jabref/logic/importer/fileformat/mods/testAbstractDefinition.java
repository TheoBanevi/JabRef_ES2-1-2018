package org.jabref.logic.importer.fileformat.mods;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.lang.reflect.Field;

import org.jabref.logic.importer.fileformat.mods.AbstractDefinition;
import org.junit.jupiter.api.Test;

class testAbstractDefinition {

	@Test
	public void validateSetDisplayLabel() throws NoSuchFieldException, IllegalAccessException{
		AbstractDefinition ad = new AbstractDefinition();
		ad.setDisplayLabel("Testando");
		final Field field = ad.getClass().getDeclaredField("displayLabel");
		field.setAccessible(true);
		assertEquals(field.get(ad), "Testando");
	}
	
	@Test
	public void validateGetDisplayLabel() throws NoSuchFieldException, IllegalAccessException{
		AbstractDefinition ad = new AbstractDefinition();
		final Field field = ad.getClass().getDeclaredField("displayLabel");
		field.setAccessible(true);
		ad.setDisplayLabel("Testando");
		String resultado = ad.getDisplayLabel();
		assertEquals(resultado, "Testando");
	}

}
