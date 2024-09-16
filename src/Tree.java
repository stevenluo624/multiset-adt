public class Tree {
    // TODO complete this Tree class to replicate the implementation from the Tree class in adts.py
    private int _root;
    private Tree[] _subtrees;

    public boolean is_empty() {
        return _root == 0;
    }

    public int __len__() {
        if (this.is_empty()) {
            return 0;
        } else {
            int size = 1;
            for (Tree subtree : _subtrees) {
                size += subtree.__len__();
            }
            return size;
        }
    }

    public int count(int item) {
        if (this.is_empty()) {
            return 0;
        } else {
            int num = 0;
            if (this._root == item) {
                num += 1;
            }
            for (Tree subtree : _subtrees) {
                num += subtree.count(item);
            }
            return num;
        }
    }



}
