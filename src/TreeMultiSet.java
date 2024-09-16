public class TreeMultiSet extends MultiSet {

    // TODO add a Tree object as a private instance variable for this class
    private Tree t;

    public TreeMultiSet() {
        this.t = new Tree(null, null);
    }

    /**
     * Add the given item to this multiset.
     *
     * @param item the item to add
     */
    @Override
    void add(Integer item) {
        // TODO complete this method
        t.insert(item);
    }

    // TODO write the rest of the implementation for this class so that it uses its private Tree
    //      object to provide the MultiSet functionality.
    void remove(Integer item) {
        t.delete_item(item);
    }

    void contains(Integer item) {
        return t.contains(item);
    }

    void is_empty(){
        return t.is_empty();
    }

    void
}
