package com.codecool.pcbuilder.component.componentImpl;

import com.codecool.pcbuilder.component.ComponentElectrical;

public class PowerSupply extends ComponentElectrical {


    public PowerSupply (String componentModel, int heatValue, int powerConsumptionValue) {
        super("Power Supply", heatValue, powerConsumptionValue);
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
