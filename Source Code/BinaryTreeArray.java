public class BinaryTreeArray {
    int[] data;
    int idxLast;
    
    public BinaryTreeArray(){
        data = new int[10];
    }
    void populateData(int data[], int idxLast){
        this.data = data;
        this.idxLast = idxLast;
    }
    void traverseInOrder(int idxStart){
        if(idxStart <= idxLast){
            traverseInOrder(2*idxStart+1);
            System.out.println(data[idxStart] + " ");
            traverseInOrder(2*idxStart+2);
        }
    }

    void add(int data[]){
        this.data = data;
    }

    void addData(int root, int index){
        data[index] = root;
    }

    void traversePreOrder(int idxStart){
        if(idxStart <= idxLast){
            System.out.println(data[idxStart] + "");
            traverseInOrder(2 * idxStart + 1);
            traverseInOrder(2 * idxStart + 2);
        }
    }

    void traversePostOrder(int idxStart){
        if(idxStart <= idxLast){
            traverseInOrder(2 * idxStart + 1);
            traverseInOrder(2 * idxStart + 2);
            System.out.println(data[idxStart] + "");
        }
    }
}
