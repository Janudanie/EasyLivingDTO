package dk.easyliving.dto.units;

public class RelayActivator implements Iunit {
    String name = null; //Human Readable name/id
    String macAdd = null; //Mac adresse of the unit

    String pirSensorName, LdrSensorName;
    int LdrSenorValue;

    public RelayActivator(String name, String macAdd, String pirSensorName, String ldrSensorName, int ldrSenorValue) {
        this.name = name;
        this.macAdd = macAdd;
        this.pirSensorName = pirSensorName;
        this.LdrSensorName = ldrSensorName;
        this.LdrSenorValue = ldrSenorValue;
    }

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
}
