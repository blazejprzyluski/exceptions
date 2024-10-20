import fileOperations.TextSaver;

public class Main {
    public static void main(String[] args) {
        TextSaver saver = new TextSaver();

        System.out.println(saver.readFromFile("showcase.txt"));
    }
}