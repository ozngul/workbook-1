package com.pluralsight;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BedtimeStories {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueReading = true;

        while (continueReading) {
            // Kullanıcıya seçenekler göster
            System.out.println("\nWhich story would you like to read?");
            System.out.println("1 - goldilocks.txt");
            System.out.println("2 - hansel_and_gretel.txt");
            System.out.println("3 - mary_had_a_little_lamb.txt");
            System.out.print("Enter the number of the story: ");
            int choice = input.nextInt();
            input.nextLine(); // dummy input

            // Seçime göre dosya adı belirle
            String fileName = "";
            switch (choice) {
                case 1:
                    fileName = "goldilocks.txt";
                    break;
                case 2:
                    fileName = "hansel_and_gretel.txt";
                    break;
                case 3:
                    fileName = "mary_had_a_little_lamb.txt";
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    continue;
            }

            // Dosya yolu
            String filePath = "/Users/ozangul/pluralsight/workbook-1/Mod01/BedtimeStories/" + fileName;

            // Dosyayı okuma ve hata yakalama
            try (Scanner fileReader = new Scanner(new File(filePath))) {
                int lineNumber = 1;
                System.out.println("\nNow reading: " + fileName + "\n");
                while (fileReader.hasNextLine()) {
                    String line = fileReader.nextLine();
                    System.out.printf("%d: %s%n", lineNumber, line);
                    lineNumber++;
                }
            } catch (FileNotFoundException e) {
                System.out.println("Oops! The file could not be found.");
            }

            // Yeniden başlatma sorusu
            System.out.print("\nWould you like to read another story? (yes/no): ");
            String answer = input.nextLine().toLowerCase();
            if (!answer.equals("yes") && !answer.equals("y")) {
                continueReading = false;
                System.out.println("Goodbye! ");
            }
        }
    }
}