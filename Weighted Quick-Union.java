public class WQuickUnionUF {
  private int[] id;
  private int[] sz;

  public WQuickUnionUF(int N) {
    id = new int[N];
    sz = new int[N];
    for (int i = 0; i < N; i++) {
      id[i] = i;
      sz[i] = 1;
    }
  }

  private int root(int i){
    while (i != id[i]) {
      i = id[i];
    }
    return i;
  }
  
  public void union(int p, int q) {
    int rp = root(p);
    int rq = root(q);
    if (rp == rq) return;
    if (sz[rp] < sz[rq]) {
      id[rp] = rq;
      sz[rq] += sz[rp]; }
    else { 
      id[rq] = rp;
      sz[rp] += sz[rq]; 
    }
  }
  
  public boolean connected(int p, int q) {
    return root(p) == root(q);
  }
}
