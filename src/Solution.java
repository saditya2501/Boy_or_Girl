import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Character> ch = new HashSet<>();
        String Name = sc.nextLine();
        for (int i = 0; i <Name.length(); i++)
            ch.add(Name.charAt(i));
        if (ch.size() % 2 == 0)
            System.out.println("CHAT WITH HER!");
        else
            System.out.println("IGNORE HIM!");

        sc.close();

    }

}