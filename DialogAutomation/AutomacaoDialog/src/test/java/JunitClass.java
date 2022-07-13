import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import elementos.Elementos;
import metodos.Metodos;

public class JunitClass {

	Metodos metodos = new Metodos();
	Elementos el = new Elementos();

	@Before
	public void setUp() throws Exception {

		metodos.abrirBrowser();

	}

	@After
	public void tearDown() throws Exception {
		
		metodos.evidenciarTeste("ct 01 - Validando automacao");
		
	}

	@Test
	public void preencherFormulario() throws IOException {

		metodos.clicar(el.btnFaleComAgente);
		metodos.preencher(el.btnNome, "Lokepyol Claso");
		metodos.preencher(el.btnEmail, "teste@teste.com");
		metodos.preencher(el.btnEmpresa, "Victor e Noah Publicidade e Propaganda Ltda");
		metodos.clicar(el.btnCargoAtual);
		metodos.preencher(el.btnCelular, "11982754729");
		metodos.clicar(el.btnQtdUsuarios);
		metodos.clicar(el.btnUsoParceiros);
		metodos.clicar(el.btnEnviar);
		

	}

}
