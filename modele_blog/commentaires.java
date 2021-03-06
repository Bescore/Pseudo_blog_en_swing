package modele_blog;

public class commentaires {
	private int id;
	private String contenu_com;
	private int auteur_com;
	private String nom_auteur;

	public commentaires(int id, String contenu_com, int auteur_com) {
		super();
		this.id = id;
		this.contenu_com = contenu_com;
		this.auteur_com = auteur_com;
	}

	public commentaires(String contenu_com, int auteur_com) {
		super();
		this.contenu_com = contenu_com;
		this.auteur_com = auteur_com;
	}

	public commentaires(String contenu_com, int auteur_com, String nom_auteur) {
		// TODO Auto-generated constructor stub
		this.contenu_com = contenu_com;
		this.auteur_com = auteur_com;
		this.nom_auteur = nom_auteur;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContenu_com() {
		return contenu_com;
	}

	public void setContenu_com(String contenu_com) {
		this.contenu_com = contenu_com;
	}

	public int getAuteur_com() {
		return auteur_com;
	}

	public void setAuteur_com(int auteur_com) {
		this.auteur_com = auteur_com;
	}

	@Override
	public String toString() {
		return "commentaires [id=" + id + ", contenu_com=" + contenu_com + ", auteur_com=" + auteur_com
				+ ", nom_auteur=" + nom_auteur + "]";
	}

	public String getNom_auteur() {
		return nom_auteur;
	}

	public void setNom_auteur(String nom_auteur) {
		this.nom_auteur = nom_auteur;
	}

}
