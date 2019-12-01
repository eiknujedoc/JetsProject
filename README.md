## Jets Project

### Week 4 Homework for Skill Distillery

#### Overview

* This is a FLEET MANAGMENT simulation.

The program begins by populating the Air Field with a list of FIGHTER and CARGO jets. The user is prompted
with a menu that allows various interactions with the Air Field and the fleet of jets being stored at the Air Field.

#### Concepts

* Using ArrayList<>
* Searching lists
* Populating fields from .txt files
* Calling constructors
* Using Getters and Setters
* Adding/Removing objects from an ArrayList<>
* Using BufferReader and FileReader
* Exposure to Interfaces and super()
* String.split(); and .split groups

## The `List` Interface

One of the collection types defined in the `java.util` package is `List`.

* `List` is an interface.
* `List` guarantees insertion-order; the order you add elements into a list is the same order that you will iterate through them.
* `List` allows duplicate elements. (Some collections do not.)

Since `List` is an interface, we instantiate an implementing class.

* `ArrayList` is a class that implements `List`.

  ```java
  List<String> myList = new ArrayList<>();
  ```

* `LinkedList` and `Vector` are other classes that implement `List`.

![List implementation classes](images/list.png)



#### Technologies Used

* Java
* Eclipse IDE
* Atom
* Shell

#### Lessons Learned

The key strength of a List<> is that it can grow in size whereas an Array[] cannot grow in length as needed.
