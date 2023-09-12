package practice;

public class Task2 {
    static int count;

    public static void main(String[] args) {
        String[] books = {"Great time", "Silver fog", "Super deal", "Great choice",
                "Bob and Megan", "Mathematics" };
        for (int i = 1; i < books.length; i++) {
            String key = books[i];
            int j = i - 1;
            while (j >= 0 && (key.compareTo(books[j]) < 0)) {
                books[j + 1] = books[j];
                j--;
            }
            books[j + 1] = key;
        }
        System.out.print("Sorted books:");
        for (String book : books) {
            count++;
            System.out.printf("%n%d) %s,", count, book);
        }
    }

}
