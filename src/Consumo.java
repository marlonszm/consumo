import java.util.Date;
public class Consumo {
    private static int consumoAnterior=0;
    private int idConsumo;
    private Date data;
    private char tipoConsumo;
    private char tipoCliente;
    private double valorConsumo;
    private double valorConta;
    public Consumo(double valorConsumo){
        consumoAnterior++;
        this.idConsumo = consumoAnterior;
        this.tipoCliente ='P';
            this.valorConsumo = valorConsumo;
            fechaConta(valorConsumo);
    }
    public void fechaConta(double valorConsumo){
        this.valorConta = (this.valorConsumo+(this.valorConsumo*10/100));
    }
    public Consumo(double valorConsumo, char tipoCliente){
        this.tipoCliente = tipoCliente;
        this.valorConsumo = valorConsumo;
        fechaConta(valorConsumo, tipoCliente);
    }
    public void fechaConta(double valorConsumo, char tipoCliente){
        if(this.tipoCliente=='F'){
            this.valorConta = this.valorConsumo-10;
        }
        else if(this.tipoCliente=='A'){
            if(this.valorConsumo<=30){
                this.valorConta = this.valorConsumo-3;
            }
            else{
                this.valorConta = this.valorConsumo-5;
            }
        }
        else{
            this.valorConta = valorConsumo;
        }
    }
    public void setData(Date data) {
        this.data = data;
    }
    public void setTipoConsumo(char tipoConsumo) {
        this.tipoConsumo = tipoConsumo;
    }

    public void setTipoCliente(char tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
    public static int getConsumoAnterior() {
        return consumoAnterior;
    }
    public int getIdConsumo() {
        return idConsumo;
    }
    public Date getData() {
        return data;
    }
    public char getTipoConsumo() {
        return tipoConsumo;
    }
    public char getTipoCliente() {
        return tipoCliente;
    }
    public double getValorConsumo() {
        return valorConsumo;
    }
    public double getValorConta() {
        return valorConta;
    }
    public String toString(){
        return "Este é um cartão de consumo";
    }

}
