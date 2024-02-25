package cz.czechitas.ukol3.model;

import org.w3c.dom.ls.LSOutput;

public class Disk {
    private long capacity;
    private long spaceUsed;

    public long getCapacity() {
        return capacity;
    }

    public void setCapacity(long capacity) {
        this.capacity = capacity;
    }

    public long getSpaceUsed() {
        return spaceUsed;
    }

    public void setSpaceUsed(long spaceUsed) { //DEBUG
       // if (spaceUsed < capacity) {              //DEBUG
            this.spaceUsed = spaceUsed; //+ size;
           // System.out.println("New file was created");
       // } else {
          //  this.spaceUsed = spaceUsed;
          //  System.err.println("Not enough local disk free space");
        //}

    }

    @Override
    public String toString() {
        return "Disk: " +
                "capacity " + capacity + "[Byte]" +
                ", space used " +spaceUsed + "[Byte]";
    }
}
