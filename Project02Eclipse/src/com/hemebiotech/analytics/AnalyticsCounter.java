package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class AnalyticsCounter extends GenerateOutputTextfile {

	/**
	 * @param filepath a full or partial path to file with symptom strings in it, one per line
	 */
	public AnalyticsCounter(String filepath) {
		super(filepath);
	}

	public static void main(String args[]) throws IOException {

		try {
			GenerateOutputTextfile generateOutputTextfile = new GenerateOutputTextfile("C:/Users/ahallier/IdeaProjects/Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application/Project02Eclipse/symptoms.txt");
			generateOutputTextfile.GetOutputTextfile();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
