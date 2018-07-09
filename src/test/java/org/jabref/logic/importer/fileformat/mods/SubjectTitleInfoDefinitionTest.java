import static org.junit.jupiter.api.Assertions.*;

class SubjectTitleInfoDefinitionTest { //TESTCLASSE

	@Test
	public void validateSetDisplayLabel() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (SET)
		SubjectTitleInfoDefinition stid = new SubjectTitleInfoDefinition(); //INSTANCIA OBJ DA CLASSE
		stid.setDisplayLabel("DisplayLabelTest"); //SET METODO
		final Field field = stid.getClass().getDeclaredField("displayLabel"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		assertEquals(field.get(stid), "DisplayLabelTest"); //COMPARAR COM O NOME SETINICIAISCLASSEO
	}
	
	
	@Test
	public void validateGetDisplayLabel() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (GET)
		SubjectTitleInfoDefinition stid = new SubjectTitleInfoDefinition(); //INSTANCIA OBJ DA CLASSE
		final Field field = stid.getClass().getDeclaredField("displayLabel"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		stid.setDisplayLabel("DisplayLabelTest"); //SET METODO
		String resultado = stid.getDisplayLabel(); //GET DO METODO
		assertEquals(resultado, "DisplayLabelTest"); //COMPARAR COM O NOME OBTIDO NO GET
	}

}