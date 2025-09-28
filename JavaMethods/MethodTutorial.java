public class MethodTutorial {
    public static void D(){
        float d = 4.23f;
        System.out.println("In Method D");
    }
    public static void C(){
        double c = 3.2;
        System.out.println("In Method C");
    }
    public static void B(){
        int b = 5;
        C();
        System.out.println("In Method B");
    }
    public static void A(){
        int a = 6;
        B();
        System.out.println("In Method A");
    }
    public static void main(String[] args) {
        A();
        D();
    }
}
