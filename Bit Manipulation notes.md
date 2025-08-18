**1. Introduction**

MSB = Most Significant Bit



Representation depends on MSB:



If MSB = 0 → number is positive, interpret normally.



If MSB = 1 → number is negative, apply 2’s complement and prefix -.



**2’s Complement Process:**



Take 1’s complement (toggle all bits).

Add 1 to the result.

Prefix with negative sign.



**Range of n-bit signed integer:**

−2^(n−1) to 2^(n−1) − 1



**Example: 4-bit DATA\_TYPE**

**Binary   Decimal**

0000     0

0001     1

0010     2

0011     3

0100     4

0101     5

0110     6

0111     7

1000     -8

1001     -7

1010     -6

1011     -5

1100     -4

1101     -3

1110     -2

1111     -1



**📌 Example:**

1000 → take 2’s complement → 1000 → 8 → stored as -8.

If DATA\_TYPE a = 12; → stored as 1100 → prints -4 instead of 12.



**Same binary can mean different values depending on data type size (e.g., 1010 in 4-bit = -6, but in byte = 10).**



**2. Decimal to Binary Conversion**

**Positive Numbers:**

Convert to binary.

Fit into the given bit-width (truncate extra bits).



**Negative Numbers:**

Ignore the sign.

Convert absolute value to binary.

Fit into the bit-width.

Store 2’s complement of that value.



**📌 Example: -7 (4-bit)**

**Step 1:** Ignore sign → 7

**Step 2:** Binary → 0111

**Step 3:** 2’s complement → 1001

Stored as 1001.



**3. Bitwise Operators**

**Operator    Symbol   Example**

OR          |        a | b

AND         \&        a \& b

XOR         ^        a ^ b

NOT         ~        ~a

Left Shift  <<       a << k

Right Shift >>       a >> k

Unsigned RS >>>      a >>> k



**Properties:**

**OR (|)**

**a | 1 = 1**

**a | 0 = a   (1 has power)**



**AND (\&)**

**a \& 0 = 0**

**a \& 1 = a   (0 has power)**



**XOR (^)**

**a ^ 1 = ~a (toggle)**

**a ^ 0 = a   (1 has power)**



**Left Shift (<<)**

**Example: 00101011 << 3 = 01011000**



**Right Shift (>>)**

**Example: 10100110 >> 3 = 11110100 (inserts MSB from left side)**



**Unsigned Right Shift (>>>)**

**Always inserts 0s on the left.**



**4. Bit Operations**

**1. Bit ON (Set a Bit)**

**x    = 10110101**

**mask = 00001000   (1 << 3)**

**y    = x | mask = 10111101**



**2. Bit OFF (Unset a Bit)**

**x    = 10110101**

**mask = 11111011   (~(1 << 2))**

**y    = x \& mask = 10110001**



**3. Bit TOGGLE**

**x    = 10110101**

**mask = 00000100   (1 << 2)**

**y    = x ^ mask = 10110001**



**4. Bit CHECK**

**x    = 11010011**

**mask = 00010000   (1 << 4)**

**x \& mask = 00010000 → Bit is ON**



**x    = 11010011**

**mask = 00000100   (1 << 2)**

**x \& mask = 00000000 → Bit is OFF**



**5. Sample Code (Java)**

int n = in.nextInt();   // number

int i = in.nextInt();   // set ith bit

int j = in.nextInt();   // unset jth bit

int k = in.nextInt();   // toggle kth bit

int m = in.nextInt();   // check mth bit



int onmask     = (1 << i);

int offmask    = ~(1 << j);

int togglemask = (1 << k);

int checkmask  = (1 << m);



out.println("After setting ith bit: " + (n | onmask));

out.println("After unsetting jth bit: " + (n \& offmask));

out.println("After toggling kth bit: " + (n ^ togglemask));

out.println("mth bit is on: " + ((n \& checkmask) == 0 ? "false" : "true"));



**6.** **Right Most Set Bit in a number**

let's just say x= A1's\&0's..1..B0's


rsb(right set bit)= x \& x''(2's compliment of x) 
                         x= A1's \& 0's.....1.....B0's

&nbsp;			 ~x=A0's \& 1's.....0.....B1's

&nbsp;		    x''=~x+1=A0's\& 1's.....1.....B0's

&nbsp;                  x\&x''=   A0's...........1.....B0's

**n  =  12   →  1100 (binary)**

**-n = -12   →  0100 (binary, in two’s complement 4 bits)**



**n \& -n = 1100 \& 0100 = 0100         (*n \& -n → gives you the value of the lowest set bit of n*)**

**So result = 4, which corresponds to the rightmost set bit at position 3 (0-indexed from right).**

	    **//number**

            **int n = in.nextInt();**

            **int right\_most\_set\_bit= n\&-n; // n\& -n**

            **out.println("right most set bit: "+right\_most\_set\_bit);**





**7. Kernighan's Algorithm:** used to count number of set bits in a number.

Brute: check each and every bit using check mask and increment the count like we did previously.  increase count only if (n\&checkmask)==0.

n=10101

**Optimal: me move only rmsb.**

step 1: calculate rmsb    rmsb= 00001
step 2: increment the count   1------>will finally become 3

step 3: remove rmsb from the number.  10101-00001=10100

step 4: repeat until number becomes 0.  n=10100



&nbsp;	    //number

 **Code:**      int n = in.nextInt();

&nbsp;           int count\_of\_set\_bits=0;

&nbsp;           while(n!=0){

&nbsp;               int rmsb=n \& -n;

&nbsp;               count\_of\_set\_bits++;

&nbsp;               n=n-rmsb;

&nbsp;           }

&nbsp;           out.println(count\_of\_set\_bits);



**8.** 





