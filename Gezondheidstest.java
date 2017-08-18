package gezondheidstest;
import java.util.*;
/*
Healthcheck based on heartbeat, bodytemp and systole
made by Jor Sanders
*/
public class Gezondheidstest {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        
        //declaring the variables
        String[] conditionNames = {"heartbeat", "bodytemperature", "Systole"};
        String[] conditionMeasurements = {"(bpm)", "(degrees celsius)", "(mm hg)"};
        double[] conditionInput = new double[conditionNames.length];
        double[] conditionMax = {90, 37.5, 140};
        double[] conditionMin= {55, 36.3, 100};
        
        //reading the user input
        for(int counter = 0; counter < conditionNames.length; counter++){
            System.out.print("what is your " + conditionNames[counter] + " " 
            + conditionMeasurements[counter] + "?: ");
            conditionInput[counter] = stdin.nextDouble();}
        
        //prints if the user is healthy
        System.out.println("");
         for(int counter = 0; counter < conditionNames.length; counter++){
             System.out.print("your " + conditionNames[counter] + " is " );
             if (between(conditionInput[counter], conditionMax[counter], conditionMin[counter])){}
             else {System.out.print("not ");}
             System.out.println("healthy");}
    }
    
    //checks if the user is healthy
    static boolean between(double userInput, double max, double min){
    if(userInput > max || userInput < min){
        return false;}
    else{return true;}
    }    
}
//reached end of file have a cookie