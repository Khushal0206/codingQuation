import javax.naming.spi.DirStateFactory.Result;

public class Demo117 {
    public static void main(String[] args) {
        int originalnum = 1532;
        int remender;
        double result=0;
        int num = originalnum;
        while (num!=0) {
            remender = num%10;
            result = result+Math.pow(remender,3);
            num = num/10;
            
        }
        if(result == originalnum){
            System.out.println("number is arstrong ");

        }else{
            System.out.println("number is not arstrong ");

        }

    }
    
}
