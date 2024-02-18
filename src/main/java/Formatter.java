public class Formatter {
    public String formatter(double summa) {
        int nums = (int) Math.floor(summa);
        String rub = "рублей";
        if(nums % 100 >= 11 && nums % 100 <= 19 || nums % 10 == 0) {
            rub = "рублей";
        } else if (nums % 10 == 1) {
            rub = "рубль";
        }else if (nums % 10 >= 2 && nums % 10 <= 4){
            rub = "рубля";
        }
        return rub;
    }
}
