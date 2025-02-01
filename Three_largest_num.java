public class Three_largest_num {
    public static void main(String[] args) {
        int a=10,b=20,c=15;
        String large=((a>b&&a>c)?a="is largest":(b>c)?b+"is largest":c="is largest");
        System.out.println(large);
    }
}
