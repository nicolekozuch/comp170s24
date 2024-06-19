# Grading notes for assignment 03

The idea here was to reduce method `main` to a few statements of our own design. Each statement represents a group of tasks with a common theme. For example, `gather` the ingredients of a recipe, `setup` the oven, `prep` the recipe by mixing things, `bake` the bread, and at the end `finish` the recipe by applying frosting.


```java
public static void main(String[] args) {
    gather();
    setup();
    prep();
    bake();
    finish();  
}
```

Your breakdown of the tasks into separate groups doesn't have to be the same as mine. As long as the tasks in the methods you wrote are grouped by some defendable similarity, it's ok.

What's important is to:

* have 3-5 methods of your own in method main and nothing else;
* name your methods as verbs/actions;