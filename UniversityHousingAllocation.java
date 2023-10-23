import java.util.Scanner;

public class UniversityHousingAllocation {
    public static void main(String[] args){
        // FACTORS:
        // Distance from campus         
        // 50+ miles away               : +8 pt(s)
        // 40-49 miles away             : +5 pt(s)
        // 30-49 miles away             : +3 pt(s)
        // 20-49 miles away             : +2 pt(s)
        // 0-19 miles away              : +1 pt(s)
        // on-campus job                 
        // yes                          : +3 pt(s)
        // no                           : +0 pt(s)
        // financial need                
        // yes                          : +5 pts(s)
        // no                           : +0 pts(s)
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
        // yes (4 years)                : +4 pt(s)
        // yes (3 years)                : +3 pt(s)
        // yes (2 years)                : +2 pt(s)
        // yes (1 years)                : +1 pt(s)
        // no                           : +0 pt(s)
        //
        // student parent
        // more than 1 child            : +5 pt(s)
        // 1 child                      : +3 pt(s)
        // no                           : +0 pt(s)
        //
        // high achieving student       
        // 3.5 - 4 GPA                  : +4 pt(s)
        // 3.0 - 3.5 GPA                : +2 pt(s)
        // lower than 3                 : +0 pt(s)

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