package org.jabref.logic.importer.fileformat.mods;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Field;

import org.junit.Test;;


class testIdentifierDefinition { //TESTCLASSE
	
	@Test
	public void validateSetDisplayLabel() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (SET)
		IdentifierDefinition id = new IdentifierDefinition(); //INSTANCIA OBJ DA CLASSE
		id.setDisplayLabel("Label"); //SET METODO
		final Field field = id.getClass().getDeclaredField("displayLabel"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		assertEquals(field.get(id), "Label"); //COMPARAR COM O NOME SETADO
	}
	
	
	@Test
	public void validateGetDisplayLabel() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (GET)
		IdentifierDefinition id = new IdentifierDefinition(); //INSTANCIA OBJ DA CLASSE
		final Field field = id.getClass().getDeclaredField("displayLabel"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		id.setDisplayLabel("Label"); //SET METODO
		String resultado = id.getDisplayLabel(); //GET DO METODO
		assertEquals(resultado, "Label"); //COMPARAR COM O NOME OBTIDO NO GET
	}
	
	
	
	
	@Test
	public void validateSetType() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (SET)
		IdentifierDefinition id = new IdentifierDefinition(); //INSTANCIA OBJ DA CLASSE
		id.setType("Tipo"); //SET METODO
		final Field field = id.getClass().getDeclaredField("type"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		assertEquals(field.get(id), "Tipo"); //COMPARAR COM O NOME SETADO
	}
	
	
	@Test
	public void validateGetType() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (GET)
		IdentifierDefinition id = new IdentifierDefinition(); //INSTANCIA OBJ DA CLASSE
		final Field field = id.getClass().getDeclaredField("type"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		id.setType("Tipo"); //SET METODO
		String resultado = id.getType(); //GET DO METODO
		assertEquals(resultado, "Tipo"); //COMPARAR COM O NOME OBTIDO NO GET
	}
	
	
	
	
	@Test
	public void validateSetTypeURI() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (SET)
		IdentifierDefinition id = new IdentifierDefinition(); //INSTANCIA OBJ DA CLASSE
		id.setTypeURI("Tipo"); //SET METODO
		final Field field = id.getClass().getDeclaredField("typeURI"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		assertEquals(field.get(id), "Tipo"); //COMPARAR COM O NOME SETADO
	}
	
	
	@Test
	public void validateGetTypeURI() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (GET)
		IdentifierDefinition id = new IdentifierDefinition(); //INSTANCIA OBJ DA CLASSE
		final Field field = id.getClass().getDeclaredField("typeURI"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		id.setTypeURI("Tipo"); //SET METODO
		String resultado = id.getTypeURI(); //GET DO METODO
		assertEquals(resultado, "Tipo"); //COMPARAR COM O NOME OBTIDO NO GET
	}
	
	
	
	
	@Test
	public void validateSetInvalid() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (SET)
		IdentifierDefinition id = new IdentifierDefinition(); //INSTANCIA OBJ DA CLASSE
		id.setInvalid("Sim"); //SET METODO
		final Field field = id.getClass().getDeclaredField("invalid"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		assertEquals(field.get(id), "Sim"); //COMPARAR COM O NOME SETADO
	}
	
	
	@Test
	public void validateGetInvalid() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (GET)
		IdentifierDefinition id = new IdentifierDefinition(); //INSTANCIA OBJ DA CLASSE
		final Field field = id.getClass().getDeclaredField("invalid"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		id.setInvalid("Sim"); //SET METODO
		String resultado = id.getInvalid(); //GET DO METODO
		assertEquals(resultado, "Sim"); //COMPARAR COM O NOME OBTIDO NO GET
	}
	
	
	
	
	@Test
	public void validateSetAltRepGroup() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (SET)
		IdentifierDefinition id = new IdentifierDefinition(); //INSTANCIA OBJ DA CLASSE
		id.setAltRepGroup("Grupo"); //SET METODO
		final Field field = id.getClass().getDeclaredField("altRepGroup"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		assertEquals(field.get(id), "Grupo"); //COMPARAR COM O NOME SETADO
	}
	
	
	@Test
	public void validateGetAltRepGroup() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (GET)
		IdentifierDefinition id = new IdentifierDefinition(); //INSTANCIA OBJ DA CLASSE
		final Field field = id.getClass().getDeclaredField("altRepGroup"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		id.setAltRepGroup("Grupo"); //SET METODO
		String resultado = id.getAltRepGroup(); //GET DO METODO
		assertEquals(resultado, "Grupo"); //COMPARAR COM O NOME OBTIDO NO GET
	}

}