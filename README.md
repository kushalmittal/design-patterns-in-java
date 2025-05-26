# Design Patterns in Java

This repository contains examples of various design patterns implemented in Java.

## Factory Pattern

The Factory Pattern is a creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.

### Implementation

The Factory Pattern implementation in this project uses fruits as an example:

- `Fruit` interface defines the common methods for all fruits
- Concrete fruit classes (`Apple`, `Orange`, `Banana`) implement the `Fruit` interface
- `FruitFactory` class is responsible for creating the appropriate fruit objects based on the type requested

### How to Run

To run the Factory Pattern demo:

```bash
javac -d out src/factory/fruit/*.java src/factory/FactoryPatternDemo.java
java -cp out factory.FactoryPatternDemo
```

### Expected Output

```
Fruit: Apple
Color: Red
Taste: Sweet and Crisp

Fruit: Orange
Color: Orange
Taste: Sweet and Tangy

Fruit: Banana
Color: Yellow
Taste: Sweet and Soft
```
