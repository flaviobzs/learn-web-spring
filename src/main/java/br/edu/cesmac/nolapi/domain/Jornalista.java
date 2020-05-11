package br.edu.cesmac.nolapi.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;

@Entity
public class Jornalista {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idJornalista;
	
	@NotBlank(message = "Nome do jornalista não pode ser nulo")
	private String nome;
	
	@Column(unique=true)
	@NotBlank(message = "E-mail do jornalista não pode ser nulo")
	private String email;
	
	private String biografia;
	
	@OneToOne
	private Noticia noticia;

	public Long getIdJornalista() {
		return idJornalista;
	}

	public void setIdJornalista(Long idJornalista) {
		this.idJornalista = idJornalista;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBiografia() {
		return biografia;
	}

	public void setBiografia(String biografia) {
		this.biografia = biografia;
	}

	public Noticia getNoticia() {
		return noticia;
	}

	public void setNoticia(Noticia noticia) {
		this.noticia = noticia;
	}

}
