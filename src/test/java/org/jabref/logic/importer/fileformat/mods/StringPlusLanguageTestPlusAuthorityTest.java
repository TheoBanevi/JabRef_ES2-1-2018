import static org.junit.jupiter.api.Assertions.*;

public class StringPlusLanguagePlusAuthorityTest { //TESTCLASSE

	@Test
	public void validateSetValueURI() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (SET)
		StringPlusLanguagePlusAuthority splpa = new StringPlusLanguagePlusAuthority(); //INSTANCIA OBJ DA CLASSE
		splpa.SetValueURI("ValueURITest"); //SET METODO
		final Field field = splpa.getClass().getDeclaredField("valueURI"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		assertEquals(field.get(spl), "ValueURITest"); //COMPARAR COM O NOME SETINICIAISCLASSEO
	}
	
	
	@Test
	public void validateGetValueURI() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (GET)
		StringPlusLanguagePlusAuthority spl = new StringPlusLanguagePlusAuthority(); //INSTANCIA OBJ DA CLASSE
		final Field field = spl.getClass().getDeclaredField("valueURI"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		splpa.SetValueURI("ValueURITest"); //SET METODO
		String resultado = splpa.getValueURI(); //GET DO METODO
		assertEquals(resultado, "ValueURITest"); //COMPARAR COM O NOME OBTIDO NO GET
	}

}