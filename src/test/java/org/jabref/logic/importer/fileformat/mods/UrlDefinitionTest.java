import static org.junit.jupiter.api.Assertions.*;

class UrlDefinitionTest { //TESTCLASSE

	@Test
	public void validateSetDisplayLabel() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (SET)
		UrlDefinition ur = new UrlDefinition(); //INSTANCIA OBJ DA CLASSE
		ur.setDisplayLabel("DisplayLabelTest"); //SET METODO
		final Field field = t.getClass().getDeclaredField("displayLabel"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		assertEquals(field.get(ur), "DisplayLabelTest"); //COMPARAR COM O NOME SETINICIAISCLASSEO
	}
	
	
	@Test
	public void validateGetDisplayLabel() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (GET)
		UrlDefinition ur = new UrlDefinition(); //INSTANCIA OBJ DA CLASSE
		final Field field = ur.getClass().getDeclaredField("displayLabel"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		ur.setDisplayLabel("DisplayLabelTest"); //SET METODO
		String resultado = ur.getDisplayLabel(); //GET DO METODO
		assertEquals(resultado, "DisplayLabelTest"); //COMPARAR COM O NOME OBTIDO NO GET
	}

}