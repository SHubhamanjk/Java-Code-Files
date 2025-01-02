// Bitwise operators : are used to do binary manupulations

// AND OPERSTOR : It's A&B=A*B
// BINARY OR : It's  A|B=A+B
// Bitwise XOR : If A and B are same then 0 either 1 
// Binary 1's compliment : it only work on 1 opr and it convert 1 to 0 and 0 to 1 ...
/*
  Let suppose we have to  to find ~5 to technically it should 2 becuase 101-->010 that is 2 ...
  but in computer 101 is stored like 00000101 where extreme left value is MSB and extreme right value is LSB
  if MSB is 1 it mean number is negative either positve ... so 00000101-->11111010 to tackle this problem we do
  this step ....> first we find the 1's then again 1's+1 into that so in that example  11111010
  00000101 ---> 00000110 that is 6 .

 
 */

 // Binary left Shift : a<<b .... firstly we convert a into binary then last b points of a will be shifted ..
 /*
  5<<2 : 00000101 if the binary of 5 and final result is 00010100 which is equ to 20

  a<<b = a*2^b
  */

// Binary right shift : a>>b same like left shift , only diffrence is that it will shift in right
// a>>b = a / 2*b

public class day19 {

    public static void main(String args[]){
        System.out.println(1&0);
        System.out.println(1|0);
        System.out.println(1^0);
        System.out.println(~5);
        System.out.println(5<<2);
        System.out.println(5>>2);



    }
    
}
