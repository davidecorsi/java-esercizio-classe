/*
 * Creare una classe Atleta con i seguenti campi: nome, cognome, sesso ed altezza.
 * Creare i metodi di get e set ed il metodo toString
 */
public class Atleta {
	
	String nome;
	String cognome;
	char sesso;
	int altezza;
	
	public Atleta(String nome, String cognome, char sesso, int altezza) {
		this.nome = nome;
		this.cognome = cognome;
		this.sesso = sesso;
		this.altezza = altezza;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public char getSesso() {
		return sesso;
	}

	public void setSesso(char sesso) {
		this.sesso = sesso;
	}

	public int getAltezza() {
		return altezza;
	}

	public void setAltezza(int altezza) {
		this.altezza = altezza;
	}
	
	public String toString() {
		return "Nome: " + nome + "\nCognome: " + cognome + "\nSesso: " + sesso + "\nAltezza: " + altezza;
	}
}
