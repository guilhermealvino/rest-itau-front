package br.com.testiti.restitaufront;

import br.com.testiti.restitaufront.controller.HomeController;
import br.com.testiti.restitaufront.model.UsuarioDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@SpringBootTest
@RunWith(SpringRunner.class)
@WebAppConfiguration
class RestItauApplicationTests {


	@Autowired
	private HomeController homeControllerImpl;

	@Test
	public void testaSenha(){
		homeControllerImpl.valid();

	}


}
