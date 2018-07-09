package org.jabref.logic.importer.fileformat.mods;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Field;
import java.math.BigInteger;

import org.junit.jupiter.api.Test;

class testDetailDefinition {

	@Test
	public void validateSetLevel() throws NoSuchFieldException, IllegalAccessException{
		DetailDefinition dd = new DetailDefinition();
		BigInteger intTest = new BigInteger("9999999999999"); 
		dd.setLevel(intTest);
		final Field field = dd.getClass().getDeclaredField("level");
		field.setAccessible(true);
		assertEquals(field.get(dd), intTest);
	}
	
	@Test
	public void validateGetLevel() throws NoSuchFieldException, IllegalAccessException{
		DetailDefinition dd = new DetailDefinition();
		final Field field = dd.getClass().getDeclaredField("level");
		field.setAccessible(true);
		BigInteger intTest = new BigInteger("9999999999999");
		dd.setLevel(intTest);
		BigInteger resultado = dd.getLevel();
		assertEquals(resultado, intTest);
	}

}
