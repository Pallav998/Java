//WAP for break and continue example .
public class L4c {
    public static void main(String args[]) {
        for (int i = 1; i <= 21; i++) {
            if(i==5)
                continue;
            System.out.println(i);
            if(i==10)
                break;
        }
    }
}
