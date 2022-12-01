public class HuaweiPhoneManager extends BasePhoneManager{


    @Override
    double buy(double price) {
        return price-(price*25)/75;
    }

    public HuaweiPhoneManager(String modelBilgisi, String firmabilgisi){
        super(modelBilgisi,firmabilgisi);

    }
}
