
//Writer Program Accept  String from the end user and reverse String Without changing the Vowels Position.
//Inpute :-akhil
//Outpute:-alhik

package String;

import java.util.Scanner;

import static String.Demo.rev;

public class Demo2 {
   static void rev(char s[],int l,int r)
    {
        for (int i = l; i < r / 2; i++) {
            char temp1 = s[i];
            s[i] = s[r - 1 - i];
            s[r - 1 - i] = temp1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
        char[] s = str.toCharArray();
        char[] temp = new char[s.length];

        int x = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i] == 'b' || s[i] == 'c'
                    || s[i] == 'd' || s[i] == 'f' || s[i] == 'g' || s[i] == 'h' || s[i] == 'j' || s[i] == 'k' || s[i] == 'l'
                    || s[i] == 'm' || s[i] == 'n' || s[i] == 'p' || s[i] == 'q' || s[i] == 'r' || s[i] == 's' || s[i] == 't' || s[i] == 'v'
                    || s[i] == 'x' || s[i] == 'y' || s[i] == 'z') {
                // storing elements in array
                temp[x] = s[i];
                x++;
            }
        }
            rev(temp, 0, x);

        x = 0;
            for (int j = 0; j < s.length; j++) {
                if (s[j] == 'b' || s[j] == 'c'
                         || s[j] == 'd' || s[j] == 'f'|| s[j]=='g' ||s[j]=='h' || s[j]=='j'||s[j]== 'k'||s[j]=='l'
                        ||s[j]=='m'||s[j]=='n'||s[j]== 'p'||s[j]=='q'||s[j]== 'r'||s[j]== 's'||s[j]== 't'||s[j]=='v'
                        ||s[j]=='x'||s[j]== 'y'||s[j]== 'z') {
                    // updating the origional string
                    s[j] = temp[x];
                    x++;
                }
            }
            String revStr = new String(s);
            System.out.println("reversed string is: " + revStr);

        }
    }

