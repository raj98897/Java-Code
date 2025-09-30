class A{
    private void display(){
        System.out.println("It's a class A");
    }
    public void show(){
        display();
    }
}

class PrivateModifier {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
    }
}