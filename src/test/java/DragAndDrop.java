import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DragAndDrop {

    @Test
    void dragAndDrop() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#coloumn-a").dragAndDropTo("#coloumn-b");
        $("#coloumn-a").shouldHave(Condition.text("B"));
        $("#coloumn-b").shouldHave(Condition.text("A"));



    }
}
