import java.util.Scanner;

public class CustomerManager {

    BasePhoneManager basePhoneManager;

    void doTheShopping(){
        System.out.println("------Telefon Fiyatlandırması------");
        System.out.println("Lütfen satışını Yapacağınız Telefonun fiyat Bilgisini Giriniz.");
        Scanner scanner = new Scanner(System.in);
        double price = scanner.nextDouble();
        System.out.println("Satışını Yapacağınız Telefon İçin Fiyat Bilgisi: "+ basePhoneManager.buy(price)+ "Tenge");
        price = (price+(price*basePhoneManager.otvPrice));
        System.out.println("Satışını Yapacağınız  Telefon İçin Yapılacak Ödeme(Ötv İle Birlikte): "+ basePhoneManager.buy(price)+  "Tenge");

        System.out.println("****Ürün Bilgileri****\n"
                +"Firma Bilgisi: "+ basePhoneManager.getFirmaBilgisi()+"\n"+
                "Model Bilgisi: "+ basePhoneManager.getModelBilgisi());
    }
}
