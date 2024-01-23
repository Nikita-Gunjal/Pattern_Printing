//Star Pattern Printing...
import java.util.Scanner;
public class StarPatterns{
    //public static void main(String[] args) {
        /*Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();

        int st=1;
        int sp=n-1;

        for(int i=0;i<n;i++){
            //star printing

            for(int j=0;j<st;j++){
                System.out.print(" * ");
            }
            //space printing
            for(int j=0;j<sp;j++){
                System.out.print(" ");
            }
            System.out.println();
        st++;
        sp--;
       
    }*/

    /*Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();                             
                                                       
                                                      
    int st=1;                                        
    int sp=n-1;    
    int number_of_lines=1;
    while(number_of_lines<=n)    {

                              

   // for(int i=0;i<=n;i++){
        for(int j=0;j<sp;j++){
            System.out.print("  ");
        }
        for(int j=0;j<st;j++){
            System.out.print(" * ");
        }
            System.out.println();
            st++;
            sp--;
            number_of_lines++;
    }
}*/


private static int i;
/*public static void hollwrect(int totrows, int totcoln){
    for(int i=1;i<=totrows;i++){
        //inner loop
        for(int j=1;j<=totcoln;j++){

            if(i==1 || i==totrows || j==1 || j==totcoln){
                System.out.print("* ");
            }else{
                System.out.print("  ");
            }

        }
        System.out.println();

    }

}


public static void main(String[]args){
    hollwrect(4 , 5);
     
}*/
/*public static void Inverted_Half_pyramid(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
        System.out.print(" ");
    }
    for(int j=1;j<=i;j++){
        System.out.print("*");
    }
    System.out.println();
}
}

public static void main(String[]args){
    Inverted_Half_pyramid(4);

}*/
    /*public static void Invert_pyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+ " " );
            }
        
            System.out.println();
        }

}
    public static void main(String[]args){
        Invert_pyramid(5);
}*/


    /*public static void Floyds_Rectangle(int n){
        int counter=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter +" ");
                counter++;
            }
            System.out.println();
        }

    }
    public static void main(String[]args){
        Floyds_Rectangle(5);

    }*/


    /*public static void Solid_Rhombus(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
            System.out.print(" ");
        }
        for(int j=1;j<=n;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
    public static void main(String[]args){
        Solid_Rhombus(5);

    }*/
    
}

