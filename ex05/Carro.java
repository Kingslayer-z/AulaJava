package ex05;

public class Carro {
    
    String marca;
    String modelo;
    int ano;
    double velocidadeAtual;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = 0; 
    }

    
    public void acelerar(double quantidade) {
      
        if (quantidade > 0) {
            velocidadeAtual += quantidade;
            System.out.println("O carro acelerou para " + velocidadeAtual + " km/h");
        } else {
            System.out.println("A quantidade de aceleração deve ser maior que zero");
        }
    }

    
    public void frear(double quantidade) {
        
        if (quantidade > 0) {
            
            if (quantidade <= velocidadeAtual) {
                velocidadeAtual -= quantidade;
                System.out.println("O carro reduziu para " + velocidadeAtual + " km/h");
            } else {
                velocidadeAtual = 0; 
                System.out.println("O carro parou completamente");
            }
        } else {
            System.out.println("A quantidade de frenagem deve ser maior que zero");
        }
    }

    
    public void exibirDetalhes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Velocidade atual: " + velocidadeAtual + " km/h");
    }
}