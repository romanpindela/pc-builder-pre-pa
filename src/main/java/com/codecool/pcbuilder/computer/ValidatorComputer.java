package com.codecool.pcbuilder.computer;

public interface ValidatorComputer {


    boolean isValidComponents ( Computer c );
    boolean isValidPowerConsumption (Computer c);
    boolean isValidHeatEmit (Computer c);

    boolean isValid(Computer c);

}
