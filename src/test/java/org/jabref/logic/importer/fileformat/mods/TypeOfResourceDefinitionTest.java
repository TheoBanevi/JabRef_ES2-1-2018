import static org.junit.jupiter.api.Assertions.*;

class TypeOfResourceDefinitionTest { //TESTCLASSE

	@Test
	public void validateSetAltRepGroup() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (SET)
		TypeOfResourceDefinition tord = new TypeOfResourceDefinition(); //INSTANCIA OBJ DA CLASSE
		tord.setAltRepGroup("altRepGroupTest"); //SET METODO
		final Field field = tord.getClass().getDeclaredField("altRepGroup"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		assertEquals(field.get(tord), "altRepGroupTest"); //COMPARAR COM O NOME SETINICIAISCLASSEO
	}
	
	
	@Test
	public void validateGetAltRepGroup() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (GET)
		TypeOfResourceDefinition tord = new TypeOfResourceDefinition(); //INSTANCIA OBJ DA CLASSE
		final Field field = tord.getClass().getDeclaredField("altRepGroup"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		tord.setAltRepGroup("altRepGroupTest"); //SET METODO
		String resultado = tord.getAltRepGroup(); //GET DO METODO
		assertEquals(resultado, "altRepGroupTest"); //COMPARAR COM O NOME OBTIDO NO GET
	}

}