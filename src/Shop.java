public class Shop extends Building {
       private int numEmployees;
       private int averageTurnover;

    //static integer variable
    private static int numShops = 0;

    //static method
    public static int getNumShops() {
        return numShops;
    }



    public Shop() {
        super();
        numEmployees = 0;
        averageTurnover = 0;
        numShops++;
    }

    public Shop(String anAddress, String anOwner, int numEmp, int turnover){
        super(anAddress, anOwner);
        numEmployees = numEmp;
        averageTurnover = turnover;
        numShops++;
    }


    public int getNumEmployees(){
        return numEmployees;
    }

    public void setNumEmployees(int employees){
        numEmployees = employees;
    }

    public int getAverageTurnover(){
        return averageTurnover;
    }

    public  void setAverageTurnover(int turnover){
        averageTurnover = turnover;
    }
    public String toString(){
        String str = "The shop at " + super.toString();
        str += " has " + numEmployees + " employees and ";
        str += "an average annual turnover of $" + averageTurnover;
        return str;


    }

}