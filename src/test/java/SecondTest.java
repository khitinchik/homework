import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SecondTest {
    @Test
    void secondTest () {
        open("github.com");

        $("[data-test-selector=nav-search-input]").setValue("selenide").pressEnter();
        $$("ul.repo-list.li").first().$("a").click();
          $(by("data-content","Wiki")).click();
          $(".UnderLineNav-body [href='/selenide/selenide/wiki']").click();
          $(".filter-bar").$("input").setValue("sof").click();
          $("#wiki-pages-box").find(byText("SoftAssertions")).click();
          $("application-main").shouldHave(Condition.text("Using JUnit5 extend test class"));


    }
}
