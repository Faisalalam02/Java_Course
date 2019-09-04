package chapter12;

import java.util.Map;

public class FinalGrades {


    public static void main (String args[])
    {
        Map<String , Integer> originalGrades = TestResults.getOriginalGrades();
        Map<String , Integer> makeUpGrades = TestResults.getMakeUpGrades();

        for(var grades: makeUpGrades.entrySet())
        {
            Integer firstGrade = originalGrades.get(grades.getKey());
            Integer secondGrade = makeUpGrades.get(grades.getKey());

            if(secondGrade > firstGrade)
            {
                originalGrades.put(grades.getKey() , secondGrade);
            }
        }
        System.out.println("Final grades are: ");
        originalGrades.forEach((k,v) -> System.out.println("Student: "+ k + " Grades: "+ v));





    }

}
