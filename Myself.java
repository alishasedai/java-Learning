public class Myself {
    public static void main(String[] args) {
        Student student = new Student(); // this is an object
        student.id = 21;
        student.microprocessorMarks = 45;
        student.cProgramming = 45;
        student.mathIIMarks = 35;
        student.englishMarks = 34;
        
        // student.sum(); // this is a function and method
        // student.percentage();
        // student.average();

        Student student2 = new Student();
        student2.id = 1;
        student2.microprocessorMarks = 45;
        student2.cProgramming = 55;
        student2.mathIIMarks = 55;
        student2.englishMarks = 34;


        

        int student1Avg = student.average();
        int student2Avg = student2.average();

        if(student1Avg > student2Avg){
            System.out.println("Student 1 Average is greater than student2 Average");
        }

        else{
            
                System.out.println("Student 2 Average is greater than student1 Average");
            
        }
    }
}