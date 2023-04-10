import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
/**
 *Nesta atividade, você deverá criar um projeto com Hibernate/JPA no mesmo modelo criado no 
 * exemplo Galeria de Arte, contudo utilizando uma tema diferente, procurando resolver um 
 * problema da sociedade. Além do desenvolvimento, grave um vídeo sobre o problema abordado 
 * pelo seu sistema e mostre o funcionamento do mesmo, mostrando os dados sendo salvo no banco de dados. 
 * Seu projeto deverá ter, no mínimo, uma Entidade, que será armazenada em um banco de dados MySQL. 
 *       Itens avaliados:
*   1 - Criação do projeto (1 ponto)
*   2 - Criação da Entity (1 ponto)
*   3 - Criação da classe de teste (1 ponto)
*   4 - Criação da base de dados MySQL (1 ponto)
*   5 - Funcionamento da classe de persistência inserindo corretamente no banco de dados (6 pontos)
 */
/**
 * @author Monyk Paola Penafor
 */
@Entity
@Table(name = "aluno")
public class Aluno {
    @Id /*chave primaria*/
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "cpf", columnDefinition = "CHAR(11)") 
    private String cpf;
    @Column(name = "endereco", nullable = true) 
    private String endereco;
    @Column(name = "telefone") 
    private String tel;
    @Column(name = "email", nullable = true) 
    private String email;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the tel
     */
    public String getTel() {
        return tel;
    }

    /**
     * @param tel the tel to set
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    
    

}