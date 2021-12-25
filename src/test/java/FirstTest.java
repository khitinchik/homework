
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;


import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
public class FirstTest {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1366x768";
    }
        @Test
        void test () {
            open("https://demoqa.com/automation-practice-form");

            $("#firstName").setValue("nastya");
            $("#lastName").setValue("surname");
            $("#userEmail").setValue("nasok97@mail.ru");
            $("#genterWrapper").$(byText("Female")).click();
            $("#userNumber").setValue("9277047002");
            $("#dateOfBirthInput").click();
            $(".react-datepicker__month-select").selectOption("December");
            $(".react-datepicker__year-select").selectOption("2000");
            $(".react-datepicker__day--020").click();
            $("#subjectsInput").setValue("English").pressEnter();
            $("#hobbiesWrapper").$(byText("Sports")).click();
            $("#uploadPicture").uploadFile(new File("src/test/resources/1.png"));
            $("#currentAddress").setValue("address");
            $("#react-select-3-input").setValue("NCR").pressEnter();
            $("#react-select-4-input").setValue("Delhi").pressEnter();
            $("#submit").scrollTo().click();

            sleep(17000);
            $(".table-responsive").shouldHave(text("nastya"));
        }
    }
