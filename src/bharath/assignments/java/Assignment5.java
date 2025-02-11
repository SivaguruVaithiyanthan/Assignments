package bharath.assignments.java;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

public class Assignment5 {

	public static void main(String[] args) 
	{
    //METHOD 1
        
        ArrayList<String> VariableOne = new ArrayList<String>();
        
        VariableOne.add("India");
        VariableOne.add("China");
        VariableOne.add("United States");
        VariableOne.add("Indonesia");
        VariableOne.add("Pakisthan");
        
        System.out.println(VariableOne.get(1));
        
        //METHOD 2
        
        HashSet<String> VariableTwo = new HashSet<String>();
        
         VariableTwo.add("Effiel Tower");
         VariableTwo.add("Great Wall of China");
         VariableTwo.add("Acropolis of Athens");
         VariableTwo.add("New York");
         VariableTwo.add("Colosseum");
         VariableTwo.add("Dubai");
         VariableTwo.add("London");
         VariableTwo.add("Louvre Museum");
         VariableTwo.add("Taj Mahal");
         VariableTwo.add("Angkor Wat");
         
         System.out.println(VariableTwo.size());
         
          //METHOD 3
          
          HashMap<String,Integer> VariableThree = new HashMap<String,Integer>();
          
          VariableThree.put("New York",8335897);
          VariableThree.put("California",3822238);
          VariableThree.put("Illinois",2665039);
          VariableThree.put("Texas",2302878);
          VariableThree.put("Arizona",1644409);
          
        //METHOD 4
        
        int [] RandomNumbers = {5,7,9,11,13,15,17,19,21,23};
        System.out.println(RandomNumbers[1] +  RandomNumbers[4]) ;
        
        //METHOD 5
          
        ArrayList<String> VariableFour = new ArrayList<String>();
        
        VariableOne.add("Avatar");
        VariableOne.add("AvengersEndgame");
        VariableOne.add("Avatar The Way of Water");
        VariableOne.add("Titanic");
        VariableOne.add("Star Wars: Episode VII - The Force Awaken");
        System.out.println(VariableOne.get(2));
		
	}

}
