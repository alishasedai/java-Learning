public class Student {
    int id;
    int microprocessorMarks;
    int mathIIMarks;
    int englishMarks;
    int cProgramming;
    int totalMatrks = 400;

    public int sum(){
        int sum = microprocessorMarks + mathIIMarks + englishMarks + cProgramming;
        // System.out.println("Sum of marks is "+sum);
        return sum;
    }

    public int average(){
        int mySums = sum();
        int average = mySums/4;
        // System.out.println("average is "+average);
        return average;
    }

    public void percentage(){
        int mySum = sum();
        int percentage = (mySum*100)/ totalMatrks;
        // System.out.println("The percentage is: "+percentage);
    }
}
