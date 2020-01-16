package model;

public class MemberAll {

   private String Army_id;
   private String Army_name;
   private String Army_birth;
   private String BloodType;
   private String Sex;
   private String Address;
   private String Mos;
   private String Enlist;
   private String Discharge;
   private String ArmyClass;
   private String VacaTion;
   
   public MemberAll(String army_id, String armyClass, String mos, String army_name, String army_birth,  String sex, String address, 
         String bloodType, String vacaTion, String enlist, String discharge) {
      super();
      Army_id = army_id;
      ArmyClass = armyClass;
      Mos = mos;
      Army_name = army_name;
      Army_birth = army_birth;
      Sex = sex;
      Address = address;
      BloodType = bloodType;
      VacaTion = vacaTion;
      Enlist = enlist;
      Discharge = discharge;
   }
   
   public String getArmy_id() {
      return Army_id;
   }
   
   public void setArmy_id(String army_id) {
	   Army_id = army_id;
   }

   public String getArmy_name() {
      return Army_name;
   }
   public void setArmy_name(String army_name) {
	   Army_name = army_name;
   }
   
   public String getSex() {
	   return Sex;
   }
   
   public void setSex(String sex) {
      Sex = sex;
   }


   public String getArmy_birth() {
      return Army_birth;
   }

   public void setArmy_birth(String army_birth) {
      Army_birth = army_birth;
   }

   public String getBloodType() {
      return BloodType;
   }

   public void setBloodType(String bloodType) {
      BloodType = bloodType;
   }

   public String getAddress() {
      return Address;
   }

   public void setAddress(String address) {
      Address = address;
   }

   public String getMos() {
      return Mos;
   }

   public void setMos(String mos) {
      Mos = mos;
   }

   public String getEnlist() {
      return Enlist;
   }

   public void setEnlist(String enlist) {
      Enlist = enlist;
   }

   public String getDischarge() {
      return Discharge;
   }

   public void setDischarge(String discharge) {
      Discharge = discharge;
   }

   public String getArmyClass() {
      return ArmyClass;
   }

   public void setArmyClass(String armyClass) {
      ArmyClass = armyClass;
   }

   public String getVacaTion() {
      return VacaTion;
   }

   public void setVacaTion(String vacaTion) {
      VacaTion = vacaTion;
   }
   
   
}