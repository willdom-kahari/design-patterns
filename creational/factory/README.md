# FACTORY PATTERN

### INTRODUCTION
It is a pattern that provides an interface for creating objects in a superclass.<br/>
The superclass must have multiple subclasses and based n the input, must return one of the sub-class.<br/>
The pattern takes out the responsibility of the instantiation of a class from the client program to the factory class.

### ADVANTAGES
1. Allows coding to an interface rather than concretions or implementations.
2. The client code does not need to worry about object instantiation.

### USES
- To encapsulate object creation logic.
- To create objects without specifying the exact class.
- To provide a simple way to extend the types of objects that can be created.
- To centralise object creation code.
- To decouple the creation process from the main class
