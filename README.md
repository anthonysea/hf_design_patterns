## Head First Design Patterns

### Ch. 1
 
Strategy Pattern - defines a family of algorithms, encapsulates each one, and makes them interchangeable.
Strategy lets the algorithm vary independently from clients that use it

### Ch. 2

Observer Pattern - defines a one-to-many dependency between objects so that when one object changes state,
all of its dependents are notified and updated automatically

### Ch. 3

Decorator Pattern - attaches additional responsibilities to an object dynamically. Decorators provide a flexible 
alternative to subclassing for extending functionality

- Decorators have same supertype as the objects they decorate 
- Can use one or more decorators to wrap an object 
- Since the decorator has the same supertype as the object, it can be passed around in place of the original (wrapped)
object
- The decorator adds its own behavior either before and/or after delegating to the object it decorates to do the
rest of the job
- Objects can be decorated at any time, therefore objects can be decorated dynamically at runtime with as many as we like
