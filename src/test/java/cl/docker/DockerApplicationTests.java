package cl.docker;

import cl.docker.helper.NegocioHelper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DockerApplicationTests {

	@Autowired
	NegocioHelper negocioHelper;
	@Test
	void contextLoads() {
		negocioHelper.accion();

	}

}
