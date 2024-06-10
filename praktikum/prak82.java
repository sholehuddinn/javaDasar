package praktikum;
import java.util.Scanner;

public class prak82{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlah = in.nextInt();
        System.out.println("");

        double[][] bmi = new double [jumlah][4];  //[berat], [tinggi], [BMI]
        String[][] status = new String [jumlah][3]; //[nama], [status]

        for(int i = 0; i < jumlah; i++){
            in = new Scanner(System.in);
            System.out.print("Nama\t: ");
                status[i][0] = in.nextLine();
            System.out.print("Berat\t: ");
                bmi[i][0] = in.nextDouble();
            System.out.print("Tinggi\t: ");
                bmi[i][1] = in.nextDouble();
            System.out.println();
        }

        for(int j = 0; j < jumlah; j++){
            bmi[j][2] = bmi[j][0] / Math.pow(bmi[j][1] / 100, 2);

            if (bmi[j][2] >= 30.0) {
                status[j][1] = "Kegemukan / obesitas";
            }else if (bmi[j][2] < 30.0 && bmi[j][2] >= 25.0) {
                status[j][1] = "Kelebihan Berat Badan";
            }else if (bmi[j][2] < 25.0 && bmi[j][2] >= 18.5) {
                status[j][1] = "Normmal / Ideal";
            }else {
                status[j][1] = "kekurangan Berat Badan";
            }
        }
        
        System.out.println("");

        for(int k = 0; k < jumlah; k++){
            System.out.println("Nama Mahasiswa\t : " + status[k][0]);
            System.out.println("Berat Mahasiswa\t : " + bmi[k][0]);
            System.out.println("Tinggi Mahasiswa : " + bmi[k][1] / 100);
            System.out.println("BMI\t\t : " + bmi[k][2]);
            System.out.println("Status\t\t : " + status[k][1]);
            System.out.println("");
        }
    }
}