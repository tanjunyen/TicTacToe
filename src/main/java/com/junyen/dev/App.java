package com.junyen.dev;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.junyen.dev.swing.GameWindow;
import com.junyen.dev.swing.SwingRegistryModule;

import javax.swing.*;

public class App
{
    public static void main( String[] args )
    {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Injector injector = Guice.createInjector(new SwingRegistryModule());
                IGame game = injector.getInstance(IGame.class);
                game.run();
            }
        });
    }
}
