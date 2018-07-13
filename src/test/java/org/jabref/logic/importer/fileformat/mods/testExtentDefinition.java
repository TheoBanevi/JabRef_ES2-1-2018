package org.jabref.logic.importer.fileformat.mods;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Field;

import java.math.BigInteger;

import org.junit.jupiter.api.Test;

class testExtentDefinition { //TESTCLASSE
		
	@Test
	public void validateSetTotal() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (SET)
		ExtentDefinition ed = new ExtentDefinition(); //INSTANCIA OBJ DA CLASSE
		BigInteger big = new BigInteger("10");
		ed.setTotal(big); //SET METODO
		final Field field = ed.getClass().getDeclaredField("total"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		assertEquals(field.get(ed), big); //COMPARAR COM O VALOR SETADO
	}
	
	
	@Test
	public void validateGetTotal() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (GET)
		ExtentDefinition ed = new ExtentDefinition(); //INSTANCIA OBJ DA CLASSE
		final Field field = ed.getClass().getDeclaredField("total"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		BigInteger big = new BigInteger("10");
		ed.setTotal(big); //SET METODO
		BigInteger resultado = ed.getTotal(); //GET DO METODO
		assertEquals(resultado, big); //COMPARAR COM O VALOR OBTIDO NO GET
	}
	
	
	
	
	@Test
	public void validateSetUnit() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (SET)
		ExtentDefinition ed = new ExtentDefinition(); //INSTANCIA OBJ DA CLASSE
		ed.setUnit("Unidade"); //SET METODO
		final Field field = ed.getClass().getDeclaredField("unit"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		assertEquals(field.get(ed), "Unidade"); //COMPARAR COM O NOME SETADO
	}
	
	
	@Test
	public void validateGetUnit() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (GET)
		ExtentDefinition ed = new ExtentDefinition(); //INSTANCIA OBJ DA CLASSE
		final Field field = ed.getClass().getDeclaredField("unit"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		ed.setUnit("Unidade"); //SET METODO
		String resultado = ed.getUnit(); //GET DO METODO
		assertEquals(resultado, "Unidade"); //COMPARAR COM O NOME OBTIDO NO GET
	}
	
	
}