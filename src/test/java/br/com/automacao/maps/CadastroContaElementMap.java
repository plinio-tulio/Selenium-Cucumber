package br.com.automacao.maps;

import br.com.automacao.core.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class CadastroContaElementMap extends BasePage {
    @FindBy(id = "id_gender1")
    protected WebElement checkMr;

    @FindBy(id = "id_gender2")
    protected WebElement checkMrs;

    @FindBy(id = "customer_firstname")
    protected WebElement campoCustumerFirstName;

    @FindBy(id = "customer_lastname")
    protected WebElement campoCustumerLastName;

    @FindBy(id = "passwd")
    protected WebElement campoPassword;

    @FindBy(id = "days")
    protected WebElement comboDays;

    @FindBy(xpath = "//select[@id='days']/option")
    protected List<WebElement> opcoesComboDays;

    @FindBy(id = "months")
    protected WebElement comboMonth;

    @FindBy(xpath = "//select[@id='months']/option")
    protected List<WebElement> opcoesComboMes;

    @FindBy(id = "years")
    protected WebElement comboYear;

    @FindBy(xpath = "//select[@id='years']/option")
    protected List<WebElement> opcoesComboAno;

    @FindBy(id = "firstname")
    protected WebElement campoFirstName;

    @FindBy(id = "lastname")
    protected WebElement campoLastName;

    @FindBy(id = "company")
    protected WebElement campoCompany;

    @FindBy(id = "address1")
    protected WebElement campoAndress;

    @FindBy(id = "city")
    protected WebElement campoCity;

    @FindBy(id = "id_state")
    protected WebElement comboState;

    @FindBy(xpath = "//select[@id='id_state']/option")
    protected List<WebElement> opcoesComboState;

    @FindBy(id = "postcode")
    protected WebElement campoPostCode;

    @FindBy(id = "id_country")
    protected WebElement comboCounty;

    @FindBy(xpath = "//select[@id='id_country']/option")
    protected List<WebElement> opcoesComboCountry;

    @FindBy(id = "phone_mobile")
    protected WebElement campoMobilePhone;

    @FindBy(id = "alias")
    protected WebElement campoAlias;

    @FindBy(id = "submitAccount")
    protected WebElement botaoSubmitAccount;
}