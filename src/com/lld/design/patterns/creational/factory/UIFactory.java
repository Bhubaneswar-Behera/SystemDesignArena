package com.lld.design.patterns.creational.factory;

import com.lld.design.patterns.creational.factory.buttons.Button;
import com.lld.design.patterns.creational.factory.menu.Menu;

public interface UIFactory {
    Button createButton();

    Menu createMenu();
}
