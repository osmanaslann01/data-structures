
package agaclar;


public class MainB {

    
    public static void main(String[] args) {
       BTree bt = new BTree();
      bt.root= bt.insert(bt.root, 10);
      bt.root= bt.insert(bt.root, 15);
      bt.root= bt.insert(bt.root, 8);
      bt.root= bt.insert(bt.root, 20);
       bt.root= bt.insert(bt.root, 4);
       bt.root= bt.insert(bt.root, 12);
       
        System.out.println("kökün sagindaki datasi : "+ bt.root.right.data);
       System.out.println("kökün solundaki datasi : "+ bt.root.left.data);
         System.out.println("kökün solunun solundaki datasi : "+ bt.root.left.left.data);
    }
    
}
