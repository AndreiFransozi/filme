package filme;
import java.util.Date;
import javax.swing.JOptionPane;
public class Filme {
private String tituloDoFilme;
private String codigoDoFilme;
private String generoDoFilme;
private int anoDeLancamento;
private boolean eLancamento;
private boolean estaReservado;
private Date dataDeReserva;
private boolean estaAlugado;
private Date ultimaDataDeLocacao;
private Date dataDeDevolucao;
private double valorLancamento;
private double valorNormal;
String lancamento;
String reverva;
String Alugado;

public Filme(int anoDoLancamento, double valorLancamento, double valorNormal){
this.anoDeLancamento=anoDeLancamento;
this.valorLancamento=valorLancamento;
this.valorNormal=valorNormal;
}
public String gettituloDoFilme(){
return tituloDoFilme;
}
public void settituloDoFilme(String tituloDoFilme){
this.tituloDoFilme=tituloDoFilme;
}
public String getcodigoDoFilme(){
return codigoDoFilme;
}
public void setcodigoDoFilme(String codigoDoFilme){
this.codigoDoFilme=codigoDoFilme;
}
public String getgeneroDoFilme(){
return generoDoFilme;
}
public void setgeneroDoFilme(String generoDoFilme){
this.generoDoFilme=generoDoFilme;
}
public int getanoDeLancamento(){
return anoDeLancamento;
}
public void setanoDeLancamento(int anoDeLancamento){
this.anoDeLancamento=anoDeLancamento;
}
public boolean geteLancamento(){
return eLancamento;
}
public void seteLancamento(boolean eLancamento){
this.eLancamento=eLancamento;
}
public boolean getestaReservado(){
return estaReservado;
}
public void setestaReservado(boolean estaReservado){
this.estaReservado=estaReservado;
}
public Date getdataDeReserva(){
return dataDeReserva;
}
public void setdataDeReserva(Date dataDeReserva){
this.dataDeReserva=dataDeReserva;
}
public boolean getestaAlugado(){
return estaAlugado;
}
public void setestaAlugado(boolean estaAlugado){
this.estaAlugado=estaAlugado;
}
public Date getultimaDataDeLocacao(){
return ultimaDataDeLocacao;
}
public void setultimaDataDeLocacao(Date ultimaDataDeLocacao){
this.ultimaDataDeLocacao=ultimaDataDeLocacao;
}
public Date getdataDeDevolucao(){
return dataDeDevolucao;
}
public void setdataDeDevolucao(Date dataDeDevolucao){
this.dataDeDevolucao=dataDeDevolucao;
}
public double getvalorLancamento(){
return valorLancamento;
}
public void setvalorLancamento(double valorLancamento){
this.valorLancamento=valorLancamento;
}
public double getvalorNornal(){
return valorNormal;
}
public void setvalorNormal(double valorNormal){
this.valorNormal=valorNormal;
}
}


