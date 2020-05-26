package br.com.automacao.maps;

import br.com.automacao.core.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginElementMap extends BasePage {
    @FindBy(id = "SubmitLogin")
    protected WebElement botaoLogin;

    @FindBy(id = "email")
    protected WebElement campoEmail;

    @FindBy(id = "passwd")
    protected WebElement campoSenha;

    @FindBy(css = ".page-heading")
    protected WebElement tituloPagina;

    @FindBy(css = ".alert > p")
    protected WebElement mensagemAlerta;

    @FindBy(css = ".alert > ol > li")
    protected WebElement detalheMensagemAlerta;
}