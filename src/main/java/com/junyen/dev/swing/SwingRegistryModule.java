package com.junyen.dev.swing;

import com.google.inject.AbstractModule;
import com.junyen.dev.IGame;

public class SwingRegistryModule extends AbstractModule {
    protected void configure() {
        bind(IGame.class).to(GameWindow.class);
    }
}
