package sample;

public class Cast {

    public static void main(String[] args) {
        var a = 3;
        var b = 2;
        
        
        System.out.println(a / b);
        
        //先にaをdouble型にキャストしてから割り算
        System.out.println((double)a / b);
        
        //先にa / bをdouble型にキャストしてから割り算
        System.out.println((double)(a / b));
        

    }

}
