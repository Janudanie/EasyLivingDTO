package dk.easyliving.dto.units;

public class PirSensor implements Iunit {

    String name = null; //Human Readable name/id
    String macAdd = null; //Mac adresse of the unit

    // The time it should turn something on for in seconds
    int timeToPublish=0;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setMacAdd(String macAdd) {
        this.macAdd = macAdd;

    }

    @Override
    public String getMacAdd() {
        return this.macAdd;
    }

    public int getTimeToPublish() {
        return timeToPublish;
    }

    public void setTimeToPublish(int timeToPublish) {
        this.timeToPublish = timeToPublish;
    }
}
