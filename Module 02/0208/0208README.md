# Challenge Program
- Purpose: Converts an amount of money from a specific country into the equivalent currency of another country given the current exchange rate.
- Version: 2019-09-18
- Author: Filip Kin
## PMR
### Successes
- I implemented rates with dollars per (currency) instead of the other way around which was in the example piece of code, because this was was more comfortable for me
- I made the output reasemble that which is shown on the instruction page as closely as possible
- I used `startingUSAmount -=` as opposed to a new integer after each country to save memory
### Failures
- It took me a while to figure out how to get the item 2's total items purchased because usually I would do this by seperating the number at the decimal point, the whole number part is the total items purchased and the decimal times the price is the funds remaining. I eventually remembered that I can cast to int as a way of flooring a number