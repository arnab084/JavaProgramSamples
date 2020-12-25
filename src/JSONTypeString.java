import jdk.nashorn.internal.ir.debug.JSONWriter;
import jdk.nashorn.internal.parser.JSONParser;

import java.util.HashMap;
import java.util.Map;

public class JSONTypeString {
    public static void main(String args[]){
        String jobBody = "{" +
                    "\"JobType\": \"HALFORDS_JOB\"," +
                    "\"JobId\": \"HA63\"," +
                    "\"ManualNarrativeText\": \"Customer Requested\"" +
                    "}";

        System.out.println(String.format("%014d" , Integer.parseInt("100")));

    }
}
