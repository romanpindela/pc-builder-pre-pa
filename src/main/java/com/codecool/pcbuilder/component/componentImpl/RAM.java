package com.codecool.pcbuilder.component.componentImpl;

import com.codecool.pcbuilder.component.ComponentElectrical;

public class RAM extends ComponentElectrical {


    public RAM (String componentModel, int heatValue, int powerConsumptionValue) {
        super("RAM", heatValue, powerConsumptionValue);
        this.componentModel = componentModel;
    }

    @Override
    public int getHeat () {
        return this.heatValue;
    }
    @Override
    public int getPowerConsumption () {
        return this.powerConsumptionValue;
    }

}
