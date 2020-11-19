package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Simple brute force implementation
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	private String filepath;
	
	/**
	 * @param filepath a full or partial path to file with symptom strings in it, one per line
	 */
	public ReadSymptomDataFromFile (String filepath) {
		this.filepath = filepath;
	}

	/**
	 * @return an ArrayList of the symptoms read in the source file
	 */

	@Override
	public List<String> getSymptoms() {
		ArrayList<String> result = new ArrayList<String>();

		// Check that the input stream is not null
		if (filepath != null) {

			try {
				// Read text from an input stream
				BufferedReader reader = new BufferedReader (new FileReader(filepath));
				String line = reader.readLine();
				
				// Add lines from the input stream to an ArrayList
				while (line != null) {
					result.add(line);
					line = reader.readLine();
				}

				reader.close();

			// Catch the exception generated when the input stream can't be open
			// and introduce a fail fast
			} catch (IOException e) {
				System.err.println("Impossible de lire les donnees sources.");
				return null;
			}
		}
		
		return result;
	}

}
