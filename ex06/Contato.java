package ex06;
import java.util.ArrayList;


class Contato {
    String nome;
    String telefone;

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    
    public String toString() {
        return "Nome: " + nome + ", Telefone: " + telefone;
    }
}

class ListaContatos {
    ArrayList<Contato> contatos;

    public ListaContatos() {
        contatos = new ArrayList<>();
    }

    public void adicionarContato(String nome, String telefone) {
        Contato novoContato = new Contato(nome, telefone);
        contatos.add(novoContato);
        System.out.println("Contato adicionado: " + novoContato);
    }

    public void removerContato(String nome) {
        Contato contatoRemover = null;
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                contatoRemover = contato;
                break;
            }
        }
        if (contatoRemover != null) {
            contatos.remove(contatoRemover);
            System.out.println("Contato removido: " + contatoRemover);
        } else {
            System.out.println("Contato não encontrado.");
        }
    }

    public void buscarContato(String nome) {
        boolean encontrado = false;
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Contato encontrado: " + contato);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Contato não encontrado.");
        }
    }
}
