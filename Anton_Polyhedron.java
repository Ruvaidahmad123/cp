import java.util.Scanner;

public class Anton_Polyhedron {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        // while (t-- > 0) {
            int n=sc.nextInt();
            sc.nextLine();
            int ans=0;
            for(int i=0;i<n;i++){
                String str=sc.nextLine();
                if(str.equals("Tetrahedron"))ans+=4;
                else if(str.equals("Cube"))ans+=6;
                else if(str.equals("Octahedron"))ans+=8;
                else if(str.equals("Dodecahedron"))ans+=12;
                else if(str.equals("Icosahedron"))ans+=20;
            }
            System.out.println(ans);
        // }
        sc.close();
    }
}
