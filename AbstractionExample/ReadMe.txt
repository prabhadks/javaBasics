Abstraction:
Abstraction is the concept of hiding the implementation details and exposing only the essential features to the user. It simplifies complex systems by focusing on relevant aspects and ignoring the unnecessary ones.

-In Java, abstraction is achieved using abstract classes and interfaces:
-An abstract class is declared using the abstract keyword.
-To define an abstract method, place the abstract keyword before the method signature (no method body).
-Abstract methods have no implementation; they only provide the method signature.
-A class containing at least one abstract method must be declared abstract.
-Subclasses that extend an abstract class must implement all its abstract methods.
-Abstract classes can contain both abstract and non-abstract methods.
-You cannot create objects of an abstract class.

Encapsulation:
Encapsulation is the mechanism of hiding an object’s internal state from the outside world and only exposing a controlled interface through public methods. It is often referred to as a data-hiding technique.

Encapsulation is achieved by:
-Declaring class variables as private
-Providing public getters and setters to access and modify them
-This keeps the internal state safe from unintended interference and misuse.

Interface:
An interface in Java is similar to an abstract class, but all its methods are implicitly abstract and public (prior to Java 8). Interfaces define a contract that implementing classes must fulfill.

-All methods in an interface are abstract by default (before Java 8).
-Interfaces cannot have instance fields, only public static final constants.
-Starting from Java 8, interfaces can include default methods — methods with a body — using the default keyword.
-These provide a default implementation that implementing classes can override if needed.
-Java 8 also introduced static methods in interfaces.
-Interfaces support multiple inheritance (unlike classes) because they do not maintain instance state, and Java resolves method conflicts through rules defined in the language (e.g., in case of default methods).

Inheritance:
Inheritance allows a class to acquire the properties and behaviors (fields and methods) of another class.

-The class that inherits is called the subclass or child class.
-The class being inherited from is the superclass or parent class.
-Java does not support multiple inheritance with classes to avoid ambiguity, but it does allow an inheritance hierarchy.

For example:
class A { }
class B extends A { }
class C extends B { }
// Class C inherits from both B and A through the hierarchy.

Abstraction vs Encapsulation:
Abstraction focuses on hiding implementation details and showing only relevant features.
Implemented using: abstract class, interface
Solves problems at the design level

Encapsulation focuses on hiding internal state and providing access through controlled interfaces.
Implemented using: private, protected, and package-private access modifiers
Solves problems at the implementation level

Polymorphism:
Polymorphism allows the same code to behave differently in different contexts.
It enables a single method, class, or interface to operate on different types or behave in multiple ways.
Example: Method overloading (compile-time polymorphism) and method overriding (runtime polymorphism)