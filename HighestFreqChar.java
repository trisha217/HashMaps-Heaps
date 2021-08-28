import java.io.*;
import java.util.*;


public class HighestFreqChar {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i =0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(hm.containsKey(ch))
            {
                int oldFreq = hm.get(ch);
                int newFreq = oldFreq +1;
                hm.put(ch,newFreq);
            }
            else
            {
                hm.put(ch,1);
            }
        }
        int max = Integer.MIN_VALUE;
        char maxFreqChar = str.charAt(0);
        //System.out.println(hm);
        for(Character key : hm.keySet())
        {
            int val = hm.get(key);
            if(val>max)
            {
                max = val;
                maxFreqChar = key;
            }
        }
        System.out.println(max);
        System.out.println(maxFreqChar);
    }
}
