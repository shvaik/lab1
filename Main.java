public class Main {

    public static void main(String[] args) {
        int n = (21-3)/2+1, j = 0, i;
        long [] c = new long [n];
        for (i=21; i>=3; i-=2) {
            c[j] = i;
            j++;
        }
        float[] x = new float[19];
        for (i=0; i<19; i++) {
            x[i]= (float) (Math.random()*8-4);
        }
        float[][] arr = new float[n][19];
        for (i=0; i<n; i++) {
            for(j=0; j<19; j++) {
                switch((int) c[i]) {
                    case 3:
                        arr[i][j]= (float) Math.atan(1/Math.exp(Math.pow(5/Math.abs(x[j]),Math.pow((x[j]-
                                0.5)/x[j],Math.pow(0.5/x[j],2)))));
                        break;
                    case 7:
                    case 9:
                    case 15:
                    case 17:
                    case 19:
                        arr[i][j]= (float) Math.atan(Math.sin(Math.pow(0.5 +
                                Math.log(Math.abs(x[j])),3)));
                        break;
                    default:
                        arr[i][j]= (float) Math.pow(((Math.PI/(Math.cos(Math.atan(x[j]/8))+1))/
                                (Math.log(Math.exp(Math.tan(Math.pow(x[j]/(x[j]+1),2))))-Math.PI)),3);
                        break;
                }
                System.out.printf("%.4f ", arr[i][j]);
            }
            System.out.println();
        }

    }
}
