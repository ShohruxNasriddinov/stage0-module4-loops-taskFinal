package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++)
        {
            int n = cathetusLength+1;
            for (int j = 1; j<= n - i; j++)
            {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--)
            {
                System.out.print(k);
            }
            for (int l = 2; l <= i; l++)
            {
                System.out.print(l);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
