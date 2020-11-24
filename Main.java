
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //Welcome to interest_calculating program
        //,.,.,.,.,.,.,.,.,.,.,.,.,..,.,..,.,.,.,.,
    Scanner scn = new Scanner(System.in);
        System.out.println("hoşgeldiniz");
        System.out.println("mevcut faiz oranı %6");
        double anapara ;
        double vade ;
        while(true){
            String a = "işlemler\n"
                    + "q) veya Q) ÇIKIŞ\n"
                    + "f) faizli işlemler";
            System.out.println(a);
            System.out.println("yapmak istediğiniz işlemi giriniz : ");
            String b = scn.nextLine();
            if(b.equals("q") || b.equals("Q")){
                System.out.println("sistemden çıkış gerçekleştirildi\nTekrar bekleriz");
                break;
            }else if(b.equals("f")){
                       System.out.println("yatırmak istediğiniz tutar : ");
        anapara =scn.nextDouble();
        System.out.println("kaç yıl vade olsun : ");
        vade = scn.nextDouble();
        double toplampara = anapara;
        double sabit_fazi_oranı = 0.06;
        
        for(int i=1;i<=vade;i++){
            toplampara = (toplampara*sabit_fazi_oranı)+toplampara;
            System.out.println(i+" .yılın sonunda paranızın durumu : " +(int)toplampara);
        }
       
            }
      
    
        }
     
    
    
    
    
    }
    
}
