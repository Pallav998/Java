public class L6b {
   public static void main(String[] args) {
    int x =3;int y =7;

    int a = x++;
    System.out.println(a);

    int b = ++y;
    System.out.println(b);

    int c = --x;
    System.out.println(c);

    int d = y--;
    System.out.println(d);
    
    int e =  x++ + ++y;
    System.out.println(e);
    
    int f = --x - y--;

    int z = x++ + ++y - --x - y--;
    System.out.println(z);
   } 
}
