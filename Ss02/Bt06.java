package Ss02;
public class Bt06 {
    public static void main(String[] args)
    {
        System.out.println("Duoi day la 20 so nguyen to dau tien:");
        int n=0,i=1;
        while(n<=20)
        {
            int j=1;
            int ct=0;
            while(j<=i)
            {
                if(i%j==0) // tham khao
                    ct++;
                j++;
            }

            if(ct==2)
            {
                System.out.print(i+" ");
                n++;
            }
            i++;
        }
    }
}