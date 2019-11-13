# Scanner Class Methods
- Purpose: Count the number of tests completed and get an average score of all of them.
- Version: 2019-10-04
- Author: Filip Kin

![Example Input](http://f.filipk.in/2019-Oct-59.png)
## PMR
### Successes
- The output is very fancy because I stored all the inputted test scores till the end to display them all together
- I added a grade input as an additional piece of information such a program should store
### Failures
- The grade input was initially an int type instead of String but I was having problems with the next input just skipping
I looked it up on StackOverflow and there was something about `nextInt()` not accepting the `\n` new line character but
I could not figure out how to get it to work so I just changed the grade input to `nextLine()`