public class MASSIV {
    public static void main(String[] args) {
        int [][] mass = new int[5][8];
        for(int i =0;i<mass.length;i++){
            for(int h=0;h<mass[i].length;h++){
                mass[i][h]=(int)((Math.random()*199)-99);
                System.out.print(mass[i][h]+" ");
            }
            System.out.println();
        }
        int min=mass[0][0];
        for(int i =0;i<mass.length;i++){
            for(int h=0;h<mass[i].length;h++){
                if(mass[i][h]>min)min=mass[i][h];
            }
        }
        System.out.println(" ");
        System.out.println("Максимальное число в масиве = "+min);
    }
}