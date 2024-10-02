package oops4;

public class LearnLambdaExpression {
    public static void main(String[] args) {
        WalkAble walkAble = (int steps) -> {
            System.out.println("Walked " + steps + " steps");
            return steps;
        };
        walkAble.walks(10);

        WalkAble walkAble1 = (int steps) -> 2 * steps;
        System.out.println(walkAble1.walks(10));
    }
}

@FunctionalInterface
interface WalkAble {
    int walks(int steps);
}
