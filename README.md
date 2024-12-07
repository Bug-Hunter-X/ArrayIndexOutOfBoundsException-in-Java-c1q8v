# ArrayIndexOutOfBoundsException in Java

This repository demonstrates a common error in Java: the `ArrayIndexOutOfBoundsException`. This exception is thrown when an attempt is made to access an array element with an index that is out of bounds, either negative or greater than or equal to the size of the array.

The `Bug.java` file contains code that demonstrates this exception, while `BugSolution.java` provides a corrected version.

## Bug

The bug occurs in accessing an element outside of the declared array size. This is demonstrated by trying to access `arr[5]` in an array of size 5, which only has elements at indices 0 to 4.

## Solution

The solution involves carefully checking the boundaries when accessing array elements, making sure that you are only referencing valid indices (0 to `array.length -1`).