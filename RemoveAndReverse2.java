public class RemoveAndReverse2 {
    public static void main(String[] args) {
        char[] chars = "He ll o stu dents".toCharArray();
        int length = chars.length;
        // Remove spaces
        int newLength = 0;
        char[] newChars = new char[length]; //to store new string
        for (int i = 0; i < length; i++) {
            if (chars[i] != ' ') {
                newChars[newLength++] = chars[i];
            }
        }
        // Reverse the string
        int start = 0;
        int end = newLength - 1;
        while (start < end) {
            char temp = newChars[start];
            newChars[start] = newChars[end];
            newChars[end] = temp;
            start++;
            end--;
        }
        // Print the result
        for (int i = 0; i < newLength; i++) {
            System.out.print(newChars[i]);
        }
    }
}