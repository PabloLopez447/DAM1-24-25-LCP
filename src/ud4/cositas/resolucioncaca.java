package ud4.cositas;

public class resolucioncaca {

    public static void main(String[] args) {
        

        String r = "2000x1000";

        String[] arrSplit = r.split("x"); // <--- [{2000},{1000}]

        Integer n1 = Integer.valueOf(arrSplit[0]);
        Integer n2 = Integer.valueOf(arrSplit[1]);

        System.out.println(n1*n2);   



    }

}
