public class House extends Building {
     private int numBedrooms;
     private boolean hasGarage;

    //static integer variable
     private static int numHouses = 0;

    //static method
     public static int getNumHouses() {
         return numHouses;
     }



    //Constructor
     public House() {
         super();
         numBedrooms = 0;
         hasGarage = false;
         numHouses++;
     }

     public House(String anAddress, String anOwner, int numBeds, boolean garage){
         super(anAddress, anOwner);
         numBedrooms = numBeds;
         hasGarage = garage;
         numHouses++;
     }

     public int getNumBedrooms() {
         return numBedrooms;
     }
     public void setNumBedrooms(int numBeds){
         numBedrooms = numBeds;
     }

public boolean getHasGarage(){
         return hasGarage;
}

public void setHasGarage(boolean garage){
         hasGarage = garage;
}

public String toString(){
         String str = "The house at " + super.toString();
         str += " has " + numBedrooms + " bedrooms and ";
         if (hasGarage) str += "a garage";
         else str += "no garage";
         return str;
}


}