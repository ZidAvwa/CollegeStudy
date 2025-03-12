|  | Algorithm and Data Structure |
|--|--|
| NIM |  244107020083|
| Nama |  Zid'Avwa Al Bari'i |
| Kelas | TI - 1I |
| Repository | [link] (https://github.com/ZidAvwa/CollegeStudy/tree/main/2ndSemester) |

# Labs #5 Array of Object

## 5.2. Calculating Factorial Using Brute Force and Divide and Conquer Algorithms

The lab is implemented in Factorial27.java and MainFactorial27.java

**Questions:**
1. The if condition stops recursion (n == 1), while the else condition calls itself recursively (n * factorialDC(n-1))
2. Yes, a while loop can replace for. Example:
int i = 1, facto = 1;
while (i <= n) { facto *= i; i++; }
return facto;
3. the difference is:
facto = facto * i; → Iterative multiplication in a loop.
facto = n * factorialDC(n-1); → Recursive multiplication reducing n each time.
4. Conclusion:
 - factorialBF() (Brute Force): Uses an iterative approach with a loop. It is more memory-efficient and avoids recursion overhead.
 - factorialDC() (Divide and Conquer): Uses a recursive approach, breaking the problem into smaller subproblems. It is more elegant but uses more memory due to recursive function calls.

## 5.3. Calculating Exponentiation Using Brute Force and Divide and Conquer Algorithms

The lab is implemented in Power27.java and PowerMain27.java

**Questions:**
1. Differences:
    - powerBF(): Uses an iterative loop to multiply the base repeatedly.
    - powerDC(): Uses recursion and divides the exponent (e/2) to optimize computation.
2. Combine stage: Yes, in powerDC():
    return (powerDC(n, e/2) * powerDC(n, e/2) * n);
    This part combines results from recursive calls.
3. No, they can be removed by using class attributes:
    int powerBF() {  
        int result = 1;  
        for (int i = 0; i < exponent; i++) {  
            result *= baseNumber;  
        }  
        return result;  
    }  
4. Summary:
    - powerBF(): Iterative, straightforward, but slower for large exponents.
    - powerDC(): Recursive, faster (O(log n)), but uses more memory due to recursion.


## 5.4. Calculating Array Sum Using Brute Force and Divide and Conquer Algorithms

The lab is implemented in Sum27.java and SumMain27.java

**Questions:**
1. It splits the array into two halves for recursive summation.
2. Explanation of statements:
    - lsum: Recursively sums the left half (l to mid).
    - rsum: Recursively sums the right half (mid + 1 to r).
3. Combines the sums of left and right subarrays to get the total sum.
4. When l == r, meaning only one element remains, return arr[l].
5. totalDC() applies Divide and Conquer by splitting the array, summing recursively, and combining results efficiently.

## 5.5. Assignment

