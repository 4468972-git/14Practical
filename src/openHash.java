public class openHash {
    private int m; // list size
    private String[] keys;
    private String[] values;


    public openHash(int m) {
        this.m = m;
        this.keys = new String[m];
        this.values = new String[m];
    }
    public int hashfunction(String key) {
        int h = key.hashCode();
        return Math.abs(h) % m + 1;
    }

}


