public class task1 {

    public static String check(String name,int age){
        if(age<200){
            return "hello name";
        }
        if(age>200){
            return "invalid age";
        }
        if(age>18){
            return "sorry name, you are not eligible";
        }
        else{
            return ("cong"+name+"you are eligiable");
        }
        

    }

    public static double makedouble(double a){
        double b=Math.pow(2, 2.5);
        return b;
    }
    public static void main(String[] args) {



        //task1

        String ans=check("samir", 50);
        System.out.println(ans);



        //task 2
        
        double total=makedouble(5);
        System.out.println(total);

    }
    
}
