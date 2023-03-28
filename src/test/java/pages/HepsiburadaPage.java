package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.time.Duration;

public class HepsiburadaPage {

    public HepsiburadaPage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(10)),this);
    }

    @FindBy (id="com.pozitron.hepsiburada:id/image_message_of_day")
    public MobileElement logoHepsiBurada;

    @FindBy (id="com.pozitron.hepsiburada:id/account_menu_button")
    public MobileElement buttonLogin;

    @FindBy (xpath = "//*[@text='Giriş yap']")
    public MobileElement buttonGiris;

    @FindBy (xpath = "(//*[@class='android.widget.Button'])[2]")
    public MobileElement buttonWithGoogle;

    @FindBy (id="com.google.android.gms:id/account_display_name")
    public MobileElement kayitliMail;

    @FindBy (id="android:id/button1")
    public MobileElement buttonTamam;

    @FindBy(id="com.pozitron.hepsiburada:id/tvUserNameFull")
    public MobileElement textUserName;

    @FindBy (id="com.pozitron.hepsiburada:id/ivToolbarBack")
    public MobileElement buttonClose;

    @FindBy (id="com.pozitron.hepsiburada:id/nav_graph_category")
    public MobileElement buttonKategorilerim;

    @FindBy (xpath = "(//*[@class='android.widget.ImageView'])[10]")
    public MobileElement sofraSunum;

    @FindBy (xpath = "(//*[@class='android.widget.Button'])[2]")
    public MobileElement buttonSepeteEkle;

    @FindBy (id="com.pozitron.hepsiburada:id/nav_graph_cart")
    public MobileElement buttonSepetim;

    @FindBy (xpath = "//*[@class='android.widget.EditText']")
    public MobileElement textEkliUrunAdet;

    @FindBy (xpath = "//*[@text='Alışverişi tamamla']")
    public MobileElement buttonAlisverisiTamamla;

    @FindBy (xpath = "(//*[@class='android.view.View'])[7]")
    public MobileElement buttonYeniAdressEkle;

    @FindBy (xpath = "(//*[@class='android.widget.EditText'])[1]")
    public MobileElement boxKartNo;

    @FindBy (xpath = "(//*[@class='android.widget.EditText'])[2]")
    public MobileElement boxKartIsim;

    @FindBy (xpath = "(//*[@class='android.widget.EditText'])[3]")
    public MobileElement boxSonKullanmaTarihi;

    @FindBy (xpath = "(//*[@class='android.widget.EditText'])[4]")
    public MobileElement boxCVC;

    @FindBy (id = "com.pozitron.hepsiburada:id/ivToolbarBack")
    public MobileElement buttonQuit;

    @FindBy (id ="com.pozitron.hepsiburada:id/nav_graph_home")
    public MobileElement buttonAnasayfam;

    @FindBy (xpath = "//*[@text='Çıkış yap']")
    public MobileElement buttonCikisYap;


}
