package cz.czechitas.ukol3.model;

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
        return "PC power on status: " +
                " (isOn = " + isOn + "), \n" +
                "CPU = " + cpu.toString() + ", \n" +
                "Installed RAM: " + ram.toString() + ", \n" +
                "Local disk: " + localDisk.toString()
                ;
    }


    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        System.out.println("...trying to turn on the pc...");
        if (isOn) {
            System.out.println("ERR: PC is already on!");
            return;
        }

        if (ram == null || cpu == null || localDisk == null) {
            System.out.println("ERR: RAM / CPU / local disk must be set!");
            return;
        }

        isOn = true;
        System.out.println("PC turns on");
    }


    public void turnOff() {
        if (isOn) {
            isOn = false;
            System.out.println("PC turns off.");
        }
    }


    public void createFileOfSize(long size) {
        long spaceUsed = localDisk.getSpaceUsed();
        long capacity = localDisk.getCapacity();

        if (!isOn) {
            System.out.println("ERR: PC is off!");
            return;
        }

        long freeSpace = capacity - spaceUsed;
        if (size > freeSpace) {
            System.out.println("ERR: There is not enough free local disk space! ");
            return;
        }

        spaceUsed = spaceUsed + size;
        localDisk.setSpaceUsed(spaceUsed);
        System.out.println("A new file of size " + size + "[Byte] has been created, " + localDisk.getSpaceUsed() + "[Byte] of disk size is already used.");

    }


    public void deleteFilesOfSize(long size) {
        long spaceUsed = localDisk.getSpaceUsed();
        if (!isOn) {
            System.out.println("ERR: PC is off!");
            return;
        }

        if (spaceUsed-size < 0) {
            System.out.println("ERR: The used space cannot acquire negative value!");
            return;
        }

        spaceUsed = spaceUsed - size;
        localDisk.setSpaceUsed(spaceUsed);
        System.out.println("A file with size " + size + "[Byte] has been deleted, " + localDisk.getSpaceUsed() + "[Byte] of disk size is already used.");

    }
}




