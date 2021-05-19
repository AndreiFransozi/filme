
package filme;
public class Cliente {
public class Cliente_Filme {
private int codigoCliente;
private String nome;
private int idade;
private String endereco;

public Cliente_Filme(int codigoCliente, int idade){
    this.codigoCliente=codigoCliente;
    this.idade=idade;
       }
public int getcodigoCliente(){
    return codigoCliente;
}
public void setcodigoCliente(int codigoCliente){
    this.codigoCliente=codigoCliente;
}
public String getnome(){
    return nome;
}
public void setnome(String nome){
    this.nome=nome;
}
public int getidade(){
    return idade;
}
public void setidade(int idade){
    this.idade=idade;
}
public String getendereco(){
    return endereco;
}
public void setendereco(String endereco){
    this.endereco=endereco;
}
    }
    
}
