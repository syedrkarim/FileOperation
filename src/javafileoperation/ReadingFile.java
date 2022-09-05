package javafileoperation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFile {

	public static void main(String[] args) {

		doesFileExist("Dictionary.txt");

	}

	public static String doesFileExist(String fileName) {

		File file = new File(fileName);
		// Scanner sc= new Scanner(new File(fileName)); Combine in one line
		try {
			Scanner sc = new Scanner(file);
			while (sc.hasNext()) {
				System.out.println(sc.nextLine());
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("File does not exist.");

		}

		return "";
	}

}
