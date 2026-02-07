public class RemoveAndReverse{
    public static void main(String[] args ){
        String str = "He ll o stu dents";
        String noSpaces = str.replace(" ", ""); // remove spaces
        String reversed = new StringBuilder(noSpaces).reverse().toString(); // reverse the string
        System.out.println(reversed);
    }
}