package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.HepsiburadaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;

public class HepsiburadaStepdefinition {

    HepsiburadaPage page =new HepsiburadaPage();

    @Then("The user opens the hepsiburada app")
    public void the_user_opens_the_hepsiburada_app() {
        Driver.getAppiumDriver();
    }
    @Then("Verify the opening of the hepsiburada app")
    public void verify_the_opening_of_the_hepsiburada_app() {
        assertTrue(page.logoHepsiBurada.isDisplayed());
    }
    @Then("Logs in with valid information")
    public void logs_in_with_valid_information() {
        page.buttonLogin.click();
        page.buttonGiris.click();
        page.buttonWithGoogle.click();
        page.kayitliMail.click();
    }
    @Then("verify that the correct account is logged in")
    public void verify_that_the_correct_account_is_logged_in() {
        page.buttonTamam.click();
        ReusableMethods.wait(2);
        assertTrue(page.textUserName.isDisplayed());
        page.buttonClose.click();
    }
    @Then("the user adds a selected product to the cart")
    public void the_user_adds_a_selected_product_to_the_cart() {
        page.buttonKategorilerim.click();
        page.sofraSunum.click();
        page.buttonSepeteEkle.click();
    }

    @Then("Verify that the product has been added to the cart")
    public void verify_that_the_product_has_been_added_to_the_cart() {
        page.buttonSepetim.click();
        assertTrue(page.textEkliUrunAdet.isDisplayed());
    }

    @Then("The user accesses to the payment page")
    public void the_user_accesses_to_the_payment_page() {
        page.buttonAlisverisiTamamla.click();
        ReusableMethods.wait(2);
    }

    @Then("The user enters address and card details")
    public void the_user_enters_address_and_card_details() {
        page.boxKartNo.sendKeys("4242424242424242");
        page.boxKartIsim.sendKeys("Nuran Yilmaz");
        page.boxSonKullanmaTarihi.sendKeys("0224");
        page.boxCVC.click();
        page.boxCVC.sendKeys("365");
        ReusableMethods.wait(2);
    }

    @Then("The user logs out of the hepsiburada application")
    public void the_user_logs_out_of_the_hepsiburada_application() {
        page.buttonQuit.click();
        page.buttonAnasayfam.click();
        page.buttonLogin.click();
        page.textUserName.sendKeys(Keys.END);
        page.buttonCikisYap.click();
    }


}
