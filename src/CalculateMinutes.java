public class CalculateMinutes {
    public static void main(String args[]){
       int minutes = getMinutes(70);
        System.out.println(minutes);
    }

    private static int getMinutes(int seconds) {
        int i = (int)Math.ceil(seconds/60.0);
        return i;
    }
}

