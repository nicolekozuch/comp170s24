# Grading notes for assignment 8

## The basics

**Your code must compile.**

You designed a class called `Time` that has three `int` attributes for the hour, minute, and second of the time value you want to capture in the format:

```hour : minute : second ```

You also recognize that these variables have specific ranges:

```
0 ≤ hour < 24
0 ≤ minute < 60
0 ≤ second < 60
```

Your class may some constants to avoid the use of magic values in the code and to make the code more readable.

## Challenges

The most challenging part is to "decode" an integer number of seconds into hours, minutes, and seconds. For example, how many hours, minutes, and seconds are in 3675 seconds?

We know there are 3600 seconds in an hour, so 3675 seconds are 1 hour and change. If we substract 3600 from 3675 we are left with 75 seconds. We know there are 60 seconds to the minute, so 75 seconds is 1 minute, and change. If we subtract 60 from 75, we are left with 15 seconds. So
```
3675 seconds = 1 hour 1 minute 15 seconds or 01:01:15
```

Given an `int values` with the number of seconds we wish to convert to hours, minutes, and seconds, the mathematical trick above can be coded in two different ways. 

The straigh-forward way just implements the process we used in the example above.

```java
int hour = value/(60*60);
value = value - hour*(60*60);
int minute = value/60;
value = value - minute*60; // Last two lines can be combined as
int second = value;        // int second = value-minute*60
```

The same can be done in a more compact way as shown below. The code here also uses constants instead of literal values. To use, the number 60 makes sense, but to someone reviewing our code it may not be immediately obvious. It is better to delegate any value that is not a 0 or 1, to a constant and then use the constant throughtout the program as needed:
```java
private static final int SECONDS_IN_MINUTE = 60;
private static final int MINUTES_IN_HOUR = 60;
// ...
int second = value % SECONDS_IN_MINUTE;
value = value / SECONDS_IN_MINUTE;
int minute = value % MINUTES_IN_HOUR;
int hour = value / MINUTES_IN_HOUR;
```

## The fine points

At the beginning we all write redundant code. Chances are that your constructors repeat some of the same code. There is no other way to learn.

Look at the way I wrote the constructors in `Time_Solutions`. See how little code is repeated between them. This is something that you too can accomplish with practice and a bit more paper-based design, before you begin coding your programs.

Notice, also, how in my code, `add` and `substract` have virtually no repeated code. Instead there is one principal `add` method and the rest of the `add` and `subtract` methods feed into it. This is called *method wrapping* and it's a technique that you too will develop with practice and good design planning. 

The first step towards developing such skills is to *review your code* a few hours after you wrote it. That's when you'll start seeing code repeatitions and other inefficiencies that you'll want to address.

You may now notice similarities between my principal `add` method and methods `multiply` and `divide`. Can you find a way to improve my code by eliminating these redundancies?