package org.jabref.logic.importer.fileformat.mods;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Field;

import org.junit.Test;;


class testHierarchicalPart { //TESTCLASSE
	
	@Test
	public void validateSetLevel() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (SET)
		HierarchicalPart hp = new HierarchicalPart(); //INSTANCIA OBJ DA CLASSE
		hp.setLevel("Level"); //SET METODO
		final Field field = hp.getClass().getDeclaredField("level"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		assertEquals(field.get(hp), "Level"); //COMPARAR COM O NOME SETADO
	}
	
	
	@Test
	public void validateGetLevel() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (GET)
		HierarchicalPart hp = new HierarchicalPart(); //INSTANCIA OBJ DA CLASSE
		final Field field = hp.getClass().getDeclaredField("level"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		hp.setLevel("Level"); //SET METODO
		String resultado = hp.getLevel(); //GET DO METODO
		assertEquals(resultado, "Level"); //COMPARAR COM O NOME OBTIDO NO GET
	}
	
	
	
	
	@Test
	public void validateSetPeriod() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (SET)
		HierarchicalPart hp = new HierarchicalPart(); //INSTANCIA OBJ DA CLASSE
		hp.setPeriod("Periodo"); //SET METODO
		final Field field = hp.getClass().getDeclaredField("period"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		assertEquals(field.get(hp), "Periodo"); //COMPARAR COM O NOME SETADO
	}
	
	
	@Test
	public void validateGetPeriod() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (GET)
		HierarchicalPart hp = new HierarchicalPart(); //INSTANCIA OBJ DA CLASSE
		final Field field = hp.getClass().getDeclaredField("period"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		hp.setPeriod("Periodo"); //SET METODO
		String resultado = hp.getPeriod(); //GET DO METODO
		assertEquals(resultado, "Periodo"); //COMPARAR COM O NOME OBTIDO NO GET
	}
	
	
	
	
	@Test
	public void validateSetAuthority() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (SET)
		HierarchicalPart hp = new HierarchicalPart(); //INSTANCIA OBJ DA CLASSE
		hp.setAuthority("Nome"); //SET METODO
		final Field field = hp.getClass().getDeclaredField("authority"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		assertEquals(field.get(hp), "Nome"); //COMPARAR COM O NOME SETADO
	}
	
	
	@Test
	public void validateGetAuthority() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (GET)
		HierarchicalPart hp = new HierarchicalPart(); //INSTANCIA OBJ DA CLASSE
		final Field field = hp.getClass().getDeclaredField("authority"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		hp.setAuthority("Nome"); //SET METODO
		String resultado = hp.getAuthority(); //GET DO METODO
		assertEquals(resultado, "Nome"); //COMPARAR COM O NOME OBTIDO NO GET
	}
	
	
	
	
	@Test
	public void validateSetAuthorityURI() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (SET)
		HierarchicalPart hp = new HierarchicalPart(); //INSTANCIA OBJ DA CLASSE
		hp.setAuthorityURI("Nome"); //SET METODO
		final Field field = hp.getClass().getDeclaredField("authorityURI"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		assertEquals(field.get(hp), "Nome"); //COMPARAR COM O NOME SETADO
	}
	
	
	@Test
	public void validateGetAuthorityURI() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (GET)
		HierarchicalPart hp = new HierarchicalPart(); //INSTANCIA OBJ DA CLASSE
		final Field field = hp.getClass().getDeclaredField("authorityURI"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		hp.setAuthorityURI("Nome"); //SET METODO
		String resultado = hp.getAuthorityURI(); //GET DO METODO
		assertEquals(resultado, "Nome"); //COMPARAR COM O NOME OBTIDO NO GET
	}
	
	
	
	
	@Test
	public void validateSetValueURI() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (SET)
		HierarchicalPart hp = new HierarchicalPart(); //INSTANCIA OBJ DA CLASSE
		hp.setValueURI("Valor"); //SET METODO
		final Field field = hp.getClass().getDeclaredField("valueURI"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		assertEquals(field.get(hp), "Valor"); //COMPARAR COM O NOME SETADO
	}
	
	
	@Test
	public void validateGetValueURI() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (GET)
		HierarchicalPart hp = new HierarchicalPart(); //INSTANCIA OBJ DA CLASSE
		final Field field = hp.getClass().getDeclaredField("valueURI"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		hp.setValueURI("Valor"); //SET METODO
		String resultado = hp.getValueURI(); //GET DO METODO
		assertEquals(resultado, "Valor"); //COMPARAR COM O NOME OBTIDO NO GET
	}

}