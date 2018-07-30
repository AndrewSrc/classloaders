package ru.sbt.task1;

import java.net.MalformedURLException;

import static org.junit.jupiter.api.Assertions.*;

class PluginManagerTest {

    @org.junit.jupiter.api.Test
    void load() throws ClassNotFoundException, MalformedURLException, InstantiationException, IllegalAccessException {
        PluginManager pluginManager = new PluginManager( "file:target" );
        pluginManager.load( "PluginImage1", "ru.sbt.task1.PluginImage" );
        pluginManager.load( "PluginImage12", "ru.sbt.task1.PluginImage" );
     //   pluginManager.load( "PluginImage13", "ru.sbt.task1.PluginImage1" ); // check error
    }
}