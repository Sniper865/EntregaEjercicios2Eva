package OtrosEjercicios;
public class ejercicioWrappers{
    public static void main(String[] args) {

        //ejemplo 1
        int i1=10;
        Integer iw1 = Integer.valueOf(i1);
        System.out.println(iw1);

        //ejemplo 2
        int i2=10,i3=20;
        Integer iw2 = Integer.compare(i2, i3);
        System.out.println(iw2);

        //ejemplo 3
        int i4 = 10;
        Integer iw3 = Integer.valueOf(i4);
        System.out.print(Integer.bitCount(iw3));

        //ejemplo 4
        int i5=10,i6=20;
        Integer iw4 = Integer.valueOf(i5);
        iw4.compareTo(i6);

        //ejemplo 5
        int i7 = 10,i8 = 15;
        Integer iw5 = Integer.valueOf(i7);
        iw5.equals(i8);

        //ejemplo 6
        String i9 = "1958";
        Integer iw6 = Integer.decode(i9);
        System.out.println(iw6);

        
    }
}