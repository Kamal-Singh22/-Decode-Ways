public class DecodeWays {
    public static int numDecodings(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int n = s.length();
        int[] dp = new int[n + 1];
        dp[0] = 1; // Base case: empty string has one way to decode

        // If the first character is '0', there's no valid decoding
        dp[1] = s.charAt(0) != '0' ? 1 : 0;

        for (int i = 2; i <= n; i++) {
            // Single digit decoding
            int oneDigit = Integer.parseInt(s.substring(i - 1, i));
            if (oneDigit >= 1 && oneDigit <= 9) {
                dp[i] += dp[i - 1];
            }

            // Two-digit decoding
            int twoDigits = Integer.parseInt(s.substring(i - 2, i));
            if (twoDigits >= 10 && twoDigits <= 26) {
                dp[i] += dp[i - 2];
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        String s = "226";
        System.out.println("Number of ways to decode: " + numDecodings(s));
    }
}
