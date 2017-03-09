package extendDistribution;

/**
 * Created by heshuzhan on 2017/3/9.
 */
public class B   extends  extendss {
    int x = 3, y = 5, z;
    public B(int a) {
        super(a);
    }

    int getz() {
        z = x + y;
        return z;
    }
}
