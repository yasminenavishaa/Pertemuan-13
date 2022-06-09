public class BinaryTreeArrayMain {
    public static void main(String[] args) {
    BinaryTreeArray bta = new BinaryTreeArray();
    //int[] data = {6,4,8,3,5,7,9,0,0,0};
    //int idxLast = 6;
    //bta.populateData(data, idxLast);
    //bta.traverseInOrder(0);

    System.out.print("Masukkan Jumlah data : "); 
    int dataxx = sc.nextInt(); 
    int data[] = new int[dataxx]; 

    for (int i = 0; i < data.length; i++) { 
        System.out.print("Masukkan Angka : "); 
        int angka = sc.nextInt(); 
        bta.add(angka, i); 
        bta.updateData(data); 
    } 
    System.out.println("---------------"); 
    System.out.print("Pilih Angka : "); 
    int idxLast = sc.nextInt(); 
    bta.populateData(data, idxLast); 
    System.out.println("InOrder : "); 
    bta.traverseInOrder(0); 
    System.out.println(""); 
    System.out.println("PreOrder : "); 
    bta.traversePreOrder(0); 
    System.out.println(""); 
    System.out.println("PostOrder :"); 
    bta.traversePostOrder(0); 
    System.out.println(""); 
 } 
 
}
