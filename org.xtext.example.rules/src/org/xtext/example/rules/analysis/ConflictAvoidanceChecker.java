package org.xtext.example.rules.analysis;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
/**
 * 
 * @author cnandi
 *
 */
public class ConflictAvoidanceChecker {

    private ArrayList<String> statesInvolved = new ArrayList<String>();
    
    public static PrintWriter ast_writer;
    
    static {
    	try {
    		 	ast_writer=new PrintWriter("ast-output.txt");
    	}
    	catch (FileNotFoundException f){  
    		f.printStackTrace();
    	}
    }
    
    public static void main(String[] args) throws IOException {
    	File rule_file = new File(
                "/home/cnandi/workspace/conflict_avoidance/src/smarthome/verification/sample_rule.rules");
        File conflict_file = new File(
                "src/org/xtext/example/rules/analysis/sample_conflict.conflicts");

        SpecificationParser specParser=new SpecificationParser();
        specParser.parseConflicts(conflict_file);
        RuleParser ruleParser=new RuleParser(rule_file.getName());
        ruleParser.analyseRules();        
       }

    public void parseRuleForConflictingStates(File rule_file) {
        String line = null;
        try {
            FileReader fileReader = new FileReader(rule_file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains(".state")) {

                }
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("cannot open file " + rule_file);
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("unable to read file " + rule_file);
            e.printStackTrace();
        }
    }
    
    public boolean checkConflict() {

        return true;
    }
}
