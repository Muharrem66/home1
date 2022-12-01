public class SamsungPhoneManager extends BasePhoneManager {
    @Override
    double buy(double price) {
        return price-290;
    }

    public SamsungPhoneManager(String modelBilgisi, String firmaBilgisi){
        super(modelBilgisi, firmaBilgisi);

    }
}
