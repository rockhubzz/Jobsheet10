import java.util.Scanner;
public class BioskopWithScanner24b{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int baris, kolom;
        String nama, next;
        int menuInput;
        String[][] penonton= new String[5][2];
        boolean tersedia= false;

        penonton[0][0] = "Amin";
        penonton[0][1] = "Benia";
        penonton[1][0] = "Candra";
        penonton[1][1] = "Dela";
        penonton[2][0] = "Eka";
        penonton[2][1] = "Farhan";
        penonton[3][0] = "Gisel";
        penonton[3][1] = "Hana";


        while(true){
            System.out.println("\nMenu: ");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan data penonton");
            System.out.println("3. Exit");
            System.out.print("Masukkan pilihan anda: ");
            menuInput= sc.nextInt();

            switch(menuInput){
                case 1:
                for(int i= 0; i<penonton.length; i++){
                    for(int j=0; j<penonton[i].length; j++){
                    if(penonton[i][j]=="***"){
                        penonton[i][j]= null;
                    }
                }
            }
                while(true){
                    tersedia = false;
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] == null) {
                                tersedia = true;
                                break;
                            }
                        }
                    }
                    if(tersedia){
                    System.out.print("Masukkan nama: ");
                    nama= sc.next();
                    sc.nextLine();
                    System.out.print("Masukkan baris: ");
                    baris= sc.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom= sc.nextInt();
                    if(penonton[baris-1][kolom-1]!=null){
                        System.out.println("Baris "+(baris)+" kolom "+(kolom)+" tidak tersedia.");
                        continue;
                    }
                        penonton[baris-1][kolom-1] = nama;
                        System.out.print("Input penonton lainnya? (y/n): ");
                        next= sc.next();

                        if(next.equalsIgnoreCase("y")){
                            continue;
                        } else if(next.equalsIgnoreCase("n")){
                             break;
                        }
                    } else{
                        System.out.println("Maaf, semua kursi telah dipesan.");
                        break;
                    }

                    break;
                }
                break;

                case 2:
                for(int i= 0; i<penonton.length; i++){
                    for(int j=0; j<penonton[i].length; j++){
                    if(penonton[i][j]==null){
                        penonton[i][j]= "***";
                    }
                }
                    System.out.println("Penonton baris ke-"+(i+1)+": "+String.join(", ",penonton[i]));
                }
                System.out.print("Tekan 0 untuk kembali: ");
                int kbl= sc.nextInt();
                if(kbl==0) break;
                break;

                case 3:
                System.exit(0);
            }
        }
    }
} 