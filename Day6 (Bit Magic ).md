## Bitwise AND "&"
 <table>
  <tr>
    <td>A</td>
    <td>B</td>
    <td>Output</td>
  </tr>
   <tr>
    <td>0</td>
    <td>0</td>
    <td>0</td>
  </tr>
   <tr>
    <td>0</td>
    <td>1</td>
    <td>1</td>
  </tr>
   <tr>
    <td>1</td>
    <td>0</td>
    <td>1</td>
  </tr>
   <tr>
    <td>1</td>
    <td>1</td>
    <td>1</td>
  </tr>
 </table>
 
 ## Bitwise OR " | "
 
 <table>
  <tr>
    <td>A</td>
    <td>B</td>
    <td>Output</td>
  </tr>
   <tr>
    <td>0</td>
    <td>0</td>
    <td>0</td>
  </tr>
   <tr>
    <td>0</td>
    <td>1</td>
    <td>0</td>
  </tr>
   <tr>
    <td>1</td>
    <td>0</td>
    <td>0</td>
  </tr>
   <tr>
    <td>1</td>
    <td>1</td>
    <td>1</td>
  </tr>
 </table>
 
 ## Bitwise XOR "^"
 
 <table>
  <tr>
    <td>A</td>
    <td>B</td>
    <td>Output</td>
  </tr>
   <tr>
    <td>0</td>
    <td>0</td>
    <td>0</td>
  </tr>
   <tr>
    <td>0</td>
    <td>1</td>
    <td>1</td>
  </tr>
   <tr>
    <td>1</td>
    <td>0</td>
    <td>1</td>
  </tr>
   <tr>
    <td>1</td>
    <td>1</td>
    <td>0</td>
  </tr>
 </table>
 
 ## Bitwise NOT "~"
 
 if x is the number then negation of x will be **(2^32-1-x)**
 OR
**-(x+1)**

## Left Shift << 

Leading bit get ignored <br>
- x=3 , 000....00011
- x<<1, 000....00110
- x<<4, 000...110000

if x < 0 <br>
- x=-1 , 1111....11111  (2^32-1)
- x<<1 , 1111....11110  (2^32-2)
- x<<2 , 1111....11100  (2^32-4)

_In general, for x<<y :_ <br>
**Output : x*2^y**

## Signed Right Shift (>>) 

Ending bit get ignored
- x>0 : 0 will be added in the lead
- x<0 : 1 will be added in the lead

- x=33 : 0000....100001
- x>>1 : 0000....010000
- x>>4 : 0000....000010

- x=-2 : 1111....11110
- x>>1 : 1111....11111
- x>>4 : 1111....11111

## Unsigned Right Shift (>>>)

Positive number act same for >> and >>> <br>
Leading bit is filled with 0 <br>
Negative number converted into positive

- x=-2 : 1111....11110  (2^32-2)
- x>>>1: 0111....11111  (2^31-1)
- x>>>4: 00001...11111  (2^28-1)
