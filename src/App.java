
import java.util.Scanner;

public class App {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if(a.length() != b.length())
            return false;
        
        char[] arra = getSortedCharArray(a);
        char[] arrb = getSortedCharArray(b);
        
        
        for(int i = 0; i < a.length(); i++)
            if(arra[i] != arrb[i])
                return false;
                
        return true;
        
    }
    
    private static char[] getSortedCharArray(String s)
    {
        char[] arr = new char[s.length()];
        
        for(int i = 0; i < s.length(); i++)
            arr[i] = s.toLowerCase().charAt(i);
            
        for(int i = 0; i < arr.length -1; i++)
            for(int j = i+1; j < arr.length; j++)
                if(arr[i] < arr[j])
                {
                    char tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
        
        return arr;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
