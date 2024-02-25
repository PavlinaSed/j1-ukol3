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

    public void setSpaceUsed(long spaceUsed) {
        this.spaceUsed = spaceUsed;
    }

    @Override
    public String toString() {
        return "Disk capacity = " + capacity + "[Byte]" +
                "; Used disk space = " + spaceUsed + "[Byte].";
    }
}
