Hiding the implementation details of a code and exposing only the necessary information to the user.
It provides the ability to simplify complex systems by ignoring irrelevant details and reducing complexity

When classes are abstract, then add abstract keyword infront of class.
Similarly add abstract keyword after modifier in the method, to indicate it is a abstract method
Abstract methods are those, in which the method doesn't contain the body. Only definition exists but not implementation
Subclasses that extends these abstract classes has to implement those methods
Abstract class can have both abstract and non abstract methods
Class is said to be abstract, when it contains atleast one abstract method

Encapsulation is the technique whereby the object's state is hidden from the outer world and a set of public methods for accessing this state are exposed. When each object keeps its state private inside a class, we can say that encapsulation was achieved.
This is why encapsulation is also referenced as the data-hiding mechanism.

Interface is like an abstract class with all the abstract methods. But we don't explicitly have abstract defined in the class name of interface or methods in the interface


Abstraction and Encapsulation in Java are two important Object-oriented programming concepts and they are completely different from each other.
Encapsulation is a process of binding or wrapping the data and the code that operates on the data into a single entity. This keeps the data safe from outside interface and misuse.
Abstraction is the concept of hiding irrelevant details. In other words, make the complex system simple by hiding unnecessary detail from the user.
Abstraction is implemented in Java using an interface and abstract class while Encapsulation is implemented using private, package-private, and protected access modifiers.
Abstraction solves the problem at the design level. Whereas Encapsulation solves the problem at the implementation level.
