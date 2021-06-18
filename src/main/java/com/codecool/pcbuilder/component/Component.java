package com.codecool.pcbuilder.component;

public abstract class Component {
    protected String componentType;
    protected String componentModel;

    public Component ( String componentType ) {
        this.componentType = componentType;
    }

}
