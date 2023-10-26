import java.util.Scanner;

public class UniversityHousingAllocation {
    public static void main(String[] args) {
        // FACTORS:
        //
        // Distance from campus
        // 50+ miles away : +10 pt(s)
        // 40-49 miles away : +8 pt(s)
        // 30-49 miles away : +5 pt(s)
        // 20-49 miles away : +2 pt(s)
        // 0-19 miles away : +1 pt(s)
        //
        // on-campus job
        // yes : +1 pt(s)
        // no : +0 pt(s)
        //
        // financial need
        // yes : +6 pts(s)
        // no : +0 pts(s)
        //
        // disabilities
        // yes : +3 pt(s)
        // no : +0 pt(s)
        //
        // first-come first-serve
        // day 1-10 : +8 pt(s)
        // day 11-20 : +5 pt(s)
        // day 21-30 : +3 pt(s)
        // day 31-60 : +2 pt(s)
        // day 61-90 : +1 pt(s)
        // day 91+ : +0 pt(s)
        //
        // grade
        // Freshman (1) : +2 pt(s)
        // Sophomore (2) : +2 pt(s)
        // Junior (3) : +1 pt(s)
        // Senior (4) : +1 pt(s)
        // Senior+ (4+) : +0 pt(s)
        //
        // previously lived on campus
        // yes (4 years) : +2 pt(s)
        // yes (3 years) : +2 pt(s)
        // yes (2 years) : +1 pt(s)
        // yes (1 years) : +1 pt(s)
        // no : +0 pt(s)
        //
        // student parent
        // more than 1 child : +2 pt(s)
        // 1 child : +1 pt(s)
        // no : +0 pt(s)
        //
        // high achieving student
        // Above 3.5 GPA : +2 pt(s)
        // 3.0 - 3.5 GPA : +1 pt(s)
        // lower than 3 : +0 pt(s)
        //

        // Scanner for testing... (not really needed??)
        Scanner sc = new Scanner(System.in);

        System.out.print("How far are you from campus? Enter in miles: "); // Prompts user an integer value for distanceFromCampusInMiles
        int distanceFromCampusInMiles = sc.nextInt();
        System.out.println(); // Creates new line to ask next question
        while (distanceFromCampusInMiles <= 0) { // Catches user input that is below 0 miles
            System.out.print("Invalid input. How far are you from campus? Enter in miles: "); // Prompts user an integer value for distanceFromCampusInMiles
            distanceFromCampusInMiles = sc.nextInt();
            System.out.println(); // Creates new line to ask next question
        }

        System.out.print("Do you have a job on campus? Enter \"true\" or \"false\": "); // Prompts user "true" or "false" for haveOnCampusJob
        boolean haveOnCampusJob = sc.nextBoolean();
        System.out.println(); // Creates new line to ask next question

        System.out.print("Do you have any financial need? Enter \"true\" or \"false\": "); // Prompts user "true" or "false" for haveFinancialNeed
        boolean haveFinancialNeed = sc.nextBoolean();
        System.out.println(); // Creates new line to ask next question

        System.out.print("Do you have any disabilities? Enter \"true\" or \"false\": "); // Prompts user "true" or "false" for haveDisabilities
        boolean haveDisabilities = sc.nextBoolean();
        System.out.println(); // Creates new line to ask next question

        System.out.print("Enter days since the release of this form (First Come First Serve policy): "); // Prompts user an integer value for firstComeFirstServe
        int firstComeFirstServe = sc.nextInt();
        System.out.println(); // Creates new line to ask next question
        while (firstComeFirstServe < 0) { // Catches user input that is below 0 days
            System.out.print("Invalid input. Enter days since the release of this form (First Come First Serve policy): "); // Prompts user an integer value for firstComeFirstServe
            firstComeFirstServe = sc.nextInt();
            System.out.println(); // Creates new line to ask next question
        }


        System.out.print("Enter grade level (Freshman = 1, Sophomore = 2, Junior = 3, Senior = 4): "); // Prompts user an integer value for gradeLevel
        int gradeLevel = sc.nextInt();
        System.out.println(); // Creates new line to ask next question
        while (gradeLevel < 1) { // Catches user input that is below 1
            System.out.print("Invalid input. Enter grade level (Freshman = 1, Sophomore = 2, Junior = 3, Senior = 4, Senior+ = 5+): "); // Prompts user an integer value for gradeLevel
            gradeLevel = sc.nextInt();
            System.out.println(); // Creates new line to ask next question
        }

        System.out.print("Enter number of years that you have lived on campus before: "); // Prompts user an integer value for yearsLivedOnCampus
        int yearsLivedOnCampus = sc.nextInt();
        System.out.println(); // Creates new line to ask next question
        while (yearsLivedOnCampus < 0) { // Catches user input that is below 0
            System.out.print("Invalid input. Enter number of years that you have lived on campus before: "); // Prompts user an integer value for yearsLivedOnCampus
            yearsLivedOnCampus = sc.nextInt();
            System.out.println(); // Creates new line to ask next question
        }

        System.out.print("Enter number of children: "); // Prompts user an integer value for numberOfChildren
        int numberOfChildren = sc.nextInt();
        System.out.println(); // Creates new line to ask next question
        while (numberOfChildren < 0) { // Catches user input that is below 0
            System.out.print("Invalid input. Enter number of children: "); // Prompts user an integer value for numberOfChildren
            numberOfChildren = sc.nextInt();
            System.out.println(); // Creates new line to ask next question
        }

        System.out.print("Enter Unweighted GPA (Highschool GPA if Freshman): "); // Prompts user a double value for studentGPA
        double studentGPA = sc.nextDouble();
        System.out.println(); // Creates new line for correct formatting
        while (studentGPA < 0.0 || studentGPA > 4.0) { // Catches user input that is below 0.0 or above 4.0
            System.out.print("Invalid input. Enter Unweighted GPA (Highschool GPA if Freshman): "); // Prompts user an integer value for studentGPA
            studentGPA = sc.nextDouble();
            System.out.println(); // Creates new line to ask next question
        }

        int score = calculateHousingScore(distanceFromCampusInMiles, haveOnCampusJob, haveFinancialNeed,
                haveDisabilities, firstComeFirstServe, gradeLevel, yearsLivedOnCampus, numberOfChildren, studentGPA);
        // Initialize an integer "score" and set it equal to the method below with all of the user's inputs
        sc.close();
        // Closes the scanner
        System.out.println("You have " + score + " points.");

        if (score > 0 && score <= 12) {
            System.out.println("You have low priority."); // Prints low priority if student has score below 12
        } else if (score >= 13 && score <= 24){
            System.out.println("You have middle priority."); // Prints middle priority if student has score from 13 to 24
        } else {
            System.out.println("You have high priority."); // Prints highest priority if student has score from 25 to 36 (The highest possible score)
        }
        
        // Prints new line for the amount of points the user has
    }
    
