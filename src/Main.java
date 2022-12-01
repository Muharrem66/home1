import java.util.Scanner;

public class Main {

    public static void main(String[]args){
          CustomerManager customerManager= new CustomerManager();

        Scanner scanner =new Scanner(System.in);
        String secenekler= "**Lütefen SatışıYapılacakTeefon Markasını Seçiniz**\n"+
                "<Htc için 1'e Basın>"+
                "<Huawei> için 2'ye basın\n"+
                "<Samsung> için 3'e basın\n";


        System.out.println(secenekler);
        System.out.println("---İşlemi seçiniz---");
        int secenek = Integer.parseInt(scanner.nextLine());
        if (secenek < 1 || secenek > 3){
            System.out.println("Lütfen Doğru İşlem Seçiniz!");
        }else {
            switch (secenek){
                case 1->{
                    customerManager.basePhoneManager = new HtcPhıneManager("Htc ONEProMax","Htc");
                }
                case 2->{
                    customerManager.basePhoneManager= new HuaweiPhoneManager("HyzM","Huawei");
                }
                case 3->{
                    customerManager.basePhoneManager= new SamsungPhoneManager("GalaxA","Samsung");
                }
            }
        }
        customerManager.doTheShopping();

    }
}
