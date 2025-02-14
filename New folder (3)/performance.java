public class performance {
    public static void main(String[] args) {
        String series=" ";
        char ch;
        for(int i = 0; i < 26; i++) {
             ch=((char)('a'+i));
             series=series+ch;
        }
        System.out.println(series);
    }
}
