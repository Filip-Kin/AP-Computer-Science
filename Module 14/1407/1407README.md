# 1407
* Author: Filip Kin
* Version: 2020-03-26
* Description: A program to analyze the frequency of characters in a text file

## PMR
### Successes
- I was bored, so I kinda overengineered it a little
- FileInterface class that can be reused in future programs
- HashMaps!!!
### Failures
- Sorting algorithum, leaves much effciency to be desired

## Part 5
1. I didn't find much difficulty in writing this program
2. They were almost never == but about 50% of the time pretty close. Correspondence can be improved if you get a list of the 3 closest characters and check with those.
3. If I were to write a program to do this, I would have a dictonary of short common words, I would have it try to solve those short words first. With the 3 closest characters method I mentioned earlier, guess and check until you have a word. With a 3 letter word you'd only have 9 combos to test. This *could* run into issues if you have the words `she` and `see` and have `h` and `e` close to each other in terms of %.