package BitManipulation;

public class BitwiseOperator {
    public static void main(String[] args) {
        System.out.println("Two number bitwise or: " + (5 | 9));
        System.out.println("Two number bitwise and: " + (5 & 9));

//      Bitwise Or
        System.out.println("Bitwise OR of x with 0" + (6 | 0));
        System.out.println("Bitwise OR of x with 1" + (10 | 1));

//      Bitwise And
        System.out.println("Bitwise AND of x with 0" + (6 & 0));
        System.out.println("Bitwise AND of x with 1" + (6 & 1));

//      Bitwise Xor
        System.out.println("Bitwise XOR of x with 0" + (6 ^ 0));

//      DataTypes
        System.out.println("\nThe data types are: ");
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);

//      1's Complement
        System.out.println(~6);

//      2's Complement
        System.out.println(~6 + 1);


    }
}
