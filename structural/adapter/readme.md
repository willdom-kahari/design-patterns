# ADAPTER PATTERN
<hr />

- It is a structural design pattern that allows objects with incompatible interfaces to work together.
- It converts the interface of one class into an interface expected by the clients.

### COMPONENTS
<hr />

1. Target interface
    - The interface that the client expects to work with
    - Defines the domain-specific interface that the client uses.
    - In Java, this is typically an interface or abstract class.

2. Adaptee (Adapted)
    - The existing class that needs to be adapted.
    - Contains useful behaviour but it has an incompatible interface.
    - This is the class that needs to be compatible with the target.

3. Adapter
    - Wraps the Adaptee and translates requests from the target interface to the Adaptee's interface.
    - The core of the pattern where the actual adaptation occurs.
    - The Adapter implements the Target interface.

4. Client
    - The class that collaborates with the objects conforming to the Target's interface.
    - Only knows about the Target interface, not the Adaptee.
