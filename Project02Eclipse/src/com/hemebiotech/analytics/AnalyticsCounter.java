package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public class AnalyticsCounter extends CountSymptoms {

	/**
	 * @param filepath a full or partial path to file with symptom strings in it, one per line
	 */
	public AnalyticsCounter(String filepath) {
		super(filepath);
	}

	public static void main(String args[]) throws Exception {

		CountSymptoms countSymptoms = new CountSymptoms("C:/Users/ahallier/IdeaProjects/Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application/Project02Eclipse/symptoms.txt");
		Map<String, Integer> result = countSymptoms.GetSymptomsCount();
		System.out.println("symptom from file: " + result);
		
		// next generate output
		/*FileWriter writer = new FileWriter ("result.out");
		writer.write("headache: " + headacheCount + "\n");
		writer.write("rash: " + rashCount + "\n");
		writer.write("dialated pupils: " + pupilCount + "\n");
		writer.close();*/
	}

}
