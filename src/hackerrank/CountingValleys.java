package hackerrank;

public class CountingValleys {
    public static void main(String[] args) {
        String path ="DDUUDDUDUUUD";
        int steps=12;

        System.out.println(countingValleys(steps,path));
    }

    public static int countingValleys(int steps, String path) {
        // Write your code here

        //UDDDUDUU
        //      i

        //DDUUDDUDUUUD
        int traversalCount=0;
        int valleyTraversalCount=0;

        for (int i=0;i<steps;i++){
            if(path.charAt(i)=='U'){
                if(traversalCount==-1 && traversalCount+1==0){
                    valleyTraversalCount+=1;
                }
                traversalCount+=1;
            }else{
                traversalCount-=1;
            }

        }
        return valleyTraversalCount;
    }

}
