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
public class GenerateOutputTextFile extends CountSymptoms {

    public static final String OUTPUT_FILE = "results.out";

    /**
     * @param filepath a full or partial path to file with symptom strings in it, one per line
     */
    public GenerateOutputTextFile(String filepath) { super(filepath); }

    /**
     * @return a text file of the list of each symptom associated with their number of occurrence
     */
    protected BufferedWriter getOutputTextFile() {

        Map<String, Integer> symptomsCount = super.getSymptomsCount();
        // To have the fail fast
        if (symptomsCount == null) {
            return null;
        }

        BufferedWriter writer = null;

        try {
            // Writes text to an output stream
             writer = new BufferedWriter(new FileWriter(OUTPUT_FILE));

            // Return a Set view of the mappings contained in the map
            for (Map.Entry entry : symptomsCount.entrySet()) {
                writer.write(entry.getKey() + " = " + entry.getValue() + "\n");
            }

            writer.close();

        // Catch the exception generated when the output stream can't be created
        // and introduce a fail fast
        } catch (IOException e) {
            System.err.println("Impossible de creer le fichier de sortie.");
            return null;
        }

        return writer;
    }

}
