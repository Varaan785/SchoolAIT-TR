package lesson3.homeWork3;
/**
 * AIT-TR, Cohort 42.1, Java Basic, HW #3
 *
 * @author Valerian
 * @version 21-Jan-24
 */

public class HomeWork3{

    public static void main(String[] args) {
        int q =0;
        int w =1;
        int e =2;
        int r =3;
        int t =4;
        int z =5;
        int u =6;
        int i =7;
        int o =8;
        int p =9;
        System.out.println(q+w+e+r+t+z+u+i+o+p);
        int v =45;
        System.out.println(v/10f);

        double A_price = 1000, B_price = 500, Discount = 0.1;
        double AB_disc = (A_price+B_price)*(1-Discount);
        double pride_dis = (A_price+B_price)*Discount;
        System.out.println("Summe mit Rabat: " + AB_disc);
        System.out.println("Rabat: " + pride_dis);

        int l =10 / 2;
        float k =10/3f;
        System.out.println(l);
        System.out.println(k);

        System.out.println(r +=r++);
    }
}
