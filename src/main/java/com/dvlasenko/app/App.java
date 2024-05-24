package com.dvlasenko.app;

import com.dvlasenko.app.config.NettyServerProvider;
import com.dvlasenko.app.controller.ContactController;

import java.net.MalformedURLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {

    private static final Logger LOGGER =
            Logger.getLogger(App.class.getName());

    public static void main(String[] args) throws MalformedURLException {
        final String httpServer = NettyServerProvider.startHttpServer(
                ContactController.class
        );

        LOGGER.log(Level.INFO, httpServer);
    }
}
