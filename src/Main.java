import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static List<Animal> animals = new ArrayList<>();
    static String menu = "Press the number of the action to perform:\n" +
            "1- Create new dog\n" +
            "2- Create a new donkey\n" +
            "3- Export animal database\n" +
            "4- Exit program";

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        boolean play = true;
        while (play) {
            int option = Integer.parseInt(JOptionPane.showInputDialog(null, "Hello and welcome!\n" + menu));
            switch (option) {
                case 1:
                    get_dog();
                    break;
                case 2:
                    get_donkey();
                    break;
                case 3:
                    export();
                    break;
                case 4:
                    play = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Enter a valid option");
                    break;
            }

        }
        JOptionPane.showMessageDialog(null, "Bye bye :)");
    }

    private static void export() throws FileNotFoundException, UnsupportedEncodingException {
        //export to txt
        if (animals.size() > 0) {
            String file_name = "export_" + LocalDate.now() + ".txt";
            PrintWriter writer = new PrintWriter(file_name, "UTF-8");
            for (Animal animal : animals) {
                writer.println(animal.toString());
            }
            writer.close();
        } else {
            System.out.println("Nothing to save.");
        }
    }

    private static void get_donkey() {
        //creating donkey
        Donkey donkey = new Donkey();
        int iq = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the IQ of the donkey"));
        donkey.setId(animals.size() + 1);
        donkey.setIq_level(iq);
        animals.add(donkey);

        int option = JOptionPane.showConfirmDialog(null, "Let donkey be a donkey?");
        if (option == 0)
        {
            JOptionPane.showMessageDialog(
                    null,
                    "Check the CLI :)",
                    donkey.getIq_level() + " IQ points XD",
                    JOptionPane.INFORMATION_MESSAGE);
            System.out.println(donkey.getShape());
        }else
        {   String[] options = {"I'll try", "I'm mad", "I don't know"};
            int x = JOptionPane.showOptionDialog(null, "Why?",
                    "Choose your destiny",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
            if (x == 0)
            {
                JOptionPane.showMessageDialog(null, "Check the CLI :)");
                System.out.println(donkey.getShape());
            }
        }
    }

    private static void get_dog() {
        Dog dog = new Dog();
        String name = JOptionPane.showInputDialog(null, "Enter animal name");
        String attributes_ = JOptionPane.showInputDialog(null, "Enter attributes, as many as you remember");
        List<String> attributes = new ArrayList<String>(Arrays.asList(attributes_.split(" ")));

        dog.setId(animals.size() + 1);
        dog.setName(name);
        dog.setAttributes(attributes);
        animals.add(dog);

    }
}