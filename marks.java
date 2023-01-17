import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class marks {
    public static void main(String[] args) throws IOException {
        int i, j, k;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("values i");
        i=Integer.parseInt(br.readLine());
        System.out.println("values j");
        j=Integer.parseInt(br.readLine());
        System.out.println("enter k");
        k=Integer.parseInt(br.readLine());
        int m=(i+j+k)/3;
        if (i>35&&j>35&&k>35&&m>40)
            System.out.println("pass");
        else
            System.out.println("fall");
    }
}
