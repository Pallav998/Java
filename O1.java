public class O1 {
    public static void main(String[] args) {
        int a =7;
        int b = 0;
        b = ++a; // Pre increment means it will increse first then print new value .
        System.out.println(b);
        System.out.println(a);

        int c =4;
        int d = 0;
        d = c++; //post increment it will print then increase ;
        System.out.println(d);
        System.out.println(c);

        int ab = 23;
        int bc = 0;
         bc = --ab;//pre decrement it will decrease first then print new value ;
         System.out.println(bc);
         System.out.println(ab);

         int g = 17;
         int h =0 ;
         h = g--;// post decrement it will print then decrease
         System.out.println(h);
         System.out.println(g);
        
    }
}
