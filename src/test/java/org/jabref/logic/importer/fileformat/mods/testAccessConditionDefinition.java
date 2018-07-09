package org.jabref.logic.importer.fileformat.mods;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Field;

import org.junit.jupiter.api.Test;

class testAccessConditionDefinition {

	@Test
	public void validateSetAtType() throws NoSuchFieldException, IllegalAccessException{
		AccessConditionDefinition acd = new AccessConditionDefinition();
		acd.setAtType("Testando");
		final Field field = acd.getClass().getDeclaredField("atType");
		field.setAccessible(true);
		assertEquals(field.get(acd), "Testando");
	}

	@Test
	public void validateGetAtType() throws NoSuchFieldException, IllegalAccessException{
		AccessConditionDefinition acd = new AccessConditionDefinition();
		final Field field = acd.getClass().getDeclaredField("atType");
		field.setAccessible(true);
		acd.setAtType("Testando");
		String resultado = acd.getAtType();
		assertEquals(resultado, "Testando");
	}

}
