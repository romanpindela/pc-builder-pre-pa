package com.codecool.pcbuilder.component.componentImpl;

import com.codecool.pcbuilder.component.ComponentElectrical;

public class CPU extends ComponentElectrical {


    public CPU (String componentModel, int heatValue, int powerConsumptionValue) {
        super("CPU", heatValue, powerConsumptionValue);
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
