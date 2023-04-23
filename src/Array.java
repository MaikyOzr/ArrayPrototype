

public class Array implements ArarysMethod {

    private int symbol1;
    private int symbol2;
    private int symbol3;
    private int symbol4;
    private int symbol5;

    private int symbol6;
    private int symbol7;
    private int symbol8;
    private int symbol9;
    private int symbol10;

    public Array( int symbol1,int symbol2,int symbol3,int symbol4, int symbol5, int symbol6,int symbol7,int symbol8,int symbol9,
                  int symbol10){
        this.symbol1=symbol1;
        this.symbol2=symbol2;
        this.symbol3=symbol3;
        this.symbol4=symbol4;
        this.symbol5=symbol5;
        this.symbol6=symbol6;
        this.symbol7=symbol7;
        this.symbol8=symbol8;
        this.symbol9=symbol9;
        this.symbol10=symbol10;
    }
    public Array( int symbol1,int symbol2,int symbol3,int symbol4, int symbol5, int symbol6,int symbol7,int symbol8,int symbol9){
        this.symbol1=symbol1;
        this.symbol2=symbol2;
        this.symbol3=symbol3;
        this.symbol4=symbol4;
        this.symbol5=symbol5;
        this.symbol6=symbol6;
        this.symbol7=symbol7;
        this.symbol8=symbol8;
        this.symbol9=symbol9;
    }

    public Array( int symbol1,int symbol2,int symbol3,int symbol4, int symbol5, int symbol6,int symbol7,int symbol8){
        this.symbol1=symbol1;
        this.symbol2=symbol2;
        this.symbol3=symbol3;
        this.symbol4=symbol4;
        this.symbol5=symbol5;
        this.symbol6=symbol6;
        this.symbol7=symbol7;
        this.symbol8=symbol8;
    }
    public Array( int symbol1,int symbol2,int symbol3,int symbol4, int symbol5, int symbol6,int symbol7){
        this.symbol1=symbol1;
        this.symbol2=symbol2;
        this.symbol3=symbol3;
        this.symbol4=symbol4;
        this.symbol5=symbol5;
        this.symbol6=symbol6;
        this.symbol7=symbol7;
    }
    public Array( int symbol1,int symbol2,int symbol3,int symbol4, int symbol5, int symbol6) {
        this.symbol1 = symbol1;
        this.symbol2 = symbol2;
        this.symbol3 = symbol3;
        this.symbol4 = symbol4;
        this.symbol5 = symbol5;
        this.symbol6 = symbol6;
    }

    public Array( int symbol1,int symbol2,int symbol3,int symbol4, int symbol5){
        this.symbol1=symbol1;
        this.symbol2=symbol2;
        this.symbol3=symbol3;
        this.symbol4=symbol4;
        this.symbol5=symbol5;
    }
    public Array( int symbol1,int symbol2,int symbol3,int symbol4){
        this.symbol1=symbol1;
        this.symbol2=symbol2;
        this.symbol3=symbol3;
        this.symbol4=symbol4;
    }
    public Array( int symbol1,int symbol2,int symbol3){
        this.symbol1=symbol1;
        this.symbol2=symbol2;
        this.symbol3=symbol3;
    }
    public Array( int symbol1,int symbol2){
        this.symbol1=symbol1;
        this.symbol2=symbol2;
    }

    public Array( int symbol1){
        this.symbol1=symbol1;
    }

    public Array(){}

    @Override
    public void GET(){
        System.out.println("["+symbol1+", "+symbol2+", "+symbol3+", "+symbol4+", "+symbol5+"]");
    }

    @Override
    public void SUM(){
        int sum = symbol1+symbol2+symbol3+symbol4+symbol5;
        System.out.println("sum : "+sum);
    }

    @Override
    public void ReWrite(int symbol1, int symbol2, int symbol3, int symbol4, int symbol5,
                        int symbol6, int symbol7, int symbol8, int symbol9, int symbol10) {
        this.symbol1=symbol1;
        this.symbol2=symbol2;
        this.symbol3=symbol3;
        this.symbol4=symbol4;
        this.symbol5=symbol5;
        this.symbol6=symbol6;
        this.symbol7=symbol7;
        this.symbol8=symbol8;
        this.symbol9=symbol9;
        this.symbol10=symbol10;
    }

    @Override
    public void ReWrite(int symbol1, int symbol2, int symbol3, int symbol4, int symbol5,
                        int symbol6, int symbol7, int symbol8, int symbol9) {
        this.symbol1=symbol1;
        this.symbol2=symbol2;
        this.symbol3=symbol3;
        this.symbol4=symbol4;
        this.symbol5=symbol5;
        this.symbol6=symbol6;
        this.symbol7=symbol7;
        this.symbol8=symbol8;
        this.symbol9=symbol9;

    }

    @Override
    public void ReWrite(int symbol1, int symbol2, int symbol3, int symbol4, int symbol5,
                        int symbol6, int symbol7, int symbol8) {
        this.symbol1=symbol1;
        this.symbol2=symbol2;
        this.symbol3=symbol3;
        this.symbol4=symbol4;
        this.symbol5=symbol5;
        this.symbol6=symbol6;
        this.symbol7=symbol7;
        this.symbol8=symbol8;

    }

    @Override
    public void ReWrite(int symbol1, int symbol2, int symbol3, int symbol4, int symbol5,
                        int symbol6, int symbol7) {
        this.symbol1=symbol1;
        this.symbol2=symbol2;
        this.symbol3=symbol3;
        this.symbol4=symbol4;
        this.symbol5=symbol5;
        this.symbol6=symbol6;
        this.symbol7=symbol7;

    }

    @Override
    public void ReWrite(int symbol1, int symbol2, int symbol3, int symbol4,
                        int symbol5, int symbol6) {
        this.symbol1=symbol1;
        this.symbol2=symbol2;
        this.symbol3=symbol3;
        this.symbol4=symbol4;
        this.symbol5=symbol5;
        this.symbol6=symbol6;

    }

    @Override
    public void ReWrite(int symbol1, int symbol2,
                        int symbol3, int symbol4, int symbol5) {
        this.symbol1=symbol1;
        this.symbol2=symbol2;
        this.symbol3=symbol3;
        this.symbol4=symbol4;
        this.symbol5=symbol5;

    }

    @Override
    public void ReWrite(int symbol1, int symbol2,
                        int symbol3, int symbol4) {
        this.symbol1=symbol1;
        this.symbol2=symbol2;
        this.symbol3=symbol3;
        this.symbol4=symbol4;

    }

    @Override
    public void ReWrite(int symbol1, int symbol2, int symbol3) {
        this.symbol1=symbol1;
        this.symbol2=symbol2;
        this.symbol3=symbol3;
    }

    @Override
    public void ReWrite(int symbol1, int symbol2) {
        this.symbol1=symbol1;
        this.symbol2=symbol2;
    }



}
