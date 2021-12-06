public class convertString{
    public static void main(String[] args) {
        String[] q = {"H","e","l","l","o","W","o","r","l","D"};

        for (int i = 0; i < q.length; i++) {
            System.out.print(q[i]);
        }
        System.out.println();
        for (int i = 0; i < q.length; i++) {
            if (q[i].toUpperCase().equals(q[i])) {
                System.out.print(q[i].toLowerCase());
            } else {
                System.out.print(q[i].toUpperCase());
            }
        }
    }
}