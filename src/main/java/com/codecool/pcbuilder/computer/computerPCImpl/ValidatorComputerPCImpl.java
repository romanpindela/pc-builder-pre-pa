package com.codecool.pcbuilder.computer.computerPCImpl;

import com.codecool.pcbuilder.component.Component;
import com.codecool.pcbuilder.component.HeatEmitter;
import com.codecool.pcbuilder.component.PowerConsumption;
import com.codecool.pcbuilder.component.componentImpl.CPU;
import com.codecool.pcbuilder.component.componentImpl.PowerSupply;
import com.codecool.pcbuilder.component.componentImpl.RAM;
import com.codecool.pcbuilder.computer.Computer;
import com.codecool.pcbuilder.computer.ValidatorComputer;

public class ValidatorComputerPCImpl implements ValidatorComputer {

    private final int MAX_HEAT_BALANCE = 0;
    private final int MAX_POWER_BALANCE = 0;

    @Override
    public boolean isValidComponents ( Computer c ) {
        // any computer to work should have at least CPU, RAM and PowerSupply
        return isCPUincluded(c) && isRAMincluded(c) && isPowerSupplyIncluded(c);
    }

    @Override
    public boolean isValidPowerConsumption ( Computer c ) {
        // any computer to work should use less power than it gets
        int balancedPowerConsumption = 0;
        for (Component e : c.getComponents()){
            if (e instanceof PowerConsumption ){
                balancedPowerConsumption += ((PowerConsumption)e).getPowerConsumption();
            }
        }
        return balancedPowerConsumption <= MAX_POWER_BALANCE;
    }

    @Override
    public boolean isValidHeatEmit ( Computer c ) {
        // any computer to work should emits less heat then it absorbs
        int balancedHeatEmittedByAllComponents = 0;
        for (Component e : c.getComponents()){
            if (e instanceof HeatEmitter){
                balancedHeatEmittedByAllComponents += ((HeatEmitter)e).getHeat();
            }
        }
        return balancedHeatEmittedByAllComponents <= MAX_HEAT_BALANCE;
    }

    @Override
    public boolean isValid ( Computer c ) {
        // all checks here
        return isValidComponents(c) && isValidPowerConsumption(c) && isValidHeatEmit(c);
    }


    private boolean isCPUincluded (Computer c ) {
        boolean isCPUincluded = false;
        for (Component e : c.getComponents()){
            if ( e instanceof CPU ) {
                isCPUincluded = true;
                break;
            }
        }
        return isCPUincluded;
    }

    private boolean isRAMincluded (Computer c ) {
        boolean isRamIncluded = false;
        for (Component e : c.getComponents()){
            if ( e instanceof RAM ) {
                isRamIncluded = true;
                break;
            }
        }
        return isRamIncluded;
    }


    private boolean isPowerSupplyIncluded (Computer c ) {
        boolean isPowerSupplyIncluded = false;
        for (Component e : c.getComponents()){
            if ( e instanceof RAM ) {
                isPowerSupplyIncluded = true;
                break;
            }
        }
        return isPowerSupplyIncluded;
    }
}
