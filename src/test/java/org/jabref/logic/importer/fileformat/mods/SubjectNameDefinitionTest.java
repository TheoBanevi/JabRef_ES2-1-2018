import static org.junit.jupiter.api.Assertions.*;

class SubjectNameDefinitionTest { //TESTCLASSE

	@Test
	public void validateSetDisplayLabel() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (SET)
		SubjectNameDefinition snd = new SubjectNameDefinition(); //INSTANCIA OBJ DA CLASSE
		snd.setDisplayLabel("DisplayLabelTest"); //SET METODO
		final Field field = snd.getClass().getDeclaredField("displayLabel"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		assertEquals(field.get(snd), "DisplayLabelTest"); //COMPARAR COM O NOME SETINICIAISCLASSEO
	}
	
	
	@Test
	public void validateGetDisplayLabel() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (GET)
		SubjectNameDefinition snd = new SubjectNameDefinition(); //INSTANCIA OBJ DA CLASSE
		final Field field = snd.getClass().getDeclaredField("displayLabel"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		snd.setDisplayLabel("DisplayLabelTest"); //SET METODO
		String resultado = snd.getDisplayLabel(); //GET DO METODO
		assertEquals(resultado, "DisplayLabelTest"); //COMPARAR COM O NOME OBTIDO NO GET
	}

}