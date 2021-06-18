package com.codecool.pcbuilder;

import com.codecool.pcbuilder.component.Component;
import com.codecool.pcbuilder.component.componentImpl.CPU;
import com.codecool.pcbuilder.component.componentImpl.Fan;
import com.codecool.pcbuilder.component.componentImpl.PowerSupply;
import com.codecool.pcbuilder.component.componentImpl.RAM;
import com.codecool.pcbuilder.computer.Computer;
import com.codecool.pcbuilder.computer.computerPCImpl.ComputerPCImpl;
import com.codecool.pcbuilder.computer.computerPCImpl.ValidatorComputerPCImpl;
import com.codecool.pcbuilder.print.PrintComputer;
import com.codecool.pcbuilder.util.MessageBroker;

import java.util.ArrayList;

public class App {

    public static void main ( String[] args ) {
        Computer computerPC1 = new ComputerPCImpl
                .Builder(new ValidatorComputerPCImpl(),
                    new ArrayList<Component>())
                .withRAM(new RAM("Crucial RAM 8GB", 2, 8))
                .withCPU(new CPU("Intel v7 6GHz", 5,25))
                .withPowerSupply(new PowerSupply("Crucial FX Phoenix 700W", 3,-700))
                .withFan(new Fan("Super Cool Fan by TechSpeed 9600", -70, 12))
                .build();


        MessageBroker.printConsole(
                PrintComputer.print(computerPC1)
        );

        MessageBroker.printConsole(
                String.valueOf("Is Computer's PC1 configuration valid: " + computerPC1.checkValid() )
        );



        Computer computerPC2 = new ComputerPCImpl
                .Builder(new ValidatorComputerPCImpl(),
                new ArrayList<Component>())
                .withRAM(new RAM("Crucial RAM 8GB", 2, 8))
                .withCPU(new CPU("Intel v7 6GHz", 5,25))
                .withPowerSupply(new PowerSupply("Old PowerSupply 7W", 3,-7))
                .withFan(new Fan("Super Cool Fan by TechSpeed 9600", -70, 12))
                .build();


        MessageBroker.printConsole(
                PrintComputer.print(computerPC2)
        );

        MessageBroker.printConsole("\nAnd Here is another computer's configuration.");
        MessageBroker.printConsole("ComputerPC2 power supply is to low. Configuration's validation shoud fail. Let's check:");
        MessageBroker.printConsole(
                String.valueOf("Is Computer's PC2 configuration valid: " + computerPC2.checkValid() )
        );



    }

}
