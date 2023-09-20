package singleton_trabalho;

public class Executar {
public static void main(String[] args){

Fila fila = Fila.getInstance();

fila.setImprime("Imprime:Documento 1");
fila.setRemove("Remove:Documento 2");
fila.setRemove_td("Remove todos os:Documentos 1,2,3,4");

Fila fila1 = Fila.getInstance();

System.out.println(fila1.getImprime());
System.out.println(fila1.getRemove());
System.out.println(fila1.getRemove_td());

}
}