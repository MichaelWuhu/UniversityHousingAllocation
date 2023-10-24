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

        System.out.print("How far are you from campus? Enter in miles: "); // Prompts user an integer value for
                                                                           // distanceFromCampusInMiles
        int distanceFromCampusInMiles = sc.nextInt();
        System.out.println(); // Creates new line to ask next question

        System.out.print("Do you have a job on campus? Enter \"true\" or \"false\": "); // Prompts user "true" or
                                                                                        // "false" for haveOnCampusJob
        boolean haveOnCampusJob = sc.nextBoolean();
        System.out.println(); // Creates new line to ask next question

        System.out.print("Do you have any financial need? Enter \"true\" or \"false\": "); // Prompts user "true" or
                                                                                           // "false" for
                                                                                           // haveFinancialNeed
        boolean haveFinancialNeed = sc.nextBoolean();
        System.out.println(); // Creates new line to ask next question

        System.out.print("Do you have any disabilities? Enter \"true\" or \"false\": "); // Prompts user "true" or
                                                                                         // "false" for haveDisabilities
        boolean haveDisabilities = sc.nextBoolean();
        System.out.println(); // Creates new line to ask next question

        System.out.print("Enter days since the release of this form (First Come First Serve policy): "); // Prompts user
                                                                                                         // an integer
                                                                                                         // value for
                                                                                                         // firstComeFirstServe
        int firstComeFirstServe = sc.nextInt();
        System.out.println(); // Creates new line to ask next question

        System.out.print("Enter grade level (Freshman = 1, Sophomore = 2, Junior = 3, Senior = 4): "); // Prompts user
                                                                                                       // an integer
                                                                                                       // value for
                                                                                                       // gradeLevel
        int gradeLevel = sc.nextInt();
        System.out.println(); // Creates new line to ask next question

        System.out.print("Enter number of years that you have lived on campus before: "); // Prompts user an integer
                                                                                          // value for
                                                                                          // yearsLivedOnCampus
        int yearsLivedOnCampus = sc.nextInt();
        System.out.println(); // Creates new line to ask next question

        System.out.print("Enter number of children: "); // Prompts user an integer value for numberOfChildren
        int numberOfChildren = sc.nextInt();
        System.out.println(); // Creates new line to ask next question

        System.out.print("Enter GPA (Highschool GPA if Freshman): "); // Prompts user a double value for studentGPA
        double studentGPA = sc.nextDouble();
        System.out.println(); // Creates new line for correct formatting

        int score = calculateHousingScore(distanceFromCampusInMiles, haveOnCampusJob, haveFinancialNeed,
                haveDisabilities, firstComeFirstServe, gradeLevel, yearsLivedOnCampus, numberOfChildren, studentGPA);

        sc.close();

        System.out.println("You have " + score + " points.");
    }

    public static int calculateHousingScore(int distanceFromCampusInMiles, boolean haveOnCampusJob,
            boolean haveFinancialNeed, boolean haveDisabilities, int firstComeFirstServe, int gradeLevel,
            int yearsLivedOnCampus, int numberOfChildren, double studentGPA) {

        int score = 0;

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

        if (haveOnCampusJob) {
            score += 1;
        }

        if (haveFinancialNeed) {
            score += 6;
        }

        // takes the next interger value of user input and sets it to
        // "yearsLivedOnCAmous"
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

        return score;
    }
}