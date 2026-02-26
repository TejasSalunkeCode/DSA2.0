public class stringg {
    public static void main(String[] args) {
        String s="Bishal";
        System.out.println(s);
        s=s.substring(0,3)+"m"+s.substring(4, s.length());
        System.out.println(s);


        StringBuilder sb = new StringBuilder();
        System.out.println(sb.length()+" "+sb.capacity());
        sb.append("Tejas");
        System.out.println(sb.length()+" "+sb.capacity());
        System.out.println(sb);
        sb.setCharAt(1, 'o');
        System.out.println(sb);
        String t=sb.toString();
        sb.append("wertyuiopphgfcvbnmdfghjoiudfgbn");
        System.out.println(sb.length()+" "+sb.capacity());
        sb.append("t");       
        System.out.println(sb.length()+" "+sb.capacity());



        //reverse string
        StringBuilder str = new StringBuilder("Tejas");
        int i=0,j=str.length()-1;
        while (i<=j) {
            char temp1=str.charAt(i);
            char temp2=str.charAt(j);
            str.setCharAt(i, temp2);
            str.setCharAt(j, temp1);
            i++;
            j--;
        }
        System.out.println(str);


        String s1="Devesh";
        StringBuilder sb1 = new StringBuilder(s1);
        sb1.deleteCharAt(1);
        sb.insert(1, 'e');
        sb.delete(3, 6);
        System.out.println(sb1);


    }

}