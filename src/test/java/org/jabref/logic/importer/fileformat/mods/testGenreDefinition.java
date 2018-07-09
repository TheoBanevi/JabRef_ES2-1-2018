package org.jabref.logic.importer.fileformat.mods;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Field;

import org.junit.Test;;


class testGenreDefinition { //TESTCLASSE
	
	@Test
	public void validateSetType() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (SET)
		GenreDefinition gd = new GenreDefinition(); //INSTANCIA OBJ DA CLASSE
		gd.setType("Tipo"); //SET METODO
		final Field field = gd.getClass().getDeclaredField("type"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		assertEquals(field.get(gd), "Tipo"); //COMPARAR COM O NOME SETADO
	}
	
	
	@Test
	public void validateGetType() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (GET)
		GenreDefinition gd = new GenreDefinition(); //INSTANCIA OBJ DA CLASSE
		final Field field = gd.getClass().getDeclaredField("type"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		gd.setType"Tipo"); //SET METODO
		String resultado = gd.getType(); //GET DO METODO
		assertEquals(resultado, "Tipo"); //COMPARAR COM O NOME OBTIDO NO GET
	}
	
	
	
	
	
	@Test
	public void validateSetDisplayLabel() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (SET)
		GenreDefinition gd = new GenreDefinition(); //INSTANCIA OBJ DA CLASSE
		gd.setDisplayLabel("Label"); //SET METODO
		final Field field = gd.getClass().getDeclaredField("displayLabel"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		assertEquals(field.get(gd), "Label"); //COMPARAR COM O NOME SETADO
	}
	
	
	@Test
	public void validateGetDisplayLabel() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (GET)
		GenreDefinition gd = new GenreDefinition(); //INSTANCIA OBJ DA CLASSE
		final Field field = gd.getClass().getDeclaredField("displayLabel"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		gd.setDisplayLabel("Label"); //SET METODO
		String resultado = gd.getDisplayLabel(); //GET DO METODO
		assertEquals(resultado, "Label"); //COMPARAR COM O NOME OBTIDO NO GET
	}
	
	
	
	
	@Test
	public void validateSetAltRepGroup() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (SET)
		GenreDefinition gd = new GenreDefinition(); //INSTANCIA OBJ DA CLASSE
		gd.setAltRepGroup("Grupo"); //SET METODO
		final Field field = gd.getClass().getDeclaredField("altRepGroup"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		assertEquals(field.get(gd), "Grupo"); //COMPARAR COM O NOME SETADO
	}
	
	
	@Test
	public void validateGetAltRepGroup() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (GET)
		GenreDefinition gd = new GenreDefinition(); //INSTANCIA OBJ DA CLASSE
		final Field field = gd.getClass().getDeclaredField("altRepGroup"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		gd.setAltRepGroup("Grupo"); //SET METODO
		String resultado = gd.getAltRepGroup(); //GET DO METODO
		assertEquals(resultado, "Grupo"); //COMPARAR COM O NOME OBTIDO NO GET
	}
	
	
	
	
	@Test
	public void validateSetUsage() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (SET)
		GenreDefinition gd = new GenreDefinition(); //INSTANCIA OBJ DA CLASSE
		gd.setUsage("Primario"); //SET METODO
		final Field field = gd.getClass().getDeclaredField("usage"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		assertEquals(field.get(gd), "Primario"); //COMPARAR COM O NOME SETADO
	}
	
	
	@Test
	public void validateGetUsage() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (GET)
		GenreDefinition gd = new GenreDefinition(); //INSTANCIA OBJ DA CLASSE
		final Field field = gd.getClass().getDeclaredField("usage"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		gd.setUsage("Primario"); //SET METODO
		String resultado = gd.getUsage(); //GET DO METODO
		assertEquals(resultado, "Primario"); //COMPARAR COM O NOME OBTIDO NO GET
	}
}