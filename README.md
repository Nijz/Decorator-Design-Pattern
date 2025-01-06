Decorator Design Pattern

The Decorator Design Pattern is a structural design pattern that allows behavior to be added to individual objects dynamically without altering the code of the original object or its class. This makes it a flexible alternative to subclassing for extending functionality.

Key Features:
 - Dynamic Behavior: Add new functionality to objects at runtime.
 - Composition Over Inheritance: Avoids the need for large inheritance trees by combining behaviors.
 - Open/Closed Principle: Keeps the original class open for extension but closed for modification.

How It Works:
 - A Component defines the common interface for objects that can have responsibilities added.
 - A Concrete Component is the object being decorated.
 - A Decorator implements the same interface as the component and wraps it to add additional behavior.

Advantages:
 - Promotes code reusability and modularity.
 - Avoids creating a bloated class hierarchy.
 - Enhances objects without modifying their structure.

Limitations:
 - Can lead to complexity if too many decorators are used.
 - Debugging can be challenging due to multiple layers of wrapping.

-> Handwritten Notes: 

![DecoratorDesignPattern](https://github.com/user-attachments/assets/31550d2c-3557-4ebe-92f7-ba2f175973a2)

Thank You 😊
Jay Shree Krishn 🫶🏻
