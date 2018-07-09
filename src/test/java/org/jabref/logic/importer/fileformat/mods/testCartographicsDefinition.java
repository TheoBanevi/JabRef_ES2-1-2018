package org.jabref.logic.importer.fileformat.mods;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Field;

import org.junit.jupiter.api.Test;

class testCartographicsDefinition {

	@Test
	public void validateSetAuthority() throws NoSuchFieldException, IllegalAccessException{
		CartographicsDefinition cd = new CartographicsDefinition();
		cd.setAuthority("Testando");
		final Field field = cd.getClass().getDeclaredField("authority");
		field.setAccessible(true);
		assertEquals(field.get(cd), "Testando");
	}
	
	@Test
	public void validateGetAuthority() throws NoSuchFieldException, IllegalAccessException{
		CartographicsDefinition cd = new CartographicsDefinition();
		final Field field = cd.getClass().getDeclaredField("authority");
		field.setAccessible(true);
		cd.setAuthority("Testando");
		String resultado = cd.getAuthority();
		assertEquals(resultado, "Testando");
	}
}
