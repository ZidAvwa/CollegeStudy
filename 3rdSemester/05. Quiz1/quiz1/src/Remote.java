public class Remote {
    private String Language;
    private int BatteryNumber;

    public Remote(String lang, int battnum) {
        Language = lang;
        BatteryNumber = battnum;
    }

    public String getLanguage() {
        return Language;
    }

    public int getBatteryNumber() {
        return BatteryNumber;
    }

    public void setBatteryNumber(int BatteryNumber) {
        this.BatteryNumber = BatteryNumber;
    }

    public void setLanguage(String Language) {
        this.Language = Language;
    }
}