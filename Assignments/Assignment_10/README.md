# Assignment 10 - final Assignment


## Part I: self-assessment


### Self-assessment

In *Ungrading,* you, the student, are responsible for assessing your work and for proposing your course grade. As your instructor, my responsibility is to ensure that your assessment and proposal are based on technical merit, facts, and fairness.

The Sakai grades you receive only indicate whether you turned in an assignment or not. A grade of 0 means that you missed the assignment. A grade of 1 means that you turned it in on time. *A grade of 1 does not mean that the assignment is correct.*

The only person that can determine if your assignment is correct, truly is you. Even before reviewing the solutions and the grading notes I share, you have an idea how good your assignment is. For example, if your code did not compile or if you did not try to compile your code, you know it's not as good as it could have been.

Reallistically, you can assign one of three grades to yourself: A, B, or C.


#### The job interview approach

One way to determine which grade to assign yourself, is to imagine the following scenario: you are at a job interview and the questions are based on this course. How do you feel about getting the job, after your technical interview? 

* **A** means that you are 100% confident you'll get the job, no matter how good the other candidates may be. An **A-** means that you believe there is another student in the course who may get the job instead of you.

* **B** means that you are confident you'll get the job as long as not too many better candidates show up. A **B+** means that no more than 1/5 of your classmates may be among these better candidates. A **B-** means that more than 1/2 of your classmates can be among these better candidates.

* **C** means that most of the other candidates will perform better than you and it's unlikely you'll get the job. A **C+** means that there may be one person in the course that is even less likely to get that job. A **C-** means that if everyone in your class went to the same interview, you will definitely not receive an offer.

What about a **D?** This grade means that after your technical interview you realized you should not have even tried. I reserve **D** for students that make an effort: coming to class, turning in assignments etc, but they decided this is not the time for them to pursue this discipline. Finally, I give an **F** only when there is no participation, no assignment submission, and no communication.


#### A course-based approach

The job interview approach above is illustrative but subjective. You may want to evaluate your work in the coure by reflecting on the strength of your participation, the quality of your assignments, and the responsiveness to feedback about mistakes.


##### Participation

Participation can be assessed across attendance, engagement, and involvement.

**Attendance** means that you came to class on time and that you did not miss more than 5 class meetings. On time means that you were present within a minute of class start time. 

**Engagement** means that your camera was on for most of the meetings (it's ok if it was off for a few minutes per meeting, or for a few meetings). It also means coming to *Student Hours* with questions, or emailing the instructor for assistance.

**Involvement** means that you asked questions during class, that you were among the first students to answer a question asked by the instructor, etc.


##### Assignments quality

This reflects mostly how good you feel about your work. Do you feel it's the best you could have done? Did you start working on assignments early or late? Did you give yourself enough time to study the assignment and formulate questions for the instructor? When hitting a snag, did you seek assistance/clarifications from your instructor?

If you wrote a program, did it compile without errors? Did it execute and produce the correct results?


##### Responsiveness to feedback

We all make mistakes. Our challenge is to learn from them. How well did you learn from your mistakes? Did you compare your code with the published solutions? Did you identify the differences? Did you learn from them and make a point not to repeat mistakes that you found? 

If your assignment required a checklist (such as the *Programmer's Pack)* did you use it? If you used it, did you miss any items? If you missed any items, did you make a point to avoid missing them in the next assignment?

Did you complete your assignment reviews based on published solutions and grading notes? If you found **red level** severities, did you schedule a meeting with the instructor to discuss them?


#### Deliverable

For this part of your final assignment, write a reflection assessing your peformance in the course. The reflection can be anywhere between 50 and 500 words. The last sentence of the last paragraph of reflection should be in the form: <br/>

<p style="text-align: center"><i>Based on the above, I propose a course grade of x.</i></p>

where `x` is an **A, B,** or **C**. You may use a +/- modifier as well. It is very important that the **last sentence of the last paragraph of your reflection is as specified above.** 

Your reflection should be factual and fair. 

You may discuss course challenges (for example, "Codespaces was a difficult environment") but also what you did to address them (for example, "I switch to BlueJay" or "I asked the instructor for assistance", etc). Challenges are present in everything we do; it's how we handle them that matters.


## Part II: technical

For this part submit a Java class with name `FinalAssignment`. Your class should include the methods described below, and a `main` method to test your code. 
 You cannot use any methods from `System` or `java.util.Arrays`, except for `System.out.println`, `System.out.printf`, and `Arrays.toString`. You may also include any auxiliary methods you desire write.



### Problem 1: Merge two arrays


Write a method 

```java
int[] merge(int[] left, int[] right) {...}
```
that takes two integer **sorted** arrays called `left` and `right` respectively and merges them into a single sorted array. For example,

```java
int[] a = {1,2,8,9};
int[] b = {0,5,6,7};
...
int[] c = merge(a,b);
```
should result to
```java
[0,1,2,5,6,7,8,9]
```
The method may assume that the two input arrays are already sorted.

There are plenty of solutions to this problem online. Therefore, you are expected to document your code with sufficient comments and use highly descriptive variable names, demonstrating that you fully understand how it works.


### Problem 2: Reverse a string

Write a method 
```java
String reverse(String string)
```
that returns the reverse of the string. The only method you may use is `String.charAt`. For example
```java
reverse("Hello");
```
should return the string
```
olleH
```
Document your code with sufficient comments and use highly descriptive variable names, demonstrating that you fully understand how it works.

### Problem 3: Simple sorting

Write a method 

```java
int[] simpleSort(int[] array)
```

that accepts an array and sorts it in ascending order. The easiest way to sort such an array is to find its smallest element swap its place with the first element. Then find the smallest element in the array beginning from the second element and swap places, and so on.

For example, consider the array

```
int[] a = {10,8,5,6,2};
```

To sort it with this simple technique we go through the following iterations.

1. Find smallest element in `[10,8,5,6,2]` and swap it with first element; array now becomes `[2,8,5,6,10]`
2. Find smallest element in subarray `[8,5,6,10]` and swap places leading to `[5,8,6,10]`. Notice that you do not need to create a new array for this. You can still operate on the initial array after the *first* swap that gave us `[2,8,5,6,10]` only program your code to skip the first element.
3. Find smallest element in subarray `[8,6,10]` and swap places leading to `[6,8,10]`. Again, you can still do this on the initial array after the *second* swap that gave us `[2,5,8,6,10]` only program your code to skip the second element.
4. Repeat as needed until you reach the last element.

Document your code with sufficient comments and use highly descriptive variable names, demonstrating that you fully understand how it works.
