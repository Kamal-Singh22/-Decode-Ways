# -Decode-Ways
A message containing letters from A-Z is encoded to numbers using the following mapping:  rust Copy code
Explanation of the Code:
Base Case:

dp[0] is initialized to 1 because an empty string can be decoded in one way (doing nothing).
If the first character is 0, dp[1] is 0 because 0 cannot form a valid encoding.
Dynamic Programming Transition:

For each position i in the string:
If the current character forms a valid single-digit encoding (1–9), add dp[i - 1] to dp[i].
If the two characters ending at position i form a valid two-digit encoding (10–26), add dp[i - 2] to dp[i].
Final Answer:

The value of dp[n] gives the total number of ways to decode the string.
