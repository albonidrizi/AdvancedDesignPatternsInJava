# Advanced Design Patterns in Java

[LinkedIn](https://www.linkedin.com/in/albonidrizi/)

This project was created to serve as a teaching resource for students, providing clear and practical examples of advanced design patterns that are commonly used in modern Java applications. Below are the patterns included, along with their purposes, functionalities, and typical use cases:

## 1. MVC (Model-View-Controller)
- **Why:** Forms the foundation of most web frameworks (e.g., Spring MVC, ASP.NET, Django).
- **What it does:** Separates concerns into three layers:
    - **Model:** Represents business logic and data access.
    - **View:** Represents the presentation layer (UI).
    - **Controller:** Processes user inputs and interacts with the model and view.
- **Use Case:** Modern web application frameworks.

## 2. Repository Pattern
- **Why:** Abstracts database access.
- **What it does:** Separates business logic from persistence logic, providing a uniform interface to work with data.
- **Use Case:** ORM frameworks like Hibernate and Spring Data JPA.

## 3. Singleton Pattern
- **Why:** Ensures only one instance of a class exists across the application (e.g., a `ConnectionPool`).
- **What it does:** Restricts object creation to a single instance.
- **Use Case:** Managing configurations, logging, database connections, etc.

## 4. Factory Pattern
- **Why:** Simplifies object creation without specifying the exact class to be instantiated.
- **What it does:** Creates objects based on conditions or parameters.
- **Use Case:** Often used instead of directly calling constructors.

## 5. Observer Pattern
- **Why:** Facilitates building event-driven systems.
- **What it does:** A subject (observable) notifies a group of observers when a change occurs.
- **Use Case:** Real-time notifications, event services in frontend frameworks (e.g., Angular).

## 6. Strategy Pattern
- **Why:** Allows algorithm swapping at runtime.
- **What it does:** Defines a family of algorithms and makes them interchangeable without altering the code that uses them.
- **Use Case:** For varying functionalities such as validation or price calculations.

## 7. CQRS (Command Query Responsibility Segregation)
- **Why:** Separates read and write operations for optimization.
- **What it does:** Ensures read data and write data are handled separately.
- **Use Case:** Systems requiring large-scale optimization or Event Sourcing.

## 8. Chain of Responsibility Pattern
- **Why:** Enables a group of objects to handle a request sequentially.
- **What it does:** Passes a request through a chain of handlers until it is processed.
- **Use Case:** Middleware in frameworks like Spring Security for HTTP request verification.

## 9. State Pattern
- **Why:** Manages an object's behavior based on its current state.
- **What it does:** Dynamically switches implementation classes based on the object's state.
- **Use Case:** State-driven systems such as state machines in processes.

## 10. Template Method Pattern
- **Why:** Allows subclasses to define certain steps of an algorithm without altering its overall structure.
- **What it does:** Defines a skeleton method that invokes subclass-implemented methods.
- **Use Case:** Standardizing processes in frameworks and libraries.

---

This repository includes implementations and examples for these patterns, designed to provide a clear understanding of their usage in real-world scenarios.

Happy Learning! 🎓