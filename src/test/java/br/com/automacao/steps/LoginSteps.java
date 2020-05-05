package br.com.automacao.steps;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import br.com.automacao.core.DriverFactory;
import br.com.automacao.entity.Usuario;
import br.com.automacao.factory.UsuarioFactory;
import br.com.automacao.pages.CadastroContaPage;
import br.com.automacao.pages.LoginPage;
import br.com.automacao.pages.PrincipalPage;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class LoginSteps {

	LoginPage loginPage;
	PrincipalPage principalPage;
	CadastroContaPage cadastroPage;
	Usuario usuario;

	@Before
	public void setUp() {
		DriverFactory.getDriver();
		principalPage = new PrincipalPage();
		loginPage = new LoginPage();
		cadastroPage = new CadastroContaPage();
	}

	@Dado("^que estou na tela de login$")
	public void que_estou_na_tela_de_login() throws Throwable {
		principalPage.acessarTelaPrincipal();
	}

	@Quando("^efetuo o login corretamente$")
	public void efetuo_o_login_corretamente() throws Throwable {
		loginPage.preencherCamposDatela(usuario);
		loginPage.cliqueBotaoLogin();
	}

	@Quando("^efetuo o login com dados incorretos$")
	public void efetuo_o_login_com_dados_incorretos() throws Throwable {
		Usuario usuario = UsuarioFactory.obterUsuarioLoginInvalido();
		loginPage.preencherCamposDatela(usuario);
		loginPage.cliqueBotaoLogin();
	}

	@Quando("^efetuo o login informando \"([^\"]*)\" e \"([^\"]*)\"$")
	public void efetuo_login_informando_login_e_senha(String login, String senha) throws Throwable {
		Usuario usuario = new Usuario();
		usuario.setUsuario(login);
		usuario.setSenha(senha);
		loginPage.preencherCamposDatela(usuario);
		loginPage.cliqueBotaoLogin();
	}

	@Quando("^possuo um usuario cadastrado$")
	public void possuo_um_usuario_cadastrado() throws Throwable {
		usuario = UsuarioFactory.obterNovoUsuario();
		principalPage.prencherCampoEmailCadastro(usuario.getUsuario());
		principalPage.cliqueCadastrarUsuario();
		cadastroPage.preencherCampos(usuario);
		cadastroPage.cliqueSalvar();
		principalPage.cliqueMenuSignout();
	}

	@Então("^devo visualizar a \"([^\"]*)\" de obrigatoriedade de preenchimento$")
	public void devo_visualizar_mensagem_de_obrigatoriedade_de_preenchimento(String mensagem) throws Throwable {
		Assert.assertEquals(loginPage.obterDetalhesMensagemAlerta(), mensagem);
	}

	@Então("^devo visualizar a mensagem de autenticacao invalida$")
	public void devo_visualizar_a_mensagem_de_autenticacao_invalida() throws Throwable {
		Assert.assertEquals(loginPage.obterDetalhesMensagemAlerta(), "Authentication failed.");
	}

	@Então("^devo visualizar a tela my account$")
	public void devo_visualizar_a_tenha_my_account() throws Throwable {
		Assert.assertEquals(loginPage.obterTituloTela(), "MY ACCOUNT");
	}

	@Então("^devo visualizar a mensagem informando que existe erro$")
	public void devo_visualizar_mensagem_informando_que_existe_erro() throws Throwable {
		Assert.assertEquals(loginPage.obterMensagemAlerta(), "There is 1 error");
	}

	@After(order = 2, value = { "@funcionais" })
	public void screenshot(Scenario cenario) {
		File file = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("target/screenshots/" + cenario.getId() + ".jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@After(order = 1, value = { "@funcionais" })
	public void fechaBrowser() throws InterruptedException {
		DriverFactory.killDriver();
		System.out.println("finalizando cenário de teste.");
	}

}