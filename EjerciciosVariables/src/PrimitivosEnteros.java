public class PrimitivosEnteros {
    public static void main(String[]args){
        byte numeroByte =127;
        short numeroShort = 32767;
        int numeroInt = 2147483647;
        long numeroLong = 9000000000000000000l;
        System.out.println("numeroByte maxvalue = " + numeroByte);
        System.out.println("numeroByte minvalue = " + Byte.MIN_VALUE);
        System.out.println("numeroByte size = " + Byte.SIZE);
        System.out.println("numeroByte bytes = " + Byte.BYTES);
        System.out.println("numeroShort maxvalue = " + numeroShort);
        System.out.println("numeroShort minvalue = " + Short.MIN_VALUE);
        System.out.println("numeroShort size = " + Short.SIZE);
        System.out.println("numeroByte bytes = " + Short.BYTES);
        System.out.println("numeroInt maxvalue = " + numeroInt);
        System.out.println("numeroInt minvalue = " + Integer.MIN_VALUE);
        System.out.println("numeroInt size = " + Integer.SIZE);
        System.out.println("numeroByte bytes = " + Integer.BYTES);
        System.out.println("numeroLong maxvalue = " + numeroLong);
        System.out.println("numeroLong minvalue = " + Long.MIN_VALUE);
        System.out.println("numeroLong size = " + Long.SIZE);
    }
}
