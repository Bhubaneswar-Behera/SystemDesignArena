package com.lld.design.patterns.creational.factory;

import com.lld.design.patterns.creational.factory.buttons.Button;
import com.lld.design.patterns.creational.factory.menu.Menu;

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
