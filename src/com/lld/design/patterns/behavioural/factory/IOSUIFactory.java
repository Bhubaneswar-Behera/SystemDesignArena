package com.lld.design.patterns.behavioural.factory;

import com.lld.design.patterns.behavioural.factory.buttons.Button;
import com.lld.design.patterns.behavioural.factory.buttons.IOSButton;
import com.lld.design.patterns.behavioural.factory.menu.IOSMenu;
import com.lld.design.patterns.behavioural.factory.menu.Menu;

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
