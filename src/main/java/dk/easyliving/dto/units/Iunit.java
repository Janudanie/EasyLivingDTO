package dk.easyliving.dto.units;



public interface Iunit {

   String name = null; //Human Readable name/id
   String macAdd = null; //Mac adresse of the unit



   public void setName(String name);
   public String getName();

   public void setMacAdd(String macAdd);
   public String getMacAdd();




}
