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
        //
        //
        // first-come first-serve       
        // 
        //
        // grade                        
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