package beginner;


import com.sandwich.koan.Koan;

import static com.sandwich.koan.constant.KoanConstants.__;
import static com.sandwich.util.Assert.assertEquals;

public class AboutConstructors {

    class A {
        String someString = "a";

        public A() {
            someString += "x";
        }

    }

    class B extends A {
        public B() {
            someString += "g";
        }

    }

    @Koan
    public void simpleConstructorOrder() {
        assertEquals(new B().someString, "axg");
        // since constructor inititalizes variable
        // instantiating B would invoke A's constructor whose initial value is a and then it adds x to it
        // which is eventually added g to it from B
    }

    class Aa {
        String someString = "a";

        public Aa() {
            someString += "x";
        }

        public Aa(String s) {
            someString += s;
        }
    }

    class Bb extends Aa {
        public Bb() {
            super("Boo");
            someString += "g";
        }

    }

    @Koan
    public void complexConstructorOrder() {
        assertEquals(new Bb().someString, "aBoog");
    }

    // Here in my understanding since the Bb class extends Aa and it has two constructor methods
    // when the super is called with a argument only that method is called
    // and then the g is added

}
