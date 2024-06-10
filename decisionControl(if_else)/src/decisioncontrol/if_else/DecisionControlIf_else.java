package decisioncontrol.if_else;
public class DecisionControlIf_else {
    public static void main(String[] args) {
//statement if
        int nilai1 = 3;
        int nilai2 = 4;
        int nilai3 = 5;

        float rata_rata = (nilai1+nilai2+nilai3)/3;
        if (rata_rata<5){
            System.out.println("tidak lulus");
        }
            System.out.println("nilai = "+rata_rata);
            System.out.println("");
//statement if else
        int i =7;
            System.out.println("bilangan = "+i);
        if(i%2==0){
            System.out.println("bilangan genap");
        }else{
            System.out.println("bilangan ganjil");
        }
            System.out.println("");
//statement if else if
        int nilai4 = 6;
        int nilai5 = 5;
        int nilai6 = 4;

        float rata_rata2 = (float)(nilai4+nilai5+nilai6)/3;
        if (rata_rata2<5){
            System.out.println("tidak lulus");
        }else if((rata_rata2 >= 5 && rata_rata2 < 6)){
            System.out.println("harus ikut remidi");
        }else{
            System.out.println("lulus");   
        }
        System.out.println("nilai = "+rata_rata2);
        System.out.println("");
//nested if
        int grade = 68;
            if(grade>=90){
                System.out.println("A");
            }else if(grade<90&&grade>=80){
                System.out.println("B");
            }else if(grade<80&&grade>=70){
                System.out.println("C");
            }else if(grade<70&&grade>=60){
                System.out.println("D");
            }else if(grade<60&&grade>=50){
                System.out.println("E");
            }else{
                System.out.println("sorry you failed");
            }
        System.out.println("grade = "+grade);       
        System.out.println("");
//stetement switch case
        int kelas = 90;
        switch(kelas){
            case 100 : 
                System.out.println("Excellent");
                break;
            case 90 : 
                System.out.println("good job");
                break;
            case 80 : 
                System.out.println("study harder");
                break;
            default :
                System.out.println("sorry you failed");
        }
        System.out.println("kelas="+kelas);
    }
    
}
