public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temp){
        if (!summer){
            if (temp >= 25 && temp <= 35){
                return true;
            }else{
                return false;
            }
        }else if(temp >= 25 && temp <= 45){
            return true;
        }else{
            return false;
        }

    }
}
