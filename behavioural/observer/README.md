# OBSERVER PATTERN

### INTRODUCTION
It establishes a one-to-many dependency between objects so that when one object (the subject) changes state, all its dependents (observers) are notified and updated automatically. <br/>
It is a behavioural pattern where an object (called the Subject) maintains a list of its dependents (called Observers).

### COMPONENTS
1. `Subject` - Maintains a list of observers. <br />
    Provide methods to add/remove observers.<br />
    Notifies observers when its state changes. <br />
   It's either an interface or an abstract class.
2. `Observer` - Defines an updating interface for objects that should be notified.<br />
    It's either an interface or an abstract class.
3. `Concrete Subject` - The actual object being observed.<br />
    Stores state of interest to observers.<br />
    Sends notification to observers when state changes.
4. `Concrete Observer` - The objects that observe the subject.<br />
    Implements Observer updating interface to keep state consistent.
