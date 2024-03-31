package ex07;

class Produto {
    String nome;
    double preco;
    int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorTotal() {
        return preco * quantidade;
    }
}

class Estoque {
    Produto[] produtos;
    int tamanho;
    int Capacidade = 20;

    public Estoque() {
        produtos = new Produto[Capacidade];
        tamanho = 0;
    }

    public void adicionarProduto(String nome, double preco, int quantidade) {
        if (tamanho == produtos.length) {
            aumentarCapacidade();
        }
        produtos[tamanho++] = new Produto(nome, preco, quantidade);
    }

    public void atualizarProduto(String nome, double preco, int quantidade) {
        for (int i = 0; i < tamanho; i++) {
            if (produtos[i].getNome().equals(nome)) {
                produtos[i].setPreco(preco);
                produtos[i].setQuantidade(quantidade);
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }

    public void removerProduto(String nome) {
        for (int i = 0; i < tamanho; i++) {
            if (produtos[i].getNome().equals(nome)) {
                for (int j = i; j < tamanho - 1; j++) {
                    produtos[j] = produtos[j + 1];
                }
                tamanho--;
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }

    public void relatorioEstoque() {
        double valorTotalEstoque = 0.0;
        System.out.println("Relatório de Estoque:");
        for (int i = 0; i < tamanho; i++) {
            Produto produto = produtos[i];
            System.out.println("Produto: " + produto.getNome() +
                    ", Quantidade: " + produto.getQuantidade() +
                    ", Valor Total: " + produto.getValorTotal());
            valorTotalEstoque += produto.getValorTotal();
        }
        System.out.println("Valor Total do Estoque: " + valorTotalEstoque);
    }

    private void aumentarCapacidade() {
        Produto[] novoArray = new Produto[produtos.length * 2];
        for (int i = 0; i < tamanho; i++) {
            novoArray[i] = produtos[i];
        }
        produtos = novoArray;
    }
}
