import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class PageG {

    SelenideElement
            blue = $("#firstName"),
            white = $("#lastName");

    public void IMYA() {
        blue.setValue("nastya");


    }




//    $("#firstName").setValue("nastya");
//    $("#lastName").setValue("surname");
}
