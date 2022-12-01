public abstract class BasePhoneManager {


    abstract  double buy( double price);
    protected double otvPrice = 0.18;

    private String modelBilgisi;
    private String firmaBilgisi;

    public String getModelBilgisi() {
        return modelBilgisi;
    }
    public BasePhoneManager(String modelBilgisi,String firmaBilgisi){
        this.firmaBilgisi= firmaBilgisi;
        this.modelBilgisi=modelBilgisi;

    }
    public void setModelBilgisi(String modelBilgisi) {
        this.modelBilgisi = modelBilgisi;
    }

    public String getFirmaBilgisi() {
        return firmaBilgisi;
    }

    public void setFirmaBilgisi(String firmaBilgisi) {
        this.firmaBilgisi = firmaBilgisi;
    }






}
