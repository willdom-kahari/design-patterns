# COMMAND PATTERN
<hr />

### INTRODUCTION

 - It turns a request into a standalone object that contains all the information about the request
 - Used to creae objects that represent actions and events in an application

### COMPONENTS

1. <b>Command</b> - an interface or abstract class that declares an `execute()` method.
   This method encapsulates the action to be performed.
2. <b>ConcreteCommand</b> - Implements the `Command` interface.
    It binds the action to the receiver (the object that knows how to perform the action).
    It may also store additional state required for the operation.
3. <b>Receiver</b> - The object that knows how to perform the actual work.
    It contains the business logic for the operation.
4. <b>Invoker</b> - holds a command and can execute it.
    It doesn't know how the command is implemented; it just call the `execute()` method 
5. <b>Client</b> - The client creates the `ConcreteCommand` object and associates it with a `Receiver`.
    Passes the command to the `Invoker`
