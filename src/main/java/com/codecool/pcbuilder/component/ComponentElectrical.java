package com.codecool.pcbuilder.component;

public abstract class ComponentElectrical extends Component implements HeatEmitter, PowerConsumption {
    protected int heatValue;
    protected int powerConsumptionValue;

    public ComponentElectrical ( String componentType, int heatValue, int powerConsumptionValue ) {
        super(componentType);
        this.heatValue = heatValue;
        this.powerConsumptionValue = powerConsumptionValue;
    }


    @Override
    public String toString () {
        return "> {" +
                "componentType='" + componentType + '\'' +
                ", componentModel='" + componentModel + '\'' +
                ", heatValue=" + heatValue +
                ", powerConsumptionValue=" + powerConsumptionValue +
                '}';
    }
}
