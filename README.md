
                         Static Variables and Methods

So far, the variables and methods we have used have been instance variables and instance
methods
• a copy of the variable exists for each instance of the class
• methods are applied to instances of the class
• Static variables and static methods belong to the class – not to a particular instance
• They are often “helper” methods and associated data that provide a general service
to the application
• E.G. in our Anytown project, we might want to keep track of the total number of
buildings that can be generated 

                        Static Variables and Methods

public class Building {
private String address;
private String owner;
private static int numBuildings = 0;
public static int getNumBuildings() {
return numBuildings;
}
// ...
}
Static (class) variable
Static (class) method

                        Scenario

Add a static integer variable numBuildings to the Building class along with the static
method getNumBuildings() that returns it. Also, update both constructor methods so that
the value of numBuildings is incremented every time a new Building is created.
• Add code to the AnytownTest class so that the number of buildings created is displayed as
the final output.
• Now, provide a similar static variable and method for each of the House and Shop classes and
make appropriate modifications to their constructors.
• Add code to the AnytownTest class to modify the final output message so that it takes the
form (e.g.)
“There are a total of 6 buildings of which 4 are houses and 2 are shops” 

                      Arrays and Loops

• Arrays are ordered collections of elements – starting from index position zero
Arrays and Loops
int[] intArray; // a new array reference
int[] anotherArray = new int[10]; // allocates space
Building[] buildings = new Building[5];// array of objects
char[] charArray = { ‘A’, ‘B’, ‘C’ }; // declare and initialise
• Often used in conjunction with loops
for (int index = 0; index < charArray.length; index++) {
System.out.println(charArray[index]);

}


                    Scenario

Revisit the main() method of the AnytownTest class and write code to declare an array of
10 Building objects
• Add a for loop to create 5 new House objects in array positions 0–4, for any 5 consecutive
street numbers on High Street (for example, numbers 31-35). Each house should have 3
bedrooms and no garage, and the owner of the house should be “Anytown District Council”
• Repeat the previous step for 5 new Shop objects in consecutive addresses on Main Street. The
shops should have a number of employees that matches the address number and a turnover
that is 1000 times bigger than the door number. All shops are owned by “Anytown Shopping
Centre”
• Finally, provide a for loop to print out details of all 10 newly created buildings

                 Other useful stuff…

Generating random values
• Receiving keyboard entry
import java.util.Random;
Random random = new Random();
int randomVal = random.nextInt(100); // rand value < 100
import java.util.Scanner;
Scanner input = new Scanner(System.in);
String userInput = input.next(); // keyboard input

                Scenario

• Modify the code produced in the previous Scenario so that…
i. the values for number of bedrooms, garage, number of employees and average turnover
are random values (within an appropriate range)
ii. the name of the owner is provided by the user in response to a prompt




• Add a static integer variable numBuildings to the Building class along with the static
method getNumBuildings() that returns it. Also, update both constructor methods so that
the value of numBuildings is incremented every time a new Building is created.
• Add code to the AnytownTest class so that the number of buildings created is displayed as
the final output.
• Now, provide a similar static variable and method for each of the House and Shop classes and
make appropriate modifications to their constructors.
• Add code to the AnytownTest class to modify the final output message so that it takes the
form (e.g.)
“There are a total of 6 buildings of which 4 are houses and 2 are shops” 


                         Objects and Classes
                         Key OOP Concepts

The small application developed so far demonstrates some of the key concepts in objectoriented programming
• Classes and objects – a class is a template from which objects are created. Each object
has a collection of states (properties) as well as a collection of behaviours. States and
behaviours are implemented in Java as instance variables and methods.
• Abstraction – the user (client) is only aware of the operations that are provided on an
object, not how they are implemented.
• Encapsulation – variables and methods are wrapped in one single unit. Variables are
kept hidden (private) and can only be accessed from outside through setter and mutator
methods

                         Inheritance
                      Key Java Concepts

This example introduces more key concepts of object-oriented programming
• Inheritance sharing of attributes and methods between classes arranged in a hierarchy.
• Sub classes will inherit all attributes and methods from their super class
• Attributes and methods can be over-ridden if desired

                Classes Shop and House have inherited address and
                owner properties…
• …as well as their own individual properties
• Polymorphism is the name given to the is-a relationship that a class hierarchy produces
• E.g. A Shop is a Building and Shop objects have access to all of the methods of
class Building
