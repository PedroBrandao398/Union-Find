public class QuickFindUF {
  private int id[];

  
  //Criação de objetos QuickFindUF
  public QuickFindUF(int N) {
    //Cria array de tamanho N
    id = new int[N]
    //Inicializa o array
    for (int i = 0; i < N, i++) {
      id[i] = i;
    }
  }

  
  //Conecta elementos p e q
  public void union(int p, int q) {
    //Guarda id de p e de q
    int pid = id[p];
    int qid = id[q];
    //Passa elementos de id de p para id de q
    for (int i = 0; i < id.length; i++) {
      if (id[i] == pid) {
        id[i] = qid;
      }
    }
  }

  
  //Verifica se p e q tem o mesmo id(grupo)
  public boolean connected(int p, int q) {
    return id[p] == id[q];
  }
}
