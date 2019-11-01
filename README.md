# Project Title

singtel-assignment

## Summary

This assignment has been solved using the the basic concepts of OOPs like Inheritance, runtime polymorphism, abstraction etc.
Care has been taken to avoid duplicacy of code as much as possible.

### Prerequisites

JDK 1.8 and above.

## Running the tests

I have not included the unit test here.

### Coding style

I have used separate models for all type of enitities and have made use of inheritance to avoid code dupilcation.

### Code Review

Here a parent class named Animal has been made which contains walk(), say() and say(String sound) functions.
The walk() function is being used by all the other model class which have a requirement for walk() function. Here it is worth mentioning that, at any time these methods can be modified using the @Overide annotation if any required.

The say(String sound) function here has been used for accepting the different type of sound that can be used by the child classes.

The Bird class includes fly(), sing() and swim() functions. This class inherits the Animal class.

The Fish class includes the size() and colour() functions.

Inheritance has been used for reusing the properties defined in the parent clasess for the child classes.
