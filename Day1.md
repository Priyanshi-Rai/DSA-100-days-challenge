# Asymptotic Analysis
- The idea is to compute the run time of ony operation
- depends on the input size
- measure order of growth
- No need to implement just analyze by the algorithm

### Mathematical Calculations
All the mathematical operations take same amount of time - Constant

### LOOP
Linear

### Double Loop
Quadratic

----------------------------------------------------------------------------------------------------

# Order of Growth :-

The algorithm having the least OG is most efficient.

A function f(n) is said to be growing faster than g(n) if <br>
          lim n-> ♾️ g(n)/f(n) = 0  <br>
             *or*                    <br>
           lim n-> ♾️ fn)/g(n)= ♾️  
           
- g(n) and f(n) are the time taken by the two algorithm for the same problem
- f(n) -> growing faster means it has bad algorithm.

-----------------------------------------------------------------------------------------------------------
## DIRECT WAY TO FIND AND COMPARE ORDER OF GROWTH

- Ignore the lower order time.
- Ignore the coefficients.

*Comparison series on DSA*

> C < loglogn < logn < n^1/3 < n^1/2 < n < n^2 < n^3 < n^4 < 2^n < n^n

------------------------------------------------------------------------------------------------------------

# BEST , AVG and WORST cases : 

- Best : Best case is the function which performs the minimum number of steps on input data of n elements.
- Worst : Worstcase is the function which performs the maximum number of steps on input data of n elements.
- Average : Average case is the function which performs an average number of steps on input data of n elements.

