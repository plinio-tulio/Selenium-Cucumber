package br.com.automacao.maps;

import br.com.automacao.core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static br.com.automacao.core.DriverFactory.getDriver;

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

    @FindBy(css = "#days > option:nth-child(2)")
    protected WebElement comboValorDays;

    protected WebElement opcaoComboDays(String opcaoCombo){

        return getDriver().findElement(By.xpath("//select[@id=\"days\"]//option[@value=\""+opcaoCombo+"\"]"));
    }

    @FindBy(id = "months")
    protected WebElement comboMonth;

    @FindBy(css = "#months > option:nth-child(2)")
    protected WebElement comboValorMonth;

    protected WebElement opcaoComboMonth(String opcaoCombo){

        return getDriver().findElement(By.xpath("//select[@id=\"months\"]//option[@value=\""+opcaoCombo+"\"]"));
    }

    @FindBy(id = "years")
    protected WebElement comboYear;

    @FindBy(css = "#years > option:nth-child(2)")
    protected WebElement comboValorYear;

    protected WebElement opcaoComboYear(String opcaoCombo){

        return getDriver().findElement(By.xpath("//select[@id=\"years\"]//option[@value=\""+opcaoCombo+"\"]"));
    }

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

    protected WebElement opcaoComboState(String opcaoCombo){

        return getDriver().findElement(By.xpath("//select[@id=\"id_state\"]//option[text()=\""+opcaoCombo+"\"]"));
    }

    @FindBy(id = "postcode")
    protected WebElement campoPostCode;

    @FindBy(id = "id_country")
    protected WebElement comboCounty;

    protected WebElement opcaoComboCountry(String opcaoCombo){

        return getDriver().findElement(By.xpath("//select[@id=\"id_country\"]//option[text()=\""+opcaoCombo+"\"]"));
    }

    @FindBy(id = "phone_mobile")
    protected WebElement campoMobilePhone;

    @FindBy(id = "alias")
    protected WebElement campoAlias;

    @FindBy(id = "submitAccount")
    protected WebElement botaoSubmitAccount;
}