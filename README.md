
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
