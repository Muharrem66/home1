public class HtcPhıneManager extends BasePhoneManager {

    @Override
    double buy( double price){

        return price+(price*20)/100;
    }

    public HtcPhıneManager(String modelBilgileri, String firmaBilgileri){
        super(modelBilgileri,firmaBilgileri);
    }
}
