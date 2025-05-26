# Design Patterns in Java

This repository contains implementations of various design patterns in Java. Currently, it includes:

1. [Factory Pattern](#factory-pattern)
2. [Factory Method Pattern](#factory-method-pattern)
3. [Abstract Factory Pattern](#abstract-factory-pattern)

## Factory Pattern

### Overview
The Factory Pattern is a creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created. It defines a separate object that creates and returns product objects based on a parameter.

### Implementation
The Factory Pattern implementation in this repository uses the example of fruits:

- `Fruit` interface defines the common methods for all fruits
- Concrete fruit classes (`Apple`, `Orange`, `Banana`) implement the `Fruit` interface
- `FruitFactory` class contains a method that creates different types of fruits based on a string parameter


## Factory Method Pattern

### Overview
The Factory Method Pattern is a creational design pattern that defines an interface for creating an object, but lets subclasses decide which class to instantiate. It lets a class defer instantiation to subclasses.

### Key Differences from Factory Pattern
1. **Factory Pattern** uses a single factory class with conditional logic to create different products.
2. **Factory Method Pattern** uses an abstract factory class with a factory method that is implemented by concrete factory subclasses.

### Implementation
The Factory Method Pattern implementation in this repository uses the same example of fruits:

- `Fruit` interface defines the common methods for all fruits
- Concrete fruit classes (`Apple`, `Orange`, `Banana`) implement the `Fruit` interface
- Abstract `FruitFactory` class defines the factory method `createFruit()`
- Concrete factory classes (`AppleFactory`, `OrangeFactory`, `BananaFactory`) implement the factory method to create specific fruits

FACTORY METHOD PATTERN VS FACTORY PATTERN:
1. Factory Pattern uses a single factory class with conditional logic
2. Factory Method Pattern uses multiple factory classes, each for a specific product
3. Factory Method Pattern follows the Open/Closed Principle better
4. Factory Method Pattern allows for more specialized product creation logic

## Abstract Factory Pattern

### Overview
The Abstract Factory Pattern is a creational design pattern that provides an interface for creating families of related or dependent objects without specifying their concrete classes. It allows a system to be independent of how its products are created, composed, and represented.

### Key Differences from Factory Method Pattern
1. **Factory Method Pattern** creates a single type of product (e.g., only Fruit).
2. **Abstract Factory Pattern** creates multiple types of related products (e.g., Fruit and Juice).
3. **Factory Method Pattern** focuses on creating a single object through inheritance and method overriding.
4. **Abstract Factory Pattern** focuses on creating families of related objects and ensures that the created products are compatible with each other.

### Implementation
The Abstract Factory Pattern implementation in this repository uses the example of fruit products from different climates:

- Abstract Product Interfaces: `Fruit` and `Juice` define interfaces for the products
- Concrete Products: `TropicalApple`, `TemperatePear`, etc. implement the product interfaces
- Abstract Factory Interface: `FruitProductFactory` defines methods for creating products
- Concrete Factories: `TropicalFruitFactory` and `TemperateFruitFactory` implement the factory interface

ABSTRACT FACTORY PATTERN VS FACTORY METHOD PATTERN:
1. Factory Method creates a single product type, Abstract Factory creates families of related products
2. Factory Method uses inheritance (subclassing), Abstract Factory uses composition
3. Factory Method focuses on creating one product, Abstract Factory ensures product compatibility
4. Factory Method is simpler but less flexible, Abstract Factory is more complex but more powerful
