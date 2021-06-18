package com.codecool.pcbuilder.component.componentImpl;

import com.codecool.pcbuilder.component.*;


public class Fan extends ComponentElectrical {


    public Fan (String componentModel, int heatValue, int powerConsumptionValue) {
        super("Fan",heatValue, powerConsumptionValue);
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
