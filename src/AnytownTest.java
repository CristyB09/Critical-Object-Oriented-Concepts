import java.util.Random;
import java.util.Scanner;

public class AnytownTest {

    private static int getRandomValue(int low, int high) {
        Random random = new Random();
        return random.nextInt(high-low); }


    public static void main(String[] args) {
//        Building building1 = new Building();
//        Building building2 = new Building( "3 High Street", "Fred Soup Factory");
//        Building building3 = new Building();

//        building1.setAddress("27 High Street");
//        building1.setOwner("Village News");
//        building3.setAddress("13 Low Street");
//        building3.setOwner("John Smith");

//        System.out.println("The address of Building 1 is " + building1.getAddress());
//        System.out.println("The owner of Building 1 is " + building1.getOwner());
//       System.out.println(building1);
//       System.out.println(building2);
//      System.out.println(building3);

//      House house1 = new House();
//      House house2 = new House("12 Main Street", "Roy Cooper", 3, true);
//      house1.setAddress("11 Main Street ");
//      house1.setOwner("Ray Cooper");
//      house1.setNumBedrooms(4);
//      house1.setHasGarage(false);
//      System.out.println(house1);
//      System.out.println(house2);
//      house2.setNumBedrooms(2);
//      house2.setHasGarage(false);
//      System.out.println(house2);
//      Shop shop1 = new Shop();
//      Shop shop2 = new Shop("8 Low Street", "Caro's Cakes", 5 ,10000);
//      shop1.setAddress("7 Low Street");
//      shop1.setOwner("Brian's Buns");
//      shop1.setNumEmployees(7);
//      shop1.setAverageTurnover(250000);
//      System.out.println(shop1);
//      System.out.println(shop2);
//      shop2.setNumEmployees(3);
//      shop2.setAverageTurnover(9000);
//      System.out.println(shop2);

//      System.out.println("\nThere are a total of " +
//                   Building.getNumBuilding() + " building of which " +
//                   House.getNumHouses()+" are houses and " +
//                   Shop.getNumShops() + " are shops");

        Building[] buildings = new Building[10];
        Scanner input = new Scanner(System.in);

        String address;
        int numBeds;
        boolean garage;
        String owner;

        for (int i = 0; i < 5; i++) {
            address = "" + (31 + i) + "Main Street";
            numBeds = getRandomValue(1, 5);
            garage = (getRandomValue(1, 100) < 50);
            System.out.print("Enter the name of the owner > ");
            owner = input.next();
            buildings[i] = new House(address, owner, numBeds, garage);
        }
        int turnover, employees;
        for (int i = 5; i < 10; i++) {
            address = "" + i + "Main Street";
            turnover = getRandomValue(10000, 1000000);
            employees = getRandomValue(5, 50);
            System.out.print("Enter the name of the owner > ");
            owner = input.next();

            buildings[i] = new Shop(address, owner,employees, turnover);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(buildings[i]);
        }
    }
}