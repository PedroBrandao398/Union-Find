public class WQuickUnionUF {
  private int[] id;
  private int[] sz;


  //Criação de objetos WQuickUnionUF
  public WQuickUnionUF(int N) {
    //Cria um array de id
    id = new int[N];
    //Cria um array do tamanho de árvore
    sz = new int[N];
    //Inicializa os arrays
    for (int i = 0; i < N; i++) {
      id[i] = i;
      sz[i] = 1;
    }
  }


  //Encontra a raiz
  private int root(int i){
    //Sobe a árvore id por id
    while (i != id[i]) {
      i = id[i];
    }
    //Devolve a raiz
    return i;
  }
  
  public void union(int p, int q) {
    //Guarda raiz de p e q
    int rp = root(p);
    int rq = root(q);
    //Verifica se p e q já estão conectados
    if (rp == rq) return;
    //Verifica a menor arvóre e conecta a menor à maior e soma o tamanho da menor à maior
    if (sz[rp] < sz[rq]) {
      id[rp] = rq;
      sz[rq] += sz[rp]; }
    else { 
      id[rq] = rp;
      sz[rp] += sz[rq]; 
    }
  }
  

  //Verifica se p e q tem a mesma raiz(grupo)
  public boolean connected(int p, int q) {
    return root(p) == root(q);
  }
}  
