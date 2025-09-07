public class FormatTable {
    public static void main(String[] args) {
        String header = String.format("%-10s %-10s %-10s","Name","Age","Score");
        String row1 = String.format("%-10s %-10d %-10.2f","Raj",22,95.5);
        String row2 = String.format("%-10s %-10d %-10.2f","Anu",21,88.5);

        System.out.println(header);
        System.out.println(row1);
        System.out.println(row2);
    }
    
}