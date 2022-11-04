import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 1;i<=t;i++) {
            String str = scanner.nextLine();
            // System.out.println(str + i);
            float x = 0;
            float y = 0;
            for(int j = 0;j< str.length();j++){
                char c = str.charAt(j);
                // System.out.println(c);
                if(c == 'A'){
                    x++;
                }else if(c == 'B'){
                    x += 0.5;
                    y += 0.5;
                }else if(c == 'C'){
                    x -= 0.5;
                    y += 0.5;
                }else if(c == 'D'){
                    x--;
                }else if(c == 'E'){
                    x -= 0.5;
                    y -= 0.5;
                }else if(c == 'F'){
                    x += 0.5;
                    y -= 0.5;
                }
            }
            if(x < 0){
                x *= -1;
            }
            if(y < 0){
                y *= -1;
            }
            int myRes;
            if(x >= y){
                myRes = (int)(x+y);
            }else{
                myRes =(int)(x + (y-x)*2);
            }
            res.add(myRes);
        }
        for(Integer x : res){
            System.out.println(x);
        }

    }
}
