package org.xtext.example.rules.analysis;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
/**
 * 
 * @author cnandi
 *
 */
public class SpecificationParser {
    private HashMap<String, ArrayList<String>> conflicting_value_state_names = new HashMap<String, ArrayList<String>>();
    
	public void parseConflicts(File conflict_file) {
        String line = null;
        ArrayList<String> states = new ArrayList<String>();
        String conflictingStateValue = null;
        try {
            FileReader fileReader = new FileReader(conflict_file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                if (line.startsWith("#")) {
                    continue;
                }
                // TODO: only works for two conflicting states right now, generalize this? also remove hard coding of
                // indices
                if (line.startsWith("{")) {
                    states.add(line.split("\\s+")[1]);
                    states.add(line.split("\\s+")[2]);
                    conflictingStateValue = line.split("\\s+")[3];
                }
                conflicting_value_state_names.put(conflictingStateValue, states);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("cannot open file " + conflict_file);
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("unable to read file " + conflict_file);
            e.printStackTrace();
        }
    }

}
