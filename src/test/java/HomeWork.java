import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import org.junit.jupiter.api.Test;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.commands.Hover;
import com.codeborne.selenide.selector.ByText;

public class HomeWork {

    @Test
    void Hover() {
        open("https://github.com/");
        $$("button").findBy(Condition.text("Solutions")).hover();
        $$(".HeaderMenu-dropdown-link").findBy(Condition.text("Enterprise")).click();
        $(byText("Build like the best")).should(exist);


    }

    @Test
    void DragNDrop() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        actions().moveToElement($("#column-a")).clickAndHold().moveByOffset(250, 0).release().perform();
        $("#column-a").shouldHave(text("B"));
    }
}
