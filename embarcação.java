package herancaAbstrata3;

public abstract class embarcação {
private String id;
private String modelo;
private int qntdPessoas;
private double capacidadeCombustivel;
private double queimaDeCombustivel;
private int quantiadeDeBotes;

    public embarcação(String id, String modelo, int qntdPessoas, double capacidadeCombustivel, double queimaDeCombustivel, int quantiadeDeBotes) {
       setId(id);
        setModelo(modelo);
        setQntdPessoas(qntdPessoas);
        setCapacidadeCombustivel(capacidadeCombustivel);
        setQuantiadeDeBotes(quantiadeDeBotes);
        setQueimaDeCombustivel(queimaDeCombustivel);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getQntdPessoas() {
        return qntdPessoas;
    }

    public void setQntdPessoas(int qntdPessoas) {
        this.qntdPessoas = qntdPessoas;
    }

    public double getCapacidadeCombustivel() {
        return capacidadeCombustivel;
    }

    public void setCapacidadeCombustivel(double capacidadeCombustivel) {
        this.capacidadeCombustivel = capacidadeCombustivel;
    }

    public double getQueimaDeCombustivel() {
        return queimaDeCombustivel;
    }

    public void setQueimaDeCombustivel(double queimaDeCombustivel) {
        this.queimaDeCombustivel = queimaDeCombustivel;
    }

    public int getQuantiadeDeBotes() {
        return quantiadeDeBotes;
    }

    public void setQuantiadeDeBotes(int quantiadeDeBotes) {
        this.quantiadeDeBotes = quantiadeDeBotes;
    }

public boolean planejarViagem(Double distancia){
        if ( capacidadeCombustivel / queimaDeCombustivel > distancia){
            return true;
        } else return false;
     }
public abstract String verificaSeguranca();

}
