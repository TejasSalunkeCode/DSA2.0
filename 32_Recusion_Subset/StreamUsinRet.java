// import java.io.StringBufferInputStream;

public class StreamUsinRet {
    public static void main(String[] args) {
        String word="tejaaasa";
        
        System.out.println(skip(word));
    }
    static String skip(String up){
        if(up.isEmpty()){
            // System.out.println(p);
            return " ";
        }
        char ch=up.charAt(0);
        if(ch=='a'){
            return skip(up.substring(1));
        }else{
            return ch+skip(up.substring(1));
        }
    }
}

