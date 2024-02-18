package cz.czechitas.ukol3;

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

        pavPc.setCpu(pavProcessor);
        pavPc.setRam(pavMemory);
        pavPc.setLocalDisk(pavDisk);

        System.out.println(pavPc.toString());

        //System.out.println("The computer is on = " + pavPc.isOn()); //počáteční hodnota isOn
        pavPc.turnOn();
        //System.out.println("The computer is on = " + pavPc.isOn()); //hodnota isOn po prvním zapnutí
        pavPc.turnOn();

        pavPc.turnOff();
        //System.out.println("The computer is on = " + pavPc.isOn()); //hodnota isOn, zda je po vypnutí počítač vypnutý
        pavPc.turnOff();
    }
}