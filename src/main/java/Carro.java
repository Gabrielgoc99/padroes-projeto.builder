

public class Carro {
    private int codigo;
    private String placa;
    private String marca;
    private String modelo;
    private String versao;
    private String cor;
    private int ano;
    private int anoModelo;

    public Carro(int codigo, String placa, String modelo) {
        this.codigo = codigo;
        this.placa = placa;
        this.modelo = modelo;
    }


    public int getCodigo() {
        return codigo;
    }

    public Carro setCodigo(int codigo) {
        this.codigo = codigo;
        return this;
    }

    public String getPlaca() {
        return placa;
    }

    public Carro setPlaca(String placa) {
        this.placa = placa;
        return this;
    }

    public String getMarca() {
        return marca;
    }

    public Carro setMarca(String marca) {
        this.marca = marca;
        return this;
    }

    public String getModelo() {
        return modelo;
    }

    public Carro setModelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public String getVersao() {
        return versao;
    }

    public Carro setVersao(String versao) {
        this.versao = versao;
        return this;
    }

    public String getCor() {
        return cor;
    }

    public Carro setCor(String cor) {
        this.cor = cor;
        return this;
    }

    public int getAno() {
        return ano;
    }

    public Carro setAno(int ano) {
        this.ano = ano;
        return this;
    }

    public int getAnoModelo() {
        return anoModelo;
    }

    public Carro setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
        return this;
    }

}
