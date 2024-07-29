package main.map.operacoesbasicas;

import main.set.OperacoesBasicas.ConjuntoConvidados;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContato() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContato();

        agendaContatos.adicionarContato("Camila", 1234523);
        agendaContatos.adicionarContato("Camila", 9878798);
        agendaContatos.adicionarContato("Camila Cavalcante", 11111);
        agendaContatos.adicionarContato("Camila DIO", 4352353);
        agendaContatos.adicionarContato("Maria Silva", 11111);

        agendaContatos.exibirContato();

        System.out.println("O número é: "+agendaContatos.pesquisarPorNome("Camila"));

        agendaContatos.exibirContato();

    }

}
