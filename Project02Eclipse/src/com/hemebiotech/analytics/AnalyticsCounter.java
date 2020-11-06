package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;

public class AnalyticsCounter extends ReadSymptomDataFromFile {
	private static int headacheCount = 0;	// initialize to 0
	private static int rashCount = 0;		// initialize to 0
	private static int pupilCount = 0;		// initialize to 0

	/**
	 * @param filepath a full or partial path to file with symptom strings in it, one per line
	 */
	public AnalyticsCounter(String filepath) {
		super(filepath);
	}

	public static void main(String args[]) throws Exception {
		// first get input
		//BufferedReader reader = new BufferedReader (new FileReader("C:/Users/ahallier/IdeaProjects/Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application/Project02Eclipse/symptoms.txt"));
		//String line = reader.readLine();

		ReadSymptomDataFromFile readSymptomDataFromFile = new ReadSymptomDataFromFile("C:/Users/ahallier/IdeaProjects/Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application/Project02Eclipse/symptoms.txt");
		List<String> resultList = readSymptomDataFromFile.GetSymptoms();
		System.out.println("symptom from file: " + resultList);

		/*int i = 0;	// set i to 0
		int headCount = 0;	// counts headaches
		while (line != null) {
			i++;	// increment i
			System.out.println("symptom from file: " + line);
			if (line.equals("headache")) {
				headCount++;
				System.out.println("number of headaches: " + headCount);
			}
			else if (line.equals("rush")) {
				rashCount++;
			}
			else if (line.contains("pupils")) {
				pupilCount++;
			}

			line = reader.get();	// get another symptom
		}*/
		
		// next generate output
		/*FileWriter writer = new FileWriter ("result.out");
		writer.write("headache: " + headacheCount + "\n");
		writer.write("rash: " + rashCount + "\n");
		writer.write("dialated pupils: " + pupilCount + "\n");
		writer.close();*/
	}
}
