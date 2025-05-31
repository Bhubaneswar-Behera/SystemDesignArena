package com.lld.design.patterns.behavioural.factory;

import com.lld.design.patterns.behavioural.factory.buttons.Button;
import com.lld.design.patterns.behavioural.factory.menu.Menu;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UIFactory uiFactory = flutter.getUIFactoryForPlatform(SupportedPlatforms.ANDROID);

        Button button = uiFactory.createButton();
        button.click();

        Menu menu = uiFactory.createMenu();
        menu.showMenu();
    }
}
