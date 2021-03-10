package page;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;

@Getter
@Component
public abstract class SearchPage implements Page {

    private final Map<String, SelenideElement> elements = new HashMap<String, SelenideElement>() {{
        put("google", $(byName("q")));
    }};
}
  /*
    @Test
    public void selenideSearchTest()
    open("https://google.com");   // Открыть google
        $(byName("q")).setValue("привет").pressEnter(); // Ввести Selenide в поиск
        $("html").shouldHave(text("привет")); // Проверить, что "привет"появился в результатах поиска

     */
