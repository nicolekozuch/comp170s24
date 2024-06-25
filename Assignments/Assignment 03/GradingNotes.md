# Grading notes for assignment 03

Generally, your code should be very similar to mine. It is important that your code is syntactically correct. The best way to ensure that the syntax is correct is to compile the code without errors.

Code that has not been checked for proper syntax is usually consider incomplete code. Signs of incomplete syntax include the following.

* Mismatched variable names: this is usually a typo, where the same variable appears with slightly different names. Syntax errors like this are automatically detected by most program editors (including the one used in Codespaces). And even when we do not catch them in editing, they always show up in compiling. It is important that we always compile the code we submit, to ensure at the very least, it's syntactically correct.

* Improper operators: this is also usually a typo and it is caught by the editor and the compiler. For example we write `if (x=y)` when in fact we meant to write `if (x==y)`

Other mistakes expected here include use of techniques not shown in class -- that's not a problem as long as you document your choice with appropriate comments.

Lack of comments is another issue. For simple methods like the ones we had in this assignment there isn't much commentary needed, but there should be some.

Finally, it is time to develop some basic coding style. Beginning with the following:

* if a method has a return type, i.e., when a method is not `void`, then it should have one and only one `return` statement. (This rule will go away eventually, but from now on, every non-void method shall have one and only one `return` statement).

* the use of the `break` command is strictly forbidden.