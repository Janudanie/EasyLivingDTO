package dk.easyliving.dto.units;

import com.fasterxml.jackson.databind.ObjectMapper;

public class LdrSensor implements Iunit{

    String name = null; //Human Readable name/id
    String macAdd = null; //Mac adresse of the unit

    public LdrSensor() {
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

    public LdrSensor(String name, String macAdd) {
        this.name = name;
        this.macAdd = macAdd;
    }

    public String toJson(){
        ObjectMapper Obj = new ObjectMapper();
        String jsonStr = "";
        try {
            jsonStr = Obj.writeValueAsString(this);
        }
        catch (Exception e){
            System.out.println(e);
        }
        return jsonStr;
    }


}
