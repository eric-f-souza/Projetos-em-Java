import static org.junit.jupiter.api.Assertions.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.jupiter.api.Test;


@RunWith(MockitoJUnitRunner.class)
class TestesUnitarios {
	
	@MockBean
	private Contatos testeContato;
	
	@injectMocks
	private Controller testeController;
	
	
	private DAO testeDAO;
	
	Method method = TargetClass.getDeclaredMethod(methodName, argClasses);
	
	@BeforeEach
	void setup() {
		testeController = new Controller();
	}
	
	Method method = Target
	
	@Test
	void testDAO() {
		
		
	}

}
