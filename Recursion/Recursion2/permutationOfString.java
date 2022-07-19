package Recursion.Recursion2;

public class permutationOfString {
    public String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    public void permute(String s, int l, int r) {
        if (l == r) {
            System.out.println(s);
        } else {
            for (int i = l; i <= r; i++) {
                s = swap(s, l, i);
                permute(s, l + 1, r);
                s = swap(s, l, i);
            }
        }
    }

    public static void main(String[] args) {
        String s = "ABC";
        permutationOfString newPerm = new permutationOfString();
        newPerm.permute(s, 0, s.length() - 1);
    }
}
