package br.edu.cesmac.nolapi.resources.domain;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Jornalista {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idJornalista;
	private String nome;
	
	public void Jornalista(Long idJornalista, String nome) {
		this.idJornalista = idJornalista;
		this.nome = nome;
	}
	
	public long getidJornalista() {
		return idJornalista;
	}
	
	public void setId(int id) {
		this.idJornalista = idJornalista;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}	
	
}