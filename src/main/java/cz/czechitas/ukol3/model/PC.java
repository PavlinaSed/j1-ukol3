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

    //NEBO SI MAM VYTVORIT NOVÝ SETTER PRO SPACE USED ?

    @Override
    public String toString() {
        return "Pc " +
                " isOn= (" + isOn + "), \n" +
                "cpu = " + cpu.toString() + ", \n" +
                "installed ram= " + ram.toString() + ", \n" +
                "local disk= " + localDisk.toString()
                ;
    }


    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        System.out.println("trying to turn on the pc");
        if (isOn) {
            System.out.println("ERR: PC is already on.");
            return;
        }

        if (ram == null || cpu == null || localDisk == null) {
            System.out.println("ERR: Ram, cpu, local disk must be set");
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

    /* public void createFileWithSize(long size) {
        if (isOn){
            createFileWithSize(size);
        } else {

        }
    }
*/


    /* public void createFileWithSize(long size) {
        long spaceUsed = localDisk.getSpaceUsed(); //PROČ JE TADY LOCALDISK A NE PAVDISK ????????
        long capacity = localDisk.getCapacity();

        if (isOn) {                                // nebo tohle celé bude v závorce setteru ?
            if (spaceUsed < capacity) {
                spaceUsed = spaceUsed + size;
                localDisk.setSpaceUsed(spaceUsed);
                System.out.println("New file with size " + size + " Bytes was created, " + (capacity - spaceUsed) + "free space remains");
            } else {
                System.err.println("there is not enough free localdisk space ");
            }
        } else {
            return;
        }
    }


    public void deleteFilesWithSize(long size) {
        long spaceUsed = localDisk.getSpaceUsed();
        if (isOn) {
            setSpaceUsed(
            if (spaceUsed >= 0) {       //spaceUsed nemůže klesnout pod 0
                spaceUsed = spaceUsed - size;
                System.out.println("The file of size " + size + " was deleted");
            }
            );
        } else return;
    } */
}




