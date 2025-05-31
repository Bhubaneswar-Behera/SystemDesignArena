package com.lld.design.patterns.creational.factory;

import com.lld.design.patterns.creational.factory.buttons.Button;
import com.lld.design.patterns.creational.factory.buttons.IOSButton;
import com.lld.design.patterns.creational.factory.menu.IOSMenu;
import com.lld.design.patterns.creational.factory.menu.Menu;

public class IOSUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }
}
