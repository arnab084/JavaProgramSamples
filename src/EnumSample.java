enum EnumData {
    RETURNS_NOTE
}

public class EnumSample{
    public static void main(String args[]){
        String name = EnumData.RETURNS_NOTE.name();
        System.out.println(name.substring(name.length()-4));
    }
}
