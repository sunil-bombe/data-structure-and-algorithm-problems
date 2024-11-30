package com.webwork.interview.geeks.problems;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterExample {

	public static void main(String[] args) {
		 String filePath = "output.txt";

	        try {
	            PrintWriter printWriter = new PrintWriter(new FileWriter(filePath));

	            printWriter.println("Hello, PrintWriter!");
	            printWriter.println("This is a demonstration of PrintWriter in Java.");

	            printWriter.close();

	            System.out.println("Data has been written to the file: " + filePath);
	        } catch (IOException e) {
	            System.err.println("Error writing to the file: " + e.getMessage());
	        }
	}

}
