
public class skipString {
    public static void main(String[] args) {
        String word="HelloappeTejas";

        // System.out.println(skip(word));
        System.out.println(skipApp(word));
    }
    static String skip(String up){
        if(up.isEmpty()){
            // System.out.println(p);
            return "";
        }
        // char ch=up.charAt(0);
        if(up.startsWith("apple")){
            return skip(up.substring(5));
        }else{
            return up.charAt(0)+ skip(up.substring(1));
        }
    }
     static String skipApp(String up){
        if(up.isEmpty()){
            // System.out.println(p);
            return "";
        }
        // char ch=up.charAt(0);
        if(up.startsWith("app") && ! up.startsWith("apple")){
            return skipApp(up.substring(3));
        }else{
            return up.charAt(0)+ skipApp(up.substring(1));
        }
    }
}

