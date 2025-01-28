package bharath.assignments.java;

//Method One 

class ThreeDimensionalArray 
{
    public static void main(String[] args) 
    {
        String[][][] Semester = new String[5][2][6]; 
        
        //SEM 1
        //Subject 1 and it's mark
        Semester[0][0][0] = "Mathematcis1";
        Semester[0][1][0] = "78";
        
        //Subject 2 and it's mark
        Semester[0][0][1] = "Physics";
        Semester[0][1][1] = "85";
        
        //Subject 3 and it's mark
        Semester[0][0][2] = "Chemistry";
        Semester[0][1][2] = "91";
        
        //Subject 4 and it's mark
        Semester[0][0][3] = "Computer Programming";
        Semester[0][1][3] = "74";
        
        //Subject 5 and it's mark
        Semester[0][0][4] = "Engineering Drawing";
        Semester[0][1][4] = "88";
        
        //Subject 6 and it's mark
        Semester[0][0][5] = "Basic Electrical Engineering";
        Semester[0][1][5] = "79";
        
        //SEM 2
        //Subject 1 and it's mark
        Semester[1][0][0] = "Mathematcis II";
        Semester[1][1][0] = "82";
        
        //Subject 2 and it's mark
        Semester[1][0][1] = "Mechanics";
        Semester[1][1][1] = "77";
        
        //Subject 3 and it's mark
        Semester[1][0][2] = "Enviroinmental SCI";
        Semester[1][1][2] = "93";
        
        //Subject 4 and it's mark
        Semester[1][0][3] = "Basic Electronics";
        Semester[1][1][3] = "69";
        
        //Subject 5 and it's mark
        Semester[1][0][4] = "Engineering Physics";
        Semester[1][1][4] = "84";
        
        //Subject 6 and it's mark
        Semester[1][0][5] = "Engineering Graphics";
        Semester[1][1][5] = "90";
        
        //SEM 3
        //Subject 1 and it's mark
        Semester[2][0][0] = "Data Structures";
        Semester[2][1][0] = "88";
        
        //Subject 2 and it's mark
        Semester[2][0][1] = "Discreate Mathematics";
        Semester[2][1][1] = "81";
        
        //Subject 3 and it's mark
        Semester[2][0][2] = "Digital Electronics";
        Semester[2][1][2] = "76";
        
        //Subject 4 and it's mark
        Semester[2][0][3] = "Operating Systems";
        Semester[2][1][3] = "92";
        
        //Subject 5 and it's mark
        Semester[2][0][4] = "Signals and Systems";
        Semester[2][1][4] = "85";
        
        //Subject 6 and it's mark
        Semester[2][0][5] = "Object Oriented Programming";
        Semester[2][1][5] = "78";
        
        //SEM 4
        //Subject 1 and it's mark
        Semester[3][0][0] = "Alogrithms";
        Semester[3][1][0] = "91";
        
        //Subject 2 and it's mark
        Semester[3][0][1] = "Computer Networks";
        Semester[3][1][1] = "73";
        
        //Subject 3 and it's mark
        Semester[3][0][2] = "Database Systems";
        Semester[3][1][2] = "89";
        
        //Subject 4 and it's mark
        Semester[3][0][3] = "Micro Processors";
        Semester[3][1][3] = "80";
        
        //Subject 5 and it's mark
        Semester[3][0][4] = "Communication Engineering";
        Semester[3][1][4] = "76";
        
        //Subject 6 and it's mark
        Semester[3][0][5] = "Software Engineering";
        Semester[3][1][5] = "87";
        
        //SEM 5
        //Subject 1 and it's mark
        Semester[4][0][0] = "Probability & Stats";
        Semester[4][1][0] = "86";
        
        //Subject 2 and it's mark
        Semester[4][0][1] = "Machiene learning";
        Semester[4][1][1] = "88";
        
        //Subject 3 and it's mark
        Semester[4][0][2] = "Comipler Design";
        Semester[4][1][2] = "84";
        
        //Subject 4 and it's mark
        Semester[4][0][3] = "Theory of Computation";
        Semester[4][1][3] = "95";
        
        //Subject 5 and it's mark
        Semester[4][0][4] = "Embedded Systems";
        Semester[4][1][4] = "73";
        
        //Subject 6 and it's mark
        Semester[4][0][5] = "Computer Graphics";
        Semester[4][1][5] = "90";
        
     	 //Print Semester 3 - Subject 4 and Subject 5 Names.
   	 
   	 	System.out.println(Semester[2][0][4]);
        System.out.println(Semester[2][1][4]); 
        
        //Print Semester 5 - Subject 3 and Subject 6 marks
        
         System.out.println(Semester[4][0][2]);
         System.out.println(Semester[4][1][5]); 
        
    }
    
    /* METHOD TWO */
    /* public static void main(String[] args) 
    {
    	 String[][][] Semester = 
    	 {
    	 	{
    	 		{"Mathematcis I","Physics","Chemistry","Computer Programming","Engineering Drawing","Basic Electrical Engineering"},
    	 		{"78","85", "91" ,"74" ,"88" ,"79"}
    	 	},
    	 	{
    	 		{""Mathematcis II","Mechanics","Enviroinmental SCI","Basic Electronics","Engineering Physics","Engineering Graphics"},
    	 		{"82","77", "93" ,"69" ,"84" ,"90"}
    	 	},
    	 	{
    	 		{"Data Structures","Discreate Mathematics","Digital Electronic","Operating Systems","Signals and Systems","Object Oriented Programming"},
    	 		{"88","91","76","92","85"78}
    	 	},
    	 	{
    	 		{"Alogrithms","Computer Networks","Database Systems","Micro Processors","Communication Engineering","Software Engineering"},
    	 		{"91","73","89","80","76","87"}
    	 	},
    	 	{
    	 		{"Probability & Stats","Machiene learning","Comipler Design","Theory of Computation","Embedded Systems","Computer Graphics"},
    	 		{"86","88","84","95","73","90"}
    	 	}
    	 };
    	 
    	 //Print Semester 3 - Subject 4 and Subject 5 Names.
    	 
    	 System.out.println(Semester[2][0][4]);
         System.out.println(Semester[2][1][4]); 
         
         //Print Semester 5 - Subject 3 and Subject 6 marks
         
          System.out.println(Semester[4][0][2]);
          System.out.println(Semester[4][1][5]); 
    }
     */
}