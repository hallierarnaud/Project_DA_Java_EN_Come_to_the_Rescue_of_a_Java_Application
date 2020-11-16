package com.hemebiotech.analytics;

/**
 * Generate a text file of a list of symptoms with their occurrence named "result.txt"
 *
 * The path of the source file of the symptoms must be furnished
 */
public class AnalyticsCounter extends GenerateOutputTextFile {

	public static final String INPUT_DATA = "symptoms.txt";

	/**
	 * @param filepath a full or partial path to file with symptom strings in it, one per line
	 */
	public AnalyticsCounter(String filepath) {
		super(filepath);
	}

	public static void main(String args[]) {

		// Generate the output text file from an input stream whose path must be specified
		GenerateOutputTextFile generateOutputTextfile = new GenerateOutputTextFile(INPUT_DATA);
		generateOutputTextfile.getOutputTextFile();

	}

}
