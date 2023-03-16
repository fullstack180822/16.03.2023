package hash1.map1;

public class MyTuple <K, V> {

    protected K k;
    protected V v;

    public MyTuple(K k, V v) {
        this.k = k;
        this.v = v;
    }

    public K getK() {
        return k;
    }

    public void setK(K k) {
        this.k = k;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }

    @Override
    public String toString() {
        return "MyTuple{" +
                "k=" + k +
                ", v=" + v +
                '}';
    }
}
