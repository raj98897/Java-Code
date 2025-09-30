class Students{
    int id;
    String name;
    public Students(int id, String name){
        this.id = id;
        this.name = name;
    }
}


public class Student {
    public static void main(String[] args) {
        Students s1 = new Students(101, "Lily");
        System.out.println(s1.id);
        System.out.println(s1.name);

    }
}
