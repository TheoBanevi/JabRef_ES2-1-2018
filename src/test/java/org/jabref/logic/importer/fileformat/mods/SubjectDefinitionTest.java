import static org.junit.jupiter.api.Assertions.*;

class SubjectDefinitionTest { //TESTCLASSE

	@Test
	public void validateSetDisplayLabel() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (SET)
		SubjectDefinition sd = new SubjectDefinition(); //INSTANCIA OBJ DA CLASSE
		sd.setDisplayLabel("DisplayLabelTest"); //SET METODO
		final Field field = sd.getClass().getDeclaredField("DisplayLabel"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		assertEquals(field.get(sd), "DisplayLabelTest"); //COMPARAR COM O NOME SETINICIAISCLASSEO
	}
	
	
	@Test
	public void validateGetDisplayLabel() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (GET)
		SubjectDefinition sd = new SubjectDefinition(); //INSTANCIA OBJ DA CLASSE
		final Field field = sd.getClass().getDeclaredField("DisplayLabel"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		sd.setDisplayLabel("DisplayLabelTest"); //SET METODO
		String resultado = sd.getDisplayLabel(); //GET DO METODO
		assertEquals(resultado, "DisplayLabelTest"); //COMPARAR COM O NOME OBTIDO NO GET
	}

}