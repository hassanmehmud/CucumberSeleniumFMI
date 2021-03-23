package service;

import domain.pages.FmiHomePage;
/**
 * This class manages the navigation services and initializes methods for each in steps definitions
 */
public class NavigateWebServ {

    private static FmiHomePage webpage;
    public void openWebPage() {
        webpage = FmiHomePage.open();

    }
    public void selectLocalWeatherLink()  {
        webpage.selectLocalWeatherLink();
    }
}
