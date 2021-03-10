package page;

import com.codeborne.selenide.SelenideElement;

import java.util.Map;

public interface Page {
    Map<String, SelenideElement> getElements();
}