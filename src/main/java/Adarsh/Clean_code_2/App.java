package Adarsh.Clean_code_2;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	PrintStream out =  new PrintStream(new FileOutputStream(FileDescriptor.out));
        Construction standardConstruction = new Construction("standard", 1250);
        Construction aboveStandardConstruction = new Construction("aboveStandard", 1810);
        Construction highStandardConstruction = new Construction("highStandard", 1430);
        Construction highAutomatedConstruction = new Construction("highStandard", 1725, true);
        out.println("The construction cost with standard materials with full automation is: " + standardConstruction.getConstructionCost());
        out.println("The construction cost with above standard materials is: " + aboveStandardConstruction.getConstructionCost());
        out.println("The construction cost with high standard materials is: " + highStandardConstruction.getConstructionCost());
        out.println("The construction cost with high standard materials with full automation is: " + aboveStandardConstruction.getConstructionCost());
        out.close();
    }
}
