package org.jabref.logic.importer.fileformat.mods;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Field;

import org.junit.Test;;


class testGeographicCodeDefinition { //TESTCLASSE
	
	@Test
	public void validateSetAuthorityURI() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (SET)
		GeographicCodeDefinition gcd = new GeographicCodeDefinition(); //INSTANCIA OBJ DA CLASSE
		gcd.setAuthorityURI("Metodo"); //SET METODO
		final Field field = gcd.getClass().getDeclaredField("authorityURI"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		assertEquals(field.get(gcd), "Metodo"); //COMPARAR COM O NOME SETADO
	}
	
	
	@Test
	public void validateGetAuthorityURI() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (GET)
		GeographicCodeDefinition gcd = new GeographicCodeDefinition(); //INSTANCIA OBJ DA CLASSE
		final Field field = gcd.getClass().getDeclaredField("authorityURI"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		gcd.setAuthorityURI("Metodo"); //SET METODO
		String resultado = gcd.getAuthorityURI(); //GET DO METODO
		assertEquals(resultado, "Metodo"); //COMPARAR COM O NOME OBTIDO NO GET
	}
	
	
	
	
	@Test
	public void validateSetValueURI() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (SET)
		GeographicCodeDefinition gcd = new GeographicCodeDefinition(); //INSTANCIA OBJ DA CLASSE
		gcd.setValueURI("Valor"); //SET METODO
		final Field field = gcd.getClass().getDeclaredField("valueURI"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		assertEquals(field.get(gcd), "Valor"); //COMPARAR COM O NOME SETADO
	}
	
	
	@Test
	public void validateGetValueURI() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (GET)
		GeographicCodeDefinition gcd = new GeographicCodeDefinition(); //INSTANCIA OBJ DA CLASSE
		final Field field = gcd.getClass().getDeclaredField("valueURI"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		gcd.setValueURI("Valor"); //SET METODO
		String resultado = gcd.getValueURI(); //GET DO METODO
		assertEquals(resultado, "Valor"); //COMPARAR COM O NOME OBTIDO NO GET
	}
	
	
	
	
	@Test
	public void validateSetAuthority() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (SET)
		GeographicCodeDefinition gcd = new GeographicCodeDefinition(); //INSTANCIA OBJ DA CLASSE
		gcd.setAuthority("Valor"); //SET METODO
		final Field field = gcd.getClass().getDeclaredField("authority"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		assertEquals(field.get(gcd), "Valor"); //COMPARAR COM O NOME SETADO
	}
	
	
	@Test
	public void validateGetAuthority() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (GET)
		GeographicCodeDefinition gcd = new GeographicCodeDefinition(); //INSTANCIA OBJ DA CLASSE
		final Field field = gcd.getClass().getDeclaredField("authority"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		gcd.setAuthority("Valor"); //SET METODO
		String resultado = gcd.getAuthority(); //GET DO METODO
		assertEquals(resultado, "Valor"); //COMPARAR COM O NOME OBTIDO NO GET
	}
	
}