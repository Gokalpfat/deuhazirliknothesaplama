
import java.text.DecimalFormat;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
          
        System.out.println("DOKUZ EYLÜL ÜNİVERSİTESİ\n"
                + "YABANCI DİLLER YÜKSEKOKULU\n"
                + "HAZIRLIK SINIFI NOT HESAPLAMA PROGRAMINA HOŞGELDİNİZ!");
        System.out.println("***************************************************");
double Gvize1;
double Gvize2;
double Gquiz1;
double Gquiz2;
double Gquiz3;
double Gsunum;
double Gport;
double Gkanaat;
double Gonline;

System.out.println("---------------------------------------------------");
        System.out.print("Güz Dönemi '1. Vize' notunuzu giriniz: ");
            Gvize1 = scanner.nextDouble();
        System.out.print("Güz Dönemi '2. Vize' notunuzu giriniz: ");
            Gvize2 = scanner.nextDouble();
        System.out.print("Güz Dönemi '1. Quiz' notunuzu giriniz: ");
            Gquiz1 = scanner.nextDouble();
        System.out.print("Güz Dönemi '2. Quiz' notunuzu giriniz: ");
            Gquiz2 = scanner.nextDouble();
        System.out.print("Güz Dönemi '3. Quiz' notunuzu giriniz: ");
            Gquiz3 = scanner.nextDouble();
        System.out.print("Güz Dönemi 'Sunum' notunuzu giriniz: ");
            Gsunum = scanner.nextDouble();
        System.out.print("Güz Dönemi 'Portfolyo' notunuzu giriniz: ");
            Gport = scanner.nextDouble();
        System.out.print("Güz Dönemi 'Kanaat' notunuzu giriniz: ");
            Gkanaat = scanner.nextDouble();
        System.out.print("Güz Dönemi 'Online Ödev' notunuzu giriniz: ");
            Gonline = scanner.nextDouble();
            
double GVizeORT = (((Gvize1+Gvize2)/2)*60)/100;
double GQuizORT = (((Gquiz1+Gquiz2+Gquiz3)/3)*20)/100;
double GkntO = (Gkanaat*5)/100;
double GprtO = (Gport*5)/100;
double GsnmO = (Gsunum*5)/100;
double GonlO = (Gonline*5)/100;
double Gort = GVizeORT + GQuizORT + GkntO + GsnmO + GonlO + GprtO;

System.out.println("---------------------------------------------------");
System.out.println("***************************************************");   
        System.out.println("Güz Dönemi Ortalamanız: "+ new DecimalFormat("##.##").format(Gort));
System.out.println("***************************************************");        
        
        
double Bvize1;
double Bvize2;
double Bquiz1;
double Bquiz2;
double Bquiz3;
double Bsunum;
double Bport;
double Bkanaat;
double Bonline;

System.out.println("---------------------------------------------------");
        System.out.print("Bahar Dönemi '1. Vize' notunuzu giriniz: ");
            Bvize1 = scanner.nextDouble();
        System.out.print("Bahar Dönemi '2. Vize' notunuzu giriniz: ");
            Bvize2 = scanner.nextDouble();
        System.out.print("Bahar Dönemi '1. Quiz' notunuzu giriniz: ");
            Bquiz1 = scanner.nextDouble();
        System.out.print("Bahar Dönemi '2. Quiz' notunuzu giriniz: ");
            Bquiz2 = scanner.nextDouble();
        System.out.print("Bahar Dönemi '3. Quiz' notunuzu giriniz: ");
            Bquiz3 = scanner.nextDouble();
        System.out.print("Bahar Dönemi 'Sunum' notunuzu giriniz: ");
            Bsunum = scanner.nextDouble();
        System.out.print("Bahar Dönemi 'Portfolyo' notunuzu giriniz: ");
            Bport = scanner.nextDouble();
        System.out.print("Bahar Dönemi 'Kanaat' notunuzu giriniz: ");
            Bkanaat = scanner.nextDouble();
        System.out.print("Bahar Dönemi 'Online Ödev' notunuzu giriniz: ");
            Bonline = scanner.nextDouble();
            
double BVizeORT = (((Bvize1+Bvize2)/2)*60)/100;
double BQuizORT = (((Bquiz1+Bquiz2+Bquiz3)/3)*20)/100;
double BkntO = (Bkanaat*5)/100;
double BprtO = (Bport*5)/100;
double BsnmO = (Bsunum*5)/100;
double BonlO = (Bonline*5)/100;
double Bort = BVizeORT + BQuizORT + BkntO + BsnmO + BonlO + BprtO;

System.out.println("---------------------------------------------------");
System.out.println("***************************************************");   
        System.out.println("Bahar Dönemi Ortalamanız: "+ new DecimalFormat("##.##").format(Bort));       
System.out.println("***************************************************");   
System.out.println("---------------------------------------------------");
       
double Dort = (Gort+Bort)/2;
double Final = 100*(65-((Dort*4)/10))/60;

System.out.println("***************************************************");          
System.out.println("Dönemler Ortalamanız: "+ new DecimalFormat("##.##").format(Dort));
System.out.println("***************************************************");  
System.out.println("---------------------------------------------------");

        if (Dort>=80){
            System.out.println("Tebrikler hazırlık sınıfını not ortalamasıyla geçtiniz!!!");
        }
        else{
            System.out.println("Finale kaldınız...");
            System.out.print("Sınıfı geçmeniz için finalden almanız gereken not: " + Math.ceil(Final));
        }




    }
  
}