    /**
      calculateHousingScore method
      @param 9 inputs given by user including integers, booleans, and a double
      @return The total housing score of user 
		        stored in the argument integer.
     */

    public static int calculateHousingScore(int distanceFromCampusInMiles, boolean haveOnCampusJob,
            boolean haveFinancialNeed, boolean haveDisabilities, int firstComeFirstServe, int gradeLevel,
            int yearsLivedOnCampus, int numberOfChildren, double studentGPA) {
        
        // Initialize score 
        int score = 0;  

        // conditionals to check how many points to add to score based off of student's distance from campus (in miles)
        if (distanceFromCampusInMiles > 50) {
            score += 10;
        } else if (distanceFromCampusInMiles > 40) {
            score += 8;
        } else if (distanceFromCampusInMiles > 30) {
            score += 5;
        } else if (distanceFromCampusInMiles > 20) {
            score += 2;
        } else {
            score += 1;
        }

        // check if student is working on campus
        if (haveOnCampusJob) {
            score += 1;
        }

        // check if the student has financial need
        if (haveFinancialNeed) {
            score += 6;
        }

        // takes the next interger value of user input and sets it to
        // "yearsLivedOnCampus"
        if (yearsLivedOnCampus == 3 || yearsLivedOnCampus == 4) {
            score += 2;
            // if the user has lived on campus for 3 or 4 years, the score will go up by 2
        } else if (yearsLivedOnCampus == 2 || yearsLivedOnCampus == 1) {
            score += 1;
            // if the user has lived on campus for 2 or 1 years, the score will go up by 1
        }

        // takes the next interger value of user input and sets it to "numberOfChildren"
        if (numberOfChildren > 1) {
            score += 2;
            // if the user has more than 1 child, the score will go up by 2
        } else if (numberOfChildren == 1) {
            score += 1;
            // if the user has one child, the score will go up by 1
        }

        // takes the next float value of user input and sets it to "studentGPA"
        if (studentGPA > 3.5) {
            score += 2;
            // if the user has a GPA larger than 3.5, the score will go up by 2
        } else if (studentGPA > 3) {
            score += 1;
            // if the user has a GPA larger than 3, but below 3.5, the score will go up by 1
        }

        // adds points if user has disability with user input
        if (haveDisabilities) {
            score += 3;
            // if haveDisabilities = true (user has a disability), add 3 to score.
        }
        
        // adds points based on how early the student form was filled out (User input is based on firstComeFirstServe)
        if (firstComeFirstServe >= 1 && firstComeFirstServe <= 10) {
            score += 8;
            // Add 8 points if the user filled out the form within the first 10 days
        } else if (firstComeFirstServe >= 11 && firstComeFirstServe <= 20) {
            score += 5;
            // Add 5 points if the user filled out the form within the first 20 days
        } else if (firstComeFirstServe >= 21 && firstComeFirstServe <= 30) {
            score += 3;
            // Add 3 points if the user filled out the form within the first month
        } else if (firstComeFirstServe >= 31 && firstComeFirstServe <= 60) {
            score += 2;
            // Add 2 points if the user filled out the form within the firsst 2 months
        } else if (firstComeFirstServe >= 61 && firstComeFirstServe <= 90) {
            score += 1;
            // Add 1 point if the user filled out the form within the first 3 months. Anything more does not get any points.
        }

        if (gradeLevel == 1 || gradeLevel == 2) {
            score += 2;
            // if user is a Freshman or a Sophomore, add 2 to score.
        } else if (gradeLevel == 3 || gradeLevel == 4) { 
            score += 1;
            // if user is Junior or Senior, add 1 to score.
        }
        
        
        return score;
    }
}