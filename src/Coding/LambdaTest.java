package Coding;
public class LambdaTest
{
    public static void main(String args[])
    {
        LambdaTest tester = new LambdaTest();

        // 有参数类型
        MathOperation addition = (int a, int b) -> a + b;

        // 无参数类型
        MathOperation subtraction = (a, b) -> a - b;

        // 有花括号，有return关键字
        MathOperation multiplication = (int a, int b) -> {
            return a * b;
        };

        // 无花括号，无return关键字，单一表达式情况
        MathOperation division = (int a, int b) -> a / b;

        // MathOperation调用示例
        System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
        System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
        System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + tester.operate(10, 5, division));

        // 有括号
        GreetingService greetService1 = message -> System.out.println("Hello " + message);

        // 无括号，单个参数情况
        GreetingService greetService2 = (message) -> System.out.println("Hello " + message);

        // GreetingService调用示例
        greetService1.sayMessage("Mahesh");
        greetService2.sayMessage("Suresh");

        //有括号， 无参情况
        Runnable runTest = () -> System.out.println("Running");
        //Runnable调用示例
        runTest.run();
    }

    // 内部接口
    interface MathOperation
    {
        int operation(int a, int b);
    }

    interface GreetingService
    {
        void sayMessage(String message);
    }

    interface qRunnable
    {
        void run();
    }

    private int operate(int a, int b, MathOperation mathOperation)
    {
        return mathOperation.operation(a, b);
    }
}