public class BinaryTree<T> implements BinaryTreeInterface<T> {
    BinaryNode<T> root;

    public void setTree(T rootData){
        this.root = new BinaryNode<>(rootData);
    }

    public void setTree(
            T rootData,
            BinaryTreeInterface<T> leftTree,
            BinaryTreeInterface<T> rightTree
    ){
        privateSetTree(
                rootData,
                (BinaryTree<T>)leftTree,
                (BinaryTree<T>)rightTree
        );
    }

    private void privateSetTree(
            T rootData,
            BinaryTreeInterface<T> leftTree,
            BinaryTreeInterface<T> rightTree) {
        root = new BinaryNode<>(rootData);
        if(leftTree != null) {
            root.setLeft(leftTree.root)
        }
        if(rightTree != null) {
            root.setRight(rightTree.root)
        }
    }

    public void preorderTraverse() {
        preorderTraverse(this);
    }
    public void preorderTraverse(BinaryNode<T> node) {
        if(node != null) {
            System.out.println(node.getData());
            preorderTraverse(node.getLeft());
            preorderTraverse(node.getRight());
        }
    }
    public void inorderTraverse() {
        inorderTraverse(this);
    }
    public void inorderTraverse(BinaryNode<T> node) {
        if(node != null) {
            inorderTraverse(node.getLeft());
            System.out.println(node.getData());
            inorderTraverse(node.getRight());
        }
    }
    public void postorderTraverse() {
        postorderTraverse(this);
    }
    public void postorderTraverse(BinaryNode<T> node) {
        if(node != null) {
            postorderTraverse(node.getLeft());
            postorderTraverse(node.getRight());
            System.out.println(node.getData());
        }
    }

    public T getRootData(){
        return (T)root.getData();
    }

    public int getHeight(){
        return root.getHeight();
    }

    public int getNumberOfNodes(){
        return root.getNumberOfNodes();
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void clear(){
        root = null;
    }

}