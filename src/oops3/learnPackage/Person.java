package oops3.learnPackage;

public class Person {
    public static int count = 0;
    private int age;
    private String name;
    boolean canBeChanged = true;

    public Person() {
        count++;
    }

    // setter method to set age
    public void setAge(int age) {
        if(canBeChanged) {
            if(age > 0) {
                this.age = age;
            }
        }
    }

    boolean canBeAccessed = true;

    // getter method to get age
    public int getAge() {
        if(canBeAccessed) return age;
        return -1;
    }
}
