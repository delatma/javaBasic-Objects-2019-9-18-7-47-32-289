# Overview

This repository is a part of the Java language training plan. Please read the following guidelines before start.

# Getting Start

## Basic Principals

Each repository contains a gradle java project with a number of unit tests. The initial state of all unit tests are *FAILED*. So the aim is to correct the failed test. Please follow the following steps to get the best experience:

* Read the test code and try to understand what it says.
* Trying to fix the test **WITHOUT RUNNING**. This is very important. Because once you run the test, you may find the failure message of the test telling you the expected result. That means you may lose the chance to figure it out by yourself. Note that you should **ONLY** be able to modify code within the **TODO AREA**. The code outside the **TODO AREA** is **NOT** changable.
* Run the test to examine if the fix is correct.
* Answer the following 4 questions after the test is passed.

The 4 questions are:

1. What is the knowledge point of the test? Where is the offical document to the knowledge point?
2. Why the test failed at first?
3. Why you corrected the test that way?
4. Do you have further questions on this knowledge point?

## Example

Let's take a look at an example:

```java
@Test
void should_pass_by_value() {
  int value = 5;

  tryingToUpdateValue(value);

  // TODO: please modify the following code to pass the test
  // <--start
  final int expected = 0;
  // --end-->

  assertEquals(expected, value);
}
```

First, read the test. From the title and code we can know that the test what to examine the behavior when passing an argument. We are not sure what `tryingToUpdateValue` does, so we can jump into its implementation:

```java
private static void tryingToUpdateValue(int value) {
  value += 2;
}
```

Now we have got the full context of the test. The argument is passed by value so the integer will be copied when passing into `tryingToUpdateValue`. Thus the value from the caller site will not change.

Notice that the todo area is in the test method. So we can modify codes within the todo area to pass the test:

```java
  // TODO: please modify the following code to pass the test
  // <--start
  final int expected = 5;
  // --end-->
```

Please note that not all todo areas are located in test method. And some todo area may have further restrictions, for example:

```java
  // TODO: You should not write concrete number here. Please find a property or constant instead.
  // <!--start
  final int maximumSymbol = 0;
  final int minimumSymbol = 0;
  // --end-->
```

The hint indicates that we should not write concrete number here. So I should not write `3` or `0xffffffff`, but write symbol (e.g. `Integer.MAX_VALUE`).

## Running Test

You could run unit tests with the help of IntelliJ. But it is also possible to run unit test via command line: `./gradlew build`.

If you just want to build your code without running test. Please use `./gradlew build -x test`


# Answers
## ExceptionTest
1. What is the knowledge point of the test? Where is the offical document to the knowledge point?
The knowledge point of the test is to be able to access Stack Trace information and inherit Java's Exception class.
Official Document: https://docs.oracle.com/javase/tutorial/essential/exceptions/tryResourceClose.html
                   https://docs.oracle.com/javase/tutorial/essential/exceptions/chained.html
2. Why the test failed at first?
Expected values are not properly associated. StackFrameHelper was not defined.
3. Why you corrected the test that way?
To associate the expected values to related class' input values; inherit Exception class' correct values; and define StackFrameHelper class.
4. Do you have further questions on this knowledge point?
None at the moment.

## InheritanceTest
1. What is the knowledge point of the test? Where is the offical document to the knowledge point?
The knowledge point of the test is to be able to access Stack Trace information and inherit Java's Exception class.
Official Document:
https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html
2. Why the test failed at first?
Expected values do not match the results. Classes were not derived/ inherited properly.
3. Why you corrected the test that way?
To properly inherit traits of super classes.
4. Do you have further questions on this knowledge point?
None at the moment.

## ObjectTest
1. What is the knowledge point of the test? Where is the offical document to the knowledge point?
The knowledge point of the test is to be able to call default/overriding/overloading constructors;
to be able to manipulate objects by passing their values/ reference.

Official Document: https://docs.oracle.com/javase/tutorial/java/javaOO/constructors.html
                   https://docs.oracle.com/javase/tutorial/java/javaOO/arguments.html
                   https://docs.oracle.com/javase/tutorial/java/javaOO/objects.html
2. Why the test failed at first?
Incorrect values used.
3. Why you corrected the test that way?
To match the required object value and reference and to use the correct constructors.
4. Do you have further questions on this knowledge point?
None so far.
