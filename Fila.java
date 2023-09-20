package singleton_trabalho;

 public class Fila {

 private static  Fila instancia;
private String imprime;
private String remove;
private String remove_td;

 public String getImprime(){
return imprime;
}

 public void setImprime(String imprime) {
this.imprime = imprime;
}

 public String getRemove(){
return remove;
}

 public void setRemove(String remove) {
this.remove = remove;
}

 
public String getRemove_td(){
return remove_td;
}

 public void setRemove_td(String remove_td){
this.remove_td = remove_td;
}

 public static Fila getInstance()
{
if (instancia == null)
{
instancia= new Fila();
}
return instancia;
}

 private Fila(){  
}
}