package operatorlogika5;
public class OperatorLogika5 {
    public static void main(String[] args) {
        // operator kodisi (?:)
        
        String status = "";
        int grade = 80;
            status = (grade >= 60)?"Passed":"Fail";
                System.out.println(status);
        
        String status2 = "";
        int grade2 = 80;
            status = (grade2 >= 60)?"Passed":"Fail";
                System.out.println(status2);
    
        int score = 0;
        char answer = 'A';
        score = (answer=='A')? 10 : 0;
        System.out.println("score = " + score);
    }
    

}
