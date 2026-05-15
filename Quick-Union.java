public class QuickUnionUF {
  private int[] id;

  
  //Criação de objetos QuickFindUF
  public QuickUnionUF(int N) {
    //Cria array de tamanho N
    id = new int[N];
    //Inicializa o array
    for (int i = 0; i < N; i++) {
      id[i] = i;
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


  //Conecta elementos p e q
  public void union(int p, int q) {
    //Guarda raiz de p e q
    int rp = root(p);
    int rq = root(q);
    //Passa elementos da raiz de p para raiz de q
    id[rp] = rq;
  }


  //Verifica se p e q tem a mesma raiz(grupo)
  public boolean connected(int p, int q) {
    return root(p) == root(q);
  }
}
