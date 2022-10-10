package Thuchanh4;

public abstract class BTS <E extends Comparable<E>> extends AbstractTree<E>{
    protected TreeNode<E> root;
    protected int size = 0;
    public BTS(){
    }
    public BTS(E[] object){
        for (int i = 0; i < object.length; i++) {
            insert(object[i]);
        }
    }
}
