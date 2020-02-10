public interface Operations {
    public void operate(int number1,int number2);
}
class Addition implements Operations{
    public void operate(int number1, int number2) {
        System.out.println(number1+number2);
    }
}
class Subtraction implements Operations{
    public void operate(int number1, int number2) {
        System.out.println(number1-number2);
    }
}
class Multiplication implements Operations{
    public void operate(int number1, int number2) {
        System.out.println(number1*number2);
    }
}
class Division implements Operations{
    public void operate(int number1,  int number2) {
        System.out.println(number1/number2);
    }
}


