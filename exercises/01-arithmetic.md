# Exercise 4 — Predict, Then Run

**Fill in the PREDICTED column completely before you run any code.** That's the whole exercise. Checking the answer without committing to a guess teaches you nothing.


| # | Expression | Predicted | Actual | Right? | If wrong, why? |
|---|---|---|---|---|---|
| 1 | `9 / 2` | 4 | 4 | Yes | |
| 2 | `9 % 2` | 2 | 1 | No | I forgot that % meant remainder. I wouldve known it|
| 3 | `9.0 / 2` | 4.5 | 4.5 | Yes | |
| 4 | `9 / 2.0` | 4.5 | 4.5 | Yes | |
| 5 | `2 + 3 * 4` | 15 | 14 | No | I added up wrong|
| 6 | `(2 + 3) * 4` | 20 | 20 | Yes | |
| 7 | `20 - 5 - 3` | 12 | 12 | Yes | |
| 8 | `17 % 5` | 2 | 2 | Yes | |
| 9 | `5 % 17` | 5 | 5 | Yes | |
| 10 | `100 / 3 / 3` | 11 | 11 | Yes | |
| 11 | `1 / 2 * 100` | 0 | 0 | Yes | |
| 12 | `100 * 1 / 2` | 50 | 50 | Yes| |
    
---

## Follow-up

**1. Compare #11 and #12. Same numbers, same operators, completely different answers. Explain why.**

#11 gives 0 because 1 / 2 is calculated first as integer division, while #12 gives 50 because 100 * 1 is calculated first, giving 100, and then 100 / 2 is 50.

**2. #9 gives `5`. Explain why `5 % 17` is 5 and not 0.**

5 % 17 is 5 because 17 cannot fit into 5 even once, so the remainder is still 5.

**3. A classmate writes this to calculate a percentage:**
```java
int correct = 7;
int total = 10;
double percent = correct / total * 100;
```
**They get `0.0`. Explain what went wrong and write the corrected line.**


```java
double percent = (double) correct / total * 100;
```

**4. Give one real situation where `%` would genuinely be useful. Not from this worksheet — something from your own life or your project idea.**

% could be useful for checking whether a number of people can be split evenly into groups, such as seeing if 11 people can be divided into groups of 3.
