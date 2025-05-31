package com.lld.design.patterns.behavioural.factory;

import com.lld.design.patterns.behavioural.factory.buttons.Button;
import com.lld.design.patterns.behavioural.factory.menu.Menu;

public interface UIFactory {
    Button createButton();

    Menu createMenu();
}
