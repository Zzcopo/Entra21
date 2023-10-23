package herancaAbstrata3;

public class lancha extends embarcação {
    private double velmax;


    public lancha(String id, String modelo, int qntdPessoas, double capacidadeCombustivel, double queimaDeCombustivel, int quantiadeDeBotes, double velmax) {
        super(id, modelo, qntdPessoas, capacidadeCombustivel, queimaDeCombustivel, quantiadeDeBotes);
        setVelmax(velmax);
    }

    public double getVelmax() {
        return velmax;
    }

    public void setVelmax(double velmax) {
        this.velmax = velmax;
    }


    @Override
    public String verificaSeguranca() {
        if (super.getQuantiadeDeBotes() > 1){
            return "Botes ok";
        } else return
        " ALERTA: EMBARCAÇÃO NECESSITA DE MAIS BOTES";
    }
}
