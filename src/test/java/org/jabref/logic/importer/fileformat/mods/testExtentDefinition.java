package org.jabref.logic.importer.fileformat.mods;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Field;

import org.junit.Test;;

import java.math.BigInteger;

class testExtentDefinition { //TESTCLASSE
	
	/*
	protected StringPlusLanguage start;
	public StringPlusLanguage getStart() {
        return start;
    }
	public void setStart(StringPlusLanguage value) {
        this.start = value;
    }
	
	protected StringPlusLanguage end;
	public StringPlusLanguage getEnd() {
        return end;
    }
	public void setEnd(StringPlusLanguage value) {
        this.end = value;
    }
	
	protected StringPlusLanguage list;
	public StringPlusLanguage getList() {
        return list;
    }
	public void setList(StringPlusLanguage value) {
        this.list = value;
    }
	*/
	
	
	@Test
	public void validateSetTotal() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (SET)
		ExtentDefinition ed = new ExtentDefinition(); //INSTANCIA OBJ DA CLASSE
		BigInteger big = new BigInteger(10);
		ed.setTotal(big); //SET METODO
		final Field field = ed.getClass().getDeclaredField("total"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		assertEquals(field.get(ed).intValue(), 10); //COMPARAR COM O VALOR SETADO
	}
	
	
	@Test
	public void validateGetTotal() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (GET)
		ExtentDefinition ed = new ExtentDefinition(); //INSTANCIA OBJ DA CLASSE
		final Field field = ed.getClass().getDeclaredField("total"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		BigInteger big = new BigInteger(10);
		ed.setTotal(big); //SET METODO
		BigInteger resultado = ed.getTotal(); //GET DO METODO
		assertEquals(resultado.intValue(), 10); //COMPARAR COM O VALOR OBTIDO NO GET
	}
	
	
	
	
	@Test
	public void validateSetUnit() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (SET)
		ExtentDefinition ed = new ExtentDefinition(); //INSTANCIA OBJ DA CLASSE
		ed.SetUnity("Unidade"); //SET METODO
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