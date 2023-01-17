import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class switchwork {
    public static void main(String[] args) throws IOException {
        int c;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the date");
        c=Integer.parseInt(br.readLine());
        switch (c) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("no days to show");

        }

    }
}
