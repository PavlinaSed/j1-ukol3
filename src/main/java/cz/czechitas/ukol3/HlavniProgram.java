package cz.czechitas.ukol3;

import cz.czechitas.ukol3.model.Disk;
import cz.czechitas.ukol3.model.Memory;
import cz.czechitas.ukol3.model.PC;
import cz.czechitas.ukol3.model.Processor;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

    public static void main(String... args) {
        PC pavPc = new PC();

        Processor pavProcessor = new Processor();
        pavProcessor.setSpeed(2_590_000_000L);
        pavProcessor.setManufacturer("Lenovo");

        Memory pavMemory = new Memory();
        pavMemory.setCapacity(8_000_000_000L);

        Disk pavDisk = new Disk();
        pavDisk.setCapacity(325_000_000_000L);
        pavDisk.setSpaceUsed(160_000_000_000L); //TOTO JO ?

        pavPc.turnOn();

        pavPc.setCpu(pavProcessor);
        pavPc.turnOn();
        pavPc.setRam(pavMemory);
        pavPc.turnOn();
        pavPc.setLocalDisk(pavDisk);


        System.out.println(pavDisk.toString());
        System.out.println(pavProcessor.toString());
        System.out.println(pavMemory.toString());

        System.out.println(pavPc.toString());

        pavPc.turnOn();
        System.out.println(pavPc.toString());
        pavPc.turnOn();
        System.out.println(pavPc.toString());

        pavPc.turnOff();
        //System.out.println("The computer is on = " + pavPc.isOn()); //hodnota isOn, zda je po vypnutí počítač vypnutý
        pavPc.turnOff();
        System.out.println(pavPc.toString());

        pavPc.turnOn();


       // pavPc.createFileWithSize(180_000_000_000L);
    }
}