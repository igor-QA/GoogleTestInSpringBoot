package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import page.SearchPage;

@Service
public class SearchPageService extends CommonService {

    @Autowired
    private SearchPage searchPage;

    public void clickToSearchLink(){
        clickButton(searchPage,"postLink");
    }
}