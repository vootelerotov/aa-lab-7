package ee.ut.cs.aa.grading.dijkstra;

/**
 * Path implementation, using the idea from linked lists.
 */
public class Path<V> {

    public final V v;
    public final Path<V> next;

    public Path(V v, Path<V> next) {
        this.v = v;
        this.next = next;
    }

    @Override
    public String toString(){
        if (next == null){
            return v.toString();
        }
        return v.toString() + " --- " + next.toString();
    }
}
