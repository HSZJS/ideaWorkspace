package extendDistribution;

/**
 * Created by heshuzhan on 2017/3/9.
 */
public class extendss {
    int x =6;
    private  int y =2;
    public extendss (int a) {
        x = a;
    }
    int getz() {
        int z;
        z = x / y;
        return z;
    }

    void show() {
        System.out.println("x=" + x);
        System.out.println("y=" + y);
        System.out.println("z=" + getz());
    }
}
