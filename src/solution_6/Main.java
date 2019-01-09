package solution_6;

public class Main {
    public static void main(String[] args) {
        IsValid isValid = new IsValid();
        String  a = "({})";
        boolean s = isValid.isValid(a);
        System.out.println(s);
    }
}
