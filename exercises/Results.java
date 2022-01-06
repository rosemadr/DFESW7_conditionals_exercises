package conditionals.exercises;

//A person takes 3 exams in college, Physics, Chemistry, and Biology, each exam has a maximum of 150 marks. 
//When all the exam marks have been added together, we can find the overall percentage that
//the person has got by multiplying their score by 100 and then dividing by 450.
//
//Create the results class, this class has 5 variables, Physics, Chemistry, and Biology, total and percentage. 
//This class should also have 2 methods:
//    Method 1 - displays the results that the person got for each exam and then the total mark. 
//Try to make the output neat and bespoke for each exam.
//    Method 2 - which finds and displays the percentage that the person received for the exams overall.

//Expand the Results class so that there is now a pass mark of 60%; 
// if the person receives under 60% they get a fail message.

public class Results {
	
	int Physics = 99;
	int Chemistry = 40;
	int Biology = 130;
	int total;
	int percentage;
	
	public void SubjectMarks() {
		
		total = Physics + Chemistry + Biology;
		
		System.out.println("Subject Marks\nPHYSICS: " + Physics + "\nCHEMISTRY: " + Chemistry +  "\nBIOLOGY: " + Biology + "\nTOTAL: " + total);
	}
	
	public void OverallPercentage() {
		
		SubjectMarks();
		
		percentage = total * 100 / 450;
		
		System.out.println("Overall percentage is " + percentage + "%");
		
		if (percentage < 60) {
			System.out.println("Unfortunately you did not achieve 60%, that is a FAIL.");		}
	}
	
	

}
