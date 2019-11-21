# Math Class
* Name: Filip Kin
* Version: 2019-11-20
* Description: Find points on a circle with increments
 
## PMR
### Successes
- I did a fancy thing to figure out how many decimal places should be displayed based on the increment  
```
String iS =  Double.toString(Math.abs(increment));
int accuracy = iS.length() - iS.indexOf('.');
```
### Failures
- The self adjusting output accuracy doesn't properly center the headers on the table