// Star Pattern - 3
/* 

    * 
    * * 
    * * * 
    * * * * 
    * * * 
    * * 
    * 

*/

public class StarPattern3 {
    public static void main(String[] args) {
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
        for(int i=0;i<3;i++)
        {
            for(int j=i;j<3;j++)
            {
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
    }
}
