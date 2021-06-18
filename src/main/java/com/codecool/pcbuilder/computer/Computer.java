package com.codecool.pcbuilder.computer;


import com.codecool.pcbuilder.component.Component;

import java.util.List;

public abstract class Computer {
    protected String computerType;

    protected String computerModel;

    protected static ValidatorComputer validatorComputer;

    protected List<Component> components;

    public Computer ( String computerType, ValidatorComputer validatorComputer, List<Component> components ) {
        this.computerType = computerType;
        this.validatorComputer = validatorComputer;
        this.components = components;
    }


    public String getComputerType () {
        return computerType;
    }

    public void addComponent(Component c){
        if (c != null){
            components.add(c);
        }
    }

    public List<Component> getComponents () {
        return components;
    }

    public void removeComponent(Component c){
        components.remove(c);
    }

    public boolean checkValid(){
        return validatorComputer.isValid(this);
    }

    @Override
    public String toString () {
        return "{" +
                "computerType='" + computerType + '\'' +
                ", computerModel='" + computerModel + '\'' +
                '}';
    }

    public void setComputerModel ( String computerModel ) {
        this.computerModel = computerModel;
    }
}
