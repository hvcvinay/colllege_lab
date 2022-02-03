class piramid{

    public static void main(String args[]){

        int size=10;
        for(int i=0 ; i<size; i++){
            for(int j=0; j<i; j++){
            System.out.print(j);
            }
            System.out.println();
        }

    }
}
// public class piramid {

//   public static void main(String[] args) {
//     int rows = 5;

//     for (int i = 1; i <= rows; ++i) {
//       for (int j = 1; j <= i; ++j) {
//         System.out.print("* ");
//       }
//       System.out.println();
//     }
//   }
// }