import static org.junit.jupiter.api.Assertions.*;

class TargetAudienceDefinitionTest { //TESTCLASSE

	@Test
	public void validateSetAltRepGroup() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (SET)
		TargetAudienceDefinition tad = new TargetAudienceDefinition(); //INSTANCIA OBJ DA CLASSE
		tocd.setAltRepGroup("altRepGroupTest"); //SET METODO
		final Field field = tad.getClass().getDeclaredField("altRepGroup"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		assertEquals(field.get(tad), "altRepGroupTest"); //COMPARAR COM O NOME SETINICIAISCLASSEO
	}
	
	
	@Test
	public void validateGetAltRepGroup() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (GET)
		TargetAudienceDefinition tad = new TargetAudienceDefinition(); //INSTANCIA OBJ DA CLASSE
		final Field field = tad.getClass().getDeclaredField("altRepGroup"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		tad.setAltRepGroup("altRepGroupTest"); //SET METODO
		String resultado = tad.getAltRepGroup(); //GET DO METODO
		assertEquals(resultado, "altRepGroupTest"); //COMPARAR COM O NOME OBTIDO NO GET
	}

}