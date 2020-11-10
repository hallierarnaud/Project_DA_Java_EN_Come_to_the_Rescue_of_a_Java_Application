package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class GenerateOutputTextfile extends CountSymptoms {

    /**
     * @param filepath a full or partial path to file with symptom strings in it, one per line
     */
    public GenerateOutputTextfile(String filepath) { super(filepath); }

    protected FileWriter GetOutputTextfile() {

        Map<String, Integer> symptomsCount = super.GetSymptomsCount();
        FileWriter writer = null;

        try {
            writer = new FileWriter("result.txt");

            // Map.entrySet() method
            for (Map.Entry entry : symptomsCount.entrySet()) {
                writer.write(entry.getKey() + " = " + entry.getValue() + "\r\n");
            }
            writer.close();

        } catch (IOException e) {
            System.out.println("Impossible de créer le fichier de sortie.");
        }

        return writer;

    }

}
