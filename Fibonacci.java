package zadania;

public class Fibonacci {

    public static void main(String[] args) {
        //1sposób
        /*
        int a=0;
        int b=1;
        int suma;

        for ( int i=0; i<=15;i++){
            if(i==0 || i==1){
                System.out.println(i);
            }
            suma=a+b;
            System.out.println(suma);
            a=b;
            b=suma;

        }

         */

        int[] tab=new int[10];
        tab[0]=0;
        tab[1]=1;
        System.out.println(tab[0]);
        System.out.println(tab[1]);
        for(int i=2; i<tab.length; i++){
            tab[i]=tab[i-1]+tab[i-2];
            System.out.println(tab[i]);
        }
    }
}
