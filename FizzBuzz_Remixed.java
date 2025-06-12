import java.util.*;

public class FizzBuzz_Remixed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            long n = sc.nextLong();
            System.out.println(countFizzBuzz(n));
        }
        
        sc.close();
    }
    
    public static long countFizzBuzz(long n) {
        // We need to count integers i from 0 to n where i mod 3 = i mod 5
        // 
        // For i mod 3 = i mod 5 to hold, both remainders must be equal.
        // Let's say both remainders equal r.
        // Then i ≡ r (mod 3) and i ≡ r (mod 5)
        // 
        // Since gcd(3,5) = 1, by Chinese Remainder Theorem:
        // i ≡ r (mod 15)
        // 
        // The possible values of r are: 0, 1, 2
        // (r must be a valid remainder for both mod 3 and mod 5)
        // 
        // So the valid numbers are those that are:
        // - 0 mod 15 (i.e., 0, 15, 30, 45, ...)
        // - 1 mod 15 (i.e., 1, 16, 31, 46, ...)  
        // - 2 mod 15 (i.e., 2, 17, 32, 47, ...)
        
        // In every block of 15 consecutive numbers, exactly 3 satisfy the condition
        long fullBlocks = n / 15;  // Number of complete blocks of 15
        long remainder = n % 15;   // Remaining numbers after full blocks
        
        long result = fullBlocks * 3;  // 3 valid numbers per complete block
        
        // Count valid numbers in the partial block [0, remainder]
        // These are numbers 0, 1, 2 that are ≤ remainder
        if (remainder >= 0) result++;  // 0 is always valid
        if (remainder >= 1) result++;  // 1 is valid if remainder ≥ 1
        if (remainder >= 2) result++;  // 2 is valid if remainder ≥ 2
        
        return result;
    }
}

/*
Analysis:

The condition i mod 3 = i mod 5 is satisfied when both remainders are equal.
Since we need r to be a valid remainder for both operations:
- r ∈ {0, 1, 2} (valid remainders mod 3)
- r ∈ {0, 1, 2, 3, 4} (valid remainders mod 5)
- Therefore r ∈ {0, 1, 2}

Using Chinese Remainder Theorem, i ≡ r (mod 15) for r ∈ {0, 1, 2}.

So valid numbers are: 0, 1, 2, 15, 16, 17, 30, 31, 32, 45, 46, 47, ...

Pattern: In every 15 consecutive integers, exactly 3 satisfy the condition.

Let's verify with examples:
- n=0: Only 0 satisfies → count = 1 ✓
- n=5: Numbers 0,1,2 satisfy (0≤5) → count = 3 ✓  
- n=15: Numbers 0,1,2,15 satisfy → count = 4 ✓
- n=42: Full blocks = 42/15 = 2, remainder = 12
  Valid numbers: 0,1,2,15,16,17,30,31,32 → count = 2*3 + 3 = 9 ✓

Time Complexity: O(1) per test case
Space Complexity: O(1)
*/