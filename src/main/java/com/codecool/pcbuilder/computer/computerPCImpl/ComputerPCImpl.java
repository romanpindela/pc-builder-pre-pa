package com.codecool.pcbuilder.computer.computerPCImpl;

import com.codecool.pcbuilder.component.Component;
import com.codecool.pcbuilder.component.componentImpl.CPU;
import com.codecool.pcbuilder.component.componentImpl.Fan;
import com.codecool.pcbuilder.component.componentImpl.PowerSupply;
import com.codecool.pcbuilder.component.componentImpl.RAM;
import com.codecool.pcbuilder.computer.Computer;
import com.codecool.pcbuilder.computer.ValidatorComputer;

import java.util.List;
import java.util.Optional;

public class ComputerPCImpl extends Computer {

    public ComputerPCImpl (ValidatorComputer validatorComputer,
                            List<Component> components) {
        super("Coputer PC", validatorComputer, components);
    }

    public static class Builder {

        private static final String COMPUTER_PC = "Computer PC";

        private String computerType;
        private ValidatorComputer validatorComputer;
        private List<Component> components;

        private com.codecool.pcbuilder.component.componentImpl.RAM RAM;
        private com.codecool.pcbuilder.component.componentImpl.CPU CPU;
        private PowerSupply powerSupply;

        Optional<Fan> fan = Optional.empty();
        Optional<String> computerModel = Optional.empty();


        public Builder ( ValidatorComputer validatorComputer,
                         List<Component> components){

            this.computerType = COMPUTER_PC;
            this.validatorComputer = validatorComputer;
            this.components = components;

        }

        public Builder withRAM( RAM RAM){
            this.RAM = RAM;
            return this;
        }

        public Builder withCPU ( CPU CPU){
            this.CPU = CPU;
            return this;
        }

        public Builder withPowerSupply ( PowerSupply powerSupply){
            this.powerSupply = powerSupply;
            return this;
        }

        public Builder withModelName ( String computerModel){
            this.computerModel = Optional.of(computerModel);
            return this;
        }

        public Builder withFan ( Fan fan){
            this.fan = Optional.of(fan);
            return this;
        }

        public ComputerPCImpl build(){
            ComputerPCImpl computerPC = new ComputerPCImpl(validatorComputer, components);
            computerPC.addComponent(RAM);
            computerPC.addComponent(CPU);
            computerPC.addComponent(powerSupply);
            fan.ifPresent(computerPC::addComponent);

            computerModel.ifPresent(computerPC::setComputerModel);

            return computerPC;
        }
    }

}
