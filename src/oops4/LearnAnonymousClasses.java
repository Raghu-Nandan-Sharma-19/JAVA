package oops4;

public class LearnAnonymousClasses {
    // anonymous class --> can only be used once
    OuterClass outerClass = new OuterClass() {
        void sing() {

        }

        @Override
        public void outerMethod() {
            super.outerMethod();
        }
    };

    SuperInterface superInterface = new SuperInterface() {
        @Override
        public void interfaceMethod() {

        }
    };

}

class OuterClass {
    public void outerMethod() {
        System.out.println("Hello");
    }
}

interface SuperInterface {
    void interfaceMethod();
}
