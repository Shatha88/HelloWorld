import java.util.Scanner; 
public class PrintStars {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number:");
        int rows=sc.nextInt();
        sc.close();
        String star="";
        for(int i=0;i<=rows;i++){
            if(i>=(rows/2)+1){
                star = star.substring(0, star.length()-1);

            }else{
                star+= "*";
            }
            System.out.println(star);

        }
    
    }
}
