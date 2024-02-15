public class Formatter {
    public String formatter(double summa) {
        int nums = (int) Math.floor(summa) % 10;
        String rub = "";
        if(nums > 1 && nums < 5) {
            rub = "рубля";
        } else if (nums == 1) {
            rub = "рубль";
        }else {
            rub = "рублей";
        }
        return rub;
    }
}
