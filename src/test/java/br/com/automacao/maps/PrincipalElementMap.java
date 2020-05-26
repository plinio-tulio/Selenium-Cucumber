package br.com.automacao.maps;

import br.com.automacao.core.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PrincipalElementMap extends BasePage {

    @FindBy(css = ".login")
    protected WebElement botaoLogin;

    @FindBy(id = "SubmitCreate")
    protected WebElement botaoCadastrarUsuario;

    @FindBy(linkText = "Sign out")
    protected WebElement SignOut;

    @FindBy(id = "email_create")
    protected WebElement campoEmailCreate;
}
