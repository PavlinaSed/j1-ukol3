package cz.czechitas.ukol3;

public class PC {
    private boolean isOn;
    private Processor cpu;
    private Memory ram;
    private Disk localDisk;

    public Processor getCpu() {
        return cpu;
    }

    public void setCpu(Processor cpu) {
        this.cpu = cpu;
    }

    public Memory getRam() {
        return ram;
    }

    public void setRam(Memory ram) {
        this.ram = ram;
    }

    public Disk getPevnyDisk() {
        return localDisk;
    }

    public void setLocalDisk(Disk localDisk) {
        this.localDisk = localDisk;
    }

    @Override
    public String toString() {
        return "Pc " +
                " isOn= (" + isOn +"), \n" +
                "cpu = " + cpu + ", \n" +
                "installed ram= " + ram + ", \n" +
                "local disk= " + localDisk
                ;
    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        if (!isOn) {
            isOn = true;
            System.out.println("PC turns on");
        } else {
            System.err.println("PC is already on.");
        }

    }


    public void turnOff() {
        if (isOn) {
            isOn = false;
            System.out.println("PC turns off.");
        } else {
            return;
        }
    }

}