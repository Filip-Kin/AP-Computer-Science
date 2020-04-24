# 1704
* Author: Filip Kin
* Version: 2020-04-23
* Description: Sorts an ArrayList of MovieV4 objects

## Planning
Wow, I actually have to plan this one
```
compare method
    // Comparison switch from before
    // Reverse line

if (high-low) > 2
    MovieV4[] a = sort(low, Math.floor((high-low)/2);
    MovieV4[] b = sort(Math.ceiling((high-low)/2, high);
    for(int i = a.length-1; i > 0; i--) {
        for(int j = 0; j < b.length; j++) {
            comparison = compare(type, reverse)
            if (comparison <= 0) { // j is the spot

        }
    }
else if (high-low) < 2
    return new MovieV4[] = new MovieV4[1] { get(low) }
else
    comparison = compare(type, reverse)
    if (comparison > 0) // need to switch
        return new MovieV4[] = new MovieV4[2] { get(high), get(low) }
    else
        return new MovieV4[] = new MovieV4[2] { get(low), get(high) }
```
Actually i don't I just started writing the method
instead of planning

## PMR
### Successes
- Yay it works, and it was actually a little difficult to implement because I didn't really think through the mid calculation too much
### Failures
- The mid number was annoying because I forgot to add low to it, other than that everything ran fine
37 minutes