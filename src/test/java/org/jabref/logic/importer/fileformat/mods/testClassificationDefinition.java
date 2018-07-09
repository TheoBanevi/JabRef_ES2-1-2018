package org.jabref.logic.importer.fileformat.mods;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Field;

import org.junit.jupiter.api.Test;

class testClassificationDefinition {

	@Test
	public void validateSetEdition() throws NoSuchFieldException, IllegalAccessException{
		ClassificationDefinition cd = new ClassificationDefinition();
		cd.setEdition("Testando");
		final Field field = cd.getClass().getDeclaredField("edition");
		field.setAccessible(true);
		assertEquals(field.get(cd), "Testando");
	}
	
	@Test
	public void validateGetEdition() throws NoSuchFieldException, IllegalAccessException{
		ClassificationDefinition cd = new ClassificationDefinition();
		final Field field = cd.getClass().getDeclaredField("edition");
		field.setAccessible(true);
		cd.setEdition("Testando");
		String resultado = cd.getEdition();
		assertEquals(resultado, "Testando");
	}

}
