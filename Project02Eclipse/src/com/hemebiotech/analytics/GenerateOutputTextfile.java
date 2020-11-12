package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Generate a text file from a Map of the list of each symptom associated with their
 * number of occurrence
 *
 * The text file is named "result.txt"
 */
public class GenerateOutputTextfile extends CountSymptoms {

    /**
     * @param filepath a full or partial path to file with symptom strings in it, one per line
     */
    public GenerateOutputTextfile(String filepath) { super(filepath); }

    /**
     * @return a text file of the list of each symptom associated with their number of occurrence
     */
    protected BufferedWriter GetOutputTextfile() {

        Map<String, Integer> symptomsCount = super.GetSymptomsCount();
        BufferedWriter writer = null;

        // Catch the exception generated when the output stream can't be created
        try {
            // Writes text to a character-output stream, buffering characters so as to provide
            // for the efficient writing of single characters, arrays, and strings
             writer = new BufferedWriter(new FileWriter("result.txt"));

            // Return a Set view of the mappings contained in the map
            for (Map.Entry entry : symptomsCount.entrySet()) {
                writer.write(entry.getKey() + " = " + entry.getValue() + "\r\n");
            }

            // Close the stream and releases any system resources associated with it
            writer.close();

        } catch (IOException e) {
            System.out.println("Impossible de créer le fichier de sortie.");
        }

        return writer;
    }

}
