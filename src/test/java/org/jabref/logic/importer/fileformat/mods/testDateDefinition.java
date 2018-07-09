package org.jabref.logic.importer.fileformat.mods;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Field;

import org.junit.jupiter.api.Test;

class testDateDefinition {

	@Test
	public void validateSetEncoding() throws NoSuchFieldException, IllegalAccessException{
		DateDefinition dd = new DateDefinition();
		dd.setEncoding("Testando");
		final Field field = dd.getClass().getDeclaredField("encoding");
		field.setAccessible(true);
		assertEquals(field.get(dd), "Testando");
	}
	
	@Test
	public void validateGetEncoding() throws NoSuchFieldException, IllegalAccessException{
		DateDefinition dd = new DateDefinition();
		final Field field = dd.getClass().getDeclaredField("encoding");
		field.setAccessible(true);
		dd.setEncoding("Testando");
		String resultado = dd.getEncoding();
		assertEquals(resultado, "Testando");
	}
}
