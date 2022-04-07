package chapter7;

public class ArrayTwoDimension {
    public static void main(String args[]){
        ArrayTwoDimension array=new ArrayTwoDimension();
        array.twoDimensionArray();
        array.printArray();
    }
    public void twoDimensionArray() {
        int [][]twoDim;
        twoDim=new int[2][3];
        // == int [] twoDim[];
        // == int twoDim[]][];
        // == int [][]twoDim={{1,2,3},{4,5,6}};
        // == int [][] twoDim=new int[2][3];
        int [] oneDim=new int[3];
        System.out.println(oneDim.length);
        System.out.println(twoDim.length);
        System.out.println(twoDim[0].length);
    }
    public void printArray(){
        int [][]twoDim={{1,2,3},{4,5,6}};
        System.out.println("twoDim.length="+twoDim.length);
        System.out.println("twoDim[0].length="+twoDim[0].length);
        int twoDimLength=twoDim.length;
        for (int oneLoop=0;oneLoop<twoDimLength;oneLoop++){
            int twoDimOneLength=twoDim[oneLoop].length;
            for(int twoLoop=0;twoLoop<twoDimOneLength;twoLoop++){
                System.out.println("twoDim["+oneLoop+"]["+twoLoop+"]="+twoDim[oneLoop][twoLoop]);
            }
        }
    }
}
