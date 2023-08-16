import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentRound {
    
    public static List<Integer> gradingStudents(List<Integer> grades) {
    // Write your code here
        List<Integer> rounded_grades = new ArrayList<>();
        for (Integer grade : grades) {
            if(grade >= 38)
            {
                if(grade % 10 == 4 || grade % 10 == 9)
                {
                    grade++;
                }
                
                if(grade % 10 == 3 || grade % 10 == 8)
                {
                    grade += 2;                    
                }

                rounded_grades.add(grade);
            }else
            {
                rounded_grades.add(grade);
            }
        }
        return rounded_grades;
    }
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(73);
        numbers.add(67);
        numbers.add(38);
        numbers.add(33);

        List<Integer> rounded = gradingStudents(numbers);
        System.out.println(rounded);
    }
}
