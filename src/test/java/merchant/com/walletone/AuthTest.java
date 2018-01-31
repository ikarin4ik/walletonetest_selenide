package merchant.com.walletone;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class AuthTest {


    @Test
    public void testLogin() {
        Configuration.browser = "chrome";
        open("https://www.walletone.com/merchant/client/");
        $("#login-form input[name='login']").setValue("89225330323");
        $("#login-form input[name='password']").setValue("KFS777").pressEnter();
        $("h1").shouldHave(exactText("Единая касса"));
    }
}
