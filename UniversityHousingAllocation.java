import java.util.Scanner;

public class UniversityHousingAllocation {
    public static void main(String[] args){
        // FACTORS:
        // Distance from campus         
        // __ miles/hours away          : +__ pt(s)
        // __ miles/hours away          : +__ pt(s)
        // ...
        // on-campus job                 
        // yes                          : +1 pt(s)
        // no                           : +0 pt(s)
        // financial need                
        //
        //
        // disabilities                  
        // yes                          : +3 pt(s)
        // no                           : +0 pt(s)
        //
        // first-come first-serve     
        // day 1-10                     : +5 pt(s)
        // day 11-20                    : +4 pt(s)
        // day 21-30                    : +3 pt(s)
        // day 31-60                    : +2 pt(s)
        // day 61-90                    : +1 pt(s)
        // day 91+                      : +0 pt(s)
        //
        // grade      
        // Freshman                     : +4 pt(s)
        // Sophomore                    : +3 pt(s)
        // Junior                       : +2 pt(s)
        // Senior                       : +1 pt(s)               
        //
        //
        // previously lived on campus   
        //
        //
        // student parent               
        //
        //
        // high achieving student       
        //
        //

        // Scanner for testing... (not really needed??)
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        // add variables as needed e.g. grade level, distance from campus in miles, disabilities, etc.
        // *note that strings could be difficult for conditionals (since we can't really control what the user will input
        // so it might be better to use something like a boolean for disabilities 

        // used to determine how much housing priority the student has
        int score = 0;

        if("something".equals("something")){ // change to conditional fitting to the category
            score += 1; // replace with number of points
        }

        if("temp".equals("temp")){ // ditto
            score += 5; // ditto
        }

        // add more if statements here
        // *note mostly going to be if-statements since we want to check for each individual aspect and not else if

        sc.close();

        System.out.println("You have " + score + " points.");
    }
}