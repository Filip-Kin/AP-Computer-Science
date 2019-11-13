# 0604
* Purpose: Parse Hurricane Data from a file
* Author: Filip Kin
* Version: 2019-11-11

## PMR
### Successes
- I wrote everything in one go and it *mostly* worked first run. Only had to fix the second read because apparently 
`Scanner.reset()` doesn't reset the cursor position, you have to close and reinit the scanner
### Failures
- It took quite a bit of time and reruns to get the output formatting perfect 