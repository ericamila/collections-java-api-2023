package main.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int convite) {
        this.convidadoSet.add(new Convidado(nome, convite));
    }

    public void removerConvidadoPorCodigoConvite(int convite) {
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet){
            if (c.getConvite() == convite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem "+conjuntoConvidados.contarConvidados()+" convidados dentro do Set");

        conjuntoConvidados.adicionarConvidado("Convidado 1", 1234);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 1236);

        System.out.println("Existem "+conjuntoConvidados.contarConvidados()+" convidados dentro do Set");

        conjuntoConvidados.removerConvidadoPorCodigoConvite(1234);
        System.out.println("Existem "+conjuntoConvidados.contarConvidados()+" convidados dentro do Set");

        conjuntoConvidados.exibirConvidados();

    }
}
