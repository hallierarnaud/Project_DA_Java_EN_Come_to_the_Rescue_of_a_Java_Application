package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Set;

public class GenerateOutputTextfile extends CountSymptoms {

    /**
     * @param filepath a full or partial path to file with symptom strings in it, one per line
     */
    public GenerateOutputTextfile(String filepath) { super(filepath); }

    protected FileWriter GetOutputTextfile() throws IOException {

        Map<String, Integer> symptomsCount = super.GetSymptomsCount();

        FileWriter writer = new FileWriter("result.txt");

		// Map.entrySet() method
        for (Map.Entry entry : symptomsCount.entrySet()) {
		    writer.write(entry.getKey() + "=" + entry.getValue() + "\r\n");
        }

		writer.close();

        return writer;

    }

}
