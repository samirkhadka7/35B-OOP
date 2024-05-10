public class function {

    void printsomething(){
        System.out.println("this method print");
    }

    int returnint(){
        // int a=10;
        int value=10;
        return value;
    }

    double addValue(int num1, double num2){
        double sum=num1+num2;
        return sum;
    }

    static int multi(int a,int b){
        int ans=a*b;
        return ans;
    }

    public static String machine(int a){
        if(a==1){
            return "water";
        }
        if(a==2){
            return "frooti";
        }
        if(a==3){
            return "coke";
        }
        return "invalid menu";
    }

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

    public static void main(String[] args) {

        function f=new function();
        f.printsomething();

        int a=f.returnint();
        System.out.println(a);
        

        double total=f.addValue(10,10.2);
        System.out.println(total);

        int multireturn=multi(10,10);
        System.out.println(multireturn);


        String solution=machine(3);
        System.out.println(solution);


        String ans=check("samir", 17);
        System.out.println(ans);

    }
    
}
