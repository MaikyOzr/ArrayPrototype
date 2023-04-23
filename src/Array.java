

public class Array implements ArarysMethod {

    private int symbol1;
    private int symbol2;
    private int symbol3;
    private int symbol4;
    private int symbol5;


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


    public void Length(Object obj)
    {
        int len=0;
        while(symbol1!=0&&symbol2!=0&&symbol3!=0&&symbol4!=0&&symbol5!=0)
        {
            symbol1/=10;
            len+=1;
            symbol2/=10;
            len+=1;
            symbol3/=10;
            len+=1;
            symbol4/=10;
            len+=1;
            symbol5/=10;
            len+=1;
        }
        System.out.println(len);
    }
}


