import java.math.*;
import java.util.*;
import java.io.*;

public class test
{
    public static void main(String[] args){
        
        double mc,tmp=0.0;
        int tip,tp,tc;
        
        Scanner sc=new Scanner(System.in);
        
        mc=sc.nextDouble();
        tip=sc.nextInt();
        tp=sc.nextInt();
        
        tmp += mc;
        tmp += mc*tip/100;
        tmp += mc*tp/100;
        
        tc=(int)Math.round(tmp);
        
        System.out.println("The total meal cost is "+ tc +" dollars.");
        
    }
}
