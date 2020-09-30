public class Building {

    private String address;
    private String owner;

    //static integer variable
    private static int numBuilding = 0;

    //static method
    public static int getNumBuilding(){
        return numBuilding;
    }

    //Constructor
public Building() {
    address = "";
    owner = "";
    numBuilding++; //increment the number of buildings
}

public Building(String anAddress, String anOwner){
    address = anAddress;
    owner = anOwner;
    numBuilding++; //increment the number of buildings

}

   public String getAddress() {
    return address;
   }

   public  void setAddress(String anAddress){
    address = anAddress;
   }
public String getOwner(){
    return owner;
}

public void  setOwner(String anOwner){
    owner = anOwner;
}

public String toString(){
    return address + " occupied by " + owner;
}


}
