import static org.junit.jupiter.api.Assertions.*;

public class TemporalDefinitionTest { //TESTCLASSE

	@Test
	public void validateSetValueURI() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (SET)
		TemporalDefinition td = new TemporalDefinition(); //INSTANCIA OBJ DA CLASSE
		td.SetValueURI("ValueURITest"); //SET METODO
		final Field field = td.getClass().getDeclaredField("valueURI"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		assertEquals(field.get(td), "ValueURITest"); //COMPARAR COM O NOME SETINICIAISCLASSEO
	}
	
	
	@Test
	public void validateGetValueURI() throws NoSuchFieldException, IllegalAccessException{ //VALIDATEMETODO (GET)
		TemporalDefinition td = new TemporalDefinition(); //INSTANCIA OBJ DA CLASSE
		final Field field = spl.getClass().getDeclaredField("valueURI"); //NOME DO ATRIBUTO
		field.setAccessible(true);
		td.SetValueURI("ValueURITest"); //SET METODO
		String resultado = td.getValueURI(); //GET DO METODO
		assertEquals(resultado, "ValueURITest"); //COMPARAR COM O NOME OBTIDO NO GET
	}

}