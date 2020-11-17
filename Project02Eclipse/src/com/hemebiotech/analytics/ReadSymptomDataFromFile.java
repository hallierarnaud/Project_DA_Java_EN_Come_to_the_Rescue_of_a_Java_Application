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

	// Enable to override the method GetSymptoms()
	@Override
	public List<String> getSymptoms() {
		ArrayList<String> result = new ArrayList<String>();

		// Check that the input stream is not null
		if (filepath != null) {
			// Catch the exception generated when the input stream can't be open
			try {
				// Read text from a character-input stream, buffering characters so as to provide
				// for the efficient reading of characters, arrays, and lines
				BufferedReader reader = new BufferedReader (new FileReader(filepath));
				String line = reader.readLine();
				
				// Add the line from the input stream to the ArrayList
				while (line != null) {
					result.add(line);
					line = reader.readLine();
				}

				// Close the stream and releases any system resources associated with it
				reader.close();

			} catch (IOException e) {
				System.err.println("Impossible de lire les donnees sources.");
				return null;
			}
		}
		
		return result;
	}

}
