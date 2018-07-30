package ru.sbt.task1;

public class PluginImage implements Plugin {
    public PluginImage() {
        System.out.println("constructor");
    }

    @Override
    public void doUsefull() {
        System.out.println("doUsefull");
    }

    @Override
    public void loadImage() {
        System.out.println("loadImage");
    }
}
