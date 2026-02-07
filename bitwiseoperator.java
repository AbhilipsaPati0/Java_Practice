public class bitwiseoperator{
    public static void main(String[] args) {
        int a = 4; 
        int b = 8; 

        // Bitwise AND
        int andResult = a & b;
        System.out.println("a & b = " + andResult); 
        // Bitwise OR
        int orResult = a | b;
        System.out.println("a | b = " + orResult); 

        // Bitwise XOR
        int xorResult = a ^ b;
        System.out.println("a ^ b = " + xorResult); 

        // Bitwise NOT
        int notA = ~a;
        int notB = ~b;
        System.out.println("~a = " + notA);
        System.out.println("~b = " + notB); 

        // Bitwise Left Shift
        int leftShiftA = a << b;
        System.out.println("a << b = " + leftShiftA); 

        // Bitwise Signed Right Shift
        int rightShiftA = a >> b;
        System.out.println("a >> b = " + rightShiftA); 

        // Bitwise Unsigned Right Shift
        int unsignedRightShiftA = a >>> b;
        System.out.println("a >>> b = " + unsignedRightShiftA); 
    }
}
