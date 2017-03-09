package extendDistribution;

/**
 * Created by heshuzhan on 2017/3/9.
 */
/*
*当一个类继承于另一个类，子类中没有父类的方法时。用子类的对象调用方法时，会首先在子类中查找，如果子类中没有改方法，再到父类中查找。

当一个方法只在父类中定义时，调用该方法时会使用父类中的属性。
如果该方法中又调用了其他方法，那么还是按照之前的顺序，先在子类中查找，再在父类中查找。
* */
public class Temp {
    public static void main(String[] args) {
        extendss num1 = new extendss(10);
        B num2 = new B(9);
        num1.show();
        num2.show();
    }
}
