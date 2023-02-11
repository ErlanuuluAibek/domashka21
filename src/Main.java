import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("Alphabet");
        fileWriter.write("A a\n");
        fileWriter.write("B b\n");
        fileWriter.write("C c\n");
        fileWriter.write("D d\n");
        fileWriter.write("E e\n");
        fileWriter.write("F f\n");
        fileWriter.write("G g\n");
        fileWriter.write("H h\n");
        fileWriter.write("I i\n");
        fileWriter.write("J j\n");
        fileWriter.write("K k\n");
        fileWriter.write("L l\n");
        fileWriter.write("M m\n");
        fileWriter.write("N n\n");
        fileWriter.write("O o\n");
        fileWriter.write("P p\n");
        fileWriter.write("Q q\n");
        fileWriter.write("R r\n");
        fileWriter.write("S s\n");
        fileWriter.write("T t\n");
        fileWriter.write("U u\n");
        fileWriter.write("V v\n");
        fileWriter.write("W w\n");
        fileWriter.write("X x\n");
        fileWriter.write("Y y\n");
        fileWriter.write("Z z\n");
        fileWriter.write("1\n");
        fileWriter.write("2\n");
        fileWriter.write("3\n");
        fileWriter.write("4\n");
        fileWriter.write("5\n");
        fileWriter.write("6\n");
        fileWriter.write("7\n");
        fileWriter.write("8\n");
        fileWriter.write("9");
        fileWriter.close();
        StringBuilder stringBuilder = new StringBuilder();
        FileReader fileReader = new FileReader("Alphabet");
        Scanner scanner = new Scanner(fileReader);
        int san=1;
        while (scanner.hasNextLine()) {
            stringBuilder.append(san+":"+scanner.nextLine() + " \n");
            san++;
        }
        fileReader.close();
        System.out.println(stringBuilder);
    }
}