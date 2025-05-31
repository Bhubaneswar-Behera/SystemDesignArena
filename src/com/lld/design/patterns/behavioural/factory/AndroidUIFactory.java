package com.lld.design.patterns.behavioural.factory;

import com.lld.design.patterns.behavioural.factory.buttons.AndroidButton;
import com.lld.design.patterns.behavioural.factory.buttons.Button;
import com.lld.design.patterns.behavioural.factory.menu.AndroidMenu;
import com.lld.design.patterns.behavioural.factory.menu.Menu;

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
