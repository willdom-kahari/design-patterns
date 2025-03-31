# SINGLETON PATTERN

### INTRODUCTION

The pattern ensures that a class has only one instance and provides a global access point to it.
It is mainly used for logging, drivers objects, caching and thread pool

### FORMS OF SINGLETON PATTERNS
1. Eager Initialisation<br/>
    `Pros:` Simple, thread safe by default. <br/>
    `Cons:` Instance created even if never used.
2. Lazy Initialisation<br/>
    `Pros:` Instance created only when needed. <br/>
    `Cons:` Not thread safe.
3. Thread Safe Lazy Initialisation<br/>
    `Pros:` Instance created only when needed. It is thread safe.<br/>
    `Cons:` Performance overhead due to synchronisation.
4. Double-Checked Locking<br/>
    `Pros:` Thread safe with better performance. <br/>
    `Cons:` More complex implementation.
5. Bill Pugh Singleton<br/>
    `Pros:` Thread safe, no synchronisation needed, lazy initialisation. <br/>
    `Cons:` Slightly more complex.
6. Enum Singleton<br/>
    `Pros:` Simplest thread safe implementation, serialisation handled by default. <br/>
    `Cons:` Less flexible (can't extend another class)

### WHEN TO USE WHICH
- Use `enum` when possible (simplest and safest).
- Use `Bill Pugh` when you need lazy initialisation without synchronisation overhead.
- Use `double-checked locking` for high performance requirements.
- Avoid simple lazy initialisation unless in a single-threaded environment.

