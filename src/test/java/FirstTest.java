import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FirstTest {

        @Test
        void test () {
            open("https://demoqa.com/automation-practice-form");

            $("#firstName").setValue("name");
            $("#lastName").setValue("surname");
            $("#userEmail").setValue("email");
            $("#genterWrapper").$(byText("Female")).click();
            $("#userNumber").setValue("89277047002");
            $("#dateOfBirthInput").click();
            $(".react-datepicker__month-select").selectOption("December");
            $(".react-datepicker__year-select").selectOption("2000");
            $(".react-datepicker__day--020").click();
            $("#subjectsInput").setValue("English").pressEnter();
            $("#hobbiesWrapper").$(byText("Sports")).click();
            $("#uploadPicture").uploadFile(new File("src/test/resources/1.png"));

        }
    }
