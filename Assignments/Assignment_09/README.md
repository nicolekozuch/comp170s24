# Assignment 09

Write a class that describes a **river.**

In addition to private fields (attributes) that describe unique characteristics of any river, the object should exhibit the following behavior (delivered with public methods):

* At least two constructors one of which must be the default constructor.
* Accessors (getter methods) for each attribute.
* `String toString()` 
* `int compareTo(River other)`. You may read more about the purpose of this method in the [documentation for the Comparable interface](https://docs.oracle.com/en%2Fjava%2Fjavase%2F22%2Fdocs%2Fapi%2F%2F/java.base/java/lang/Comparable.html). In Java, "interface" means contract; this is a contract that basically promises to compare two objects of the same class, ie, `objA.compareTo(objB)` and return a negative integer if `objA` is somehow lesser than `objB`, 0 when the two objects are similar, and a positive number when `objA` is somehow greater than `objB`. It is up to you to determine what comparison to establish between two rivers, and document your choice in the Javadoc of the method.
* `boolean equals(River other)`

The code should have no magic values. A magic value is a number literal other than 0 or ±1 or a string other than `""` that appears to the right of an assignment operator; e.g.
```java
private int altitude = 8410;
```
has the magic value `8410`. This value may be the default value we assign to variable `altitude`. In this case it may be best if we wrote

```java
private static final int DEFAULT_ALTITUDE = 8410;
//... and later in the program ...
private int altitude = DEFAULT_ALTITUDE;
```

Methods should have a Javadoc preample describing what they do and how.

Your code must also contain a simple
```java
public static void main(String[] args)
```
method to instantiate a few rivers and demonstrate the `toString`, `compareTo` and `equals` methods.