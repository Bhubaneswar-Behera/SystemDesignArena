package com.lld.design.patterns.creational.factory;

import com.lld.design.patterns.creational.factory.buttons.AndroidButton;
import com.lld.design.patterns.creational.factory.buttons.Button;
import com.lld.design.patterns.creational.factory.menu.AndroidMenu;
import com.lld.design.patterns.creational.factory.menu.Menu;

public class AndroidUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
}
