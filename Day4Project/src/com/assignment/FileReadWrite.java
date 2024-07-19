package com.assignment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWrite {
	
	//write a paragraph
	public static void main(String[] args) throws IOException {
		File file = new File("test.txt");
		try (FileWriter fw = new FileWriter(file);
			 BufferedWriter bw = new BufferedWriter(fw)) {

			    String paragraph = "fisrst line.\n"
			            + "ggggggggggggggg.\n"
			            + "hhhhhhhhhhhhhhhh.\n";
			           
			    bw.write(paragraph);

			    System.out.println("Paragraph written to the file successfully.");

			} catch (IOException e) {
			    System.err.println("An IOException occurred: " + e.getMessage());
			}

		
		
		//read number of characters
		int numberOfCharactersToRead = 100; 

		try (FileReader fr = new FileReader(file)) {
		    char[] buffer = new char[numberOfCharactersToRead];
		    int charactersRead = fr.read(buffer, 0, numberOfCharactersToRead);

		    if (charactersRead != -1) {
		        String output = new String(buffer, 0, charactersRead);
		        System.out.println("Characters read: " + charactersRead);
		        System.out.println(output);
		    } else {
		        System.out.println("End of file reached or no characters read.");
		    }

		} catch (IOException e) {
		    System.err.println("An IOException occurred: " + e.getMessage());
		}
		
		
		
		//read number of words
		int numberOfWordsToRead = 10; 

		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
		    StringBuilder content = new StringBuilder();
		    String line;
		    int wordCount = 0;

		    while ((line = br.readLine()) != null && wordCount < numberOfWordsToRead) {
		        String[] words = line.split("\\s+");
		        for (String word : words) {
		            if (wordCount < numberOfWordsToRead) {
		                content.append(word).append(" ");
		                wordCount++;
		            } else {
		                break;
		            }
		        }
		    }

		    System.out.println("Words read: " + wordCount);
		    System.out.println(content.toString().trim());

		} catch (IOException e) {
		    System.err.println("An IOException occurred: " + e.getMessage());
		}
//Read number of lines
		int numberOfLinesToRead = 5; 

		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
		    StringBuilder content = new StringBuilder();
		    String line;
		    int lineCount = 0;

		    while ((line = br.readLine()) != null && lineCount < numberOfLinesToRead) {
		        content.append(line).append(System.lineSeparator());
		        lineCount++;
		    }

		    System.out.println("Lines read: " + lineCount);
		    System.out.println(content.toString().trim());

		} catch (IOException e) {
		    System.err.println("An IOException occurred: " + e.getMessage());
		}
//replace a char s with *
		File outputFile = new File("modified_demo.txt");

        
        StringBuilder content = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line).append(System.lineSeparator());
            }
        } catch (IOException e) {
            System.err.println("An IOException occurred while reading the file: " + e.getMessage());
        }

        // Replace all occurrences of 's' with '*'
        String modifiedContent = content.toString().replace('s', '*');

      
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {
            bw.write(modifiedContent);
            System.out.println("Character replacement completed. Check the file: " + outputFile.getName());
        } catch (IOException e) {
            System.err.println("An IOException occurred while writing to the file: " + e.getMessage());
        }

        
		
	}
	

}
