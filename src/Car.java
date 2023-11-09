
public class Car {
	
	//attributs
	private String marque;
	private String modele;
	private float prixAchat;
	private float prixVente;
	private int nbportes;
	private int qteStock;
	private int puissanceCv;
	private int kilometrage;
	private Boolean neuve;
	
	//méthodes
	public Car(String prmmarque, String prmmodele)
	{
		this.marque = prmmarque;
		this.modele =prmmodele;
		this.prixAchat = 8000;
		this.prixVente = 10000;
		this.nbportes = 3;
		this.qteStock = 10;
		this.puissanceCv = 20;
		this.kilometrage = 260;
		this.neuve = true;
	}
	
    //accesseurs	  
	public String getMarque() {
		return this.marque;
	}
	public String getModele() {
		return this.modele;
	}	
	public float getPrixAchat() {
		return this.prixAchat;
	}
	public float getPrixVente() {
		return this.prixVente;
	}
	public int getNbportes() {
		return this.nbportes;
	}
	public int getQteStock() {
		return this.qteStock;
	}
	public int getPuissanceCv() {
		return this.puissanceCv;
	}
	public int getKilometrage() {
		return this.kilometrage;
	}
	public Boolean getNeuve() {
		return neuve;
	}
	//modificateurs ou mutateurs
	
	public void setMarque(String prmmarque) {
		this.marque = prmmarque;
	}

	public void setModele(String prmmodele) {
		this.modele = prmmodele;
	}

	public void setPrixAchat(float prmprixAchat) {
		this.prixAchat = prmprixAchat;
	}

	public void setPrixVente(float prmprixVente) {
		this.prixVente = prmprixVente;
	}

	public void setNbportes(int prmnbportes) {
		this.nbportes = prmnbportes;
	}

	public void setQteStock(int prmqteStock) {
		this.qteStock = prmqteStock;
	}

	public void setPuissanceCv(int prmpuissanceCv) {
		this.puissanceCv = prmpuissanceCv;
	}

	public void setKilometrage(int prmkilometrage) {
		this.kilometrage = prmkilometrage;
	}

	public void setNeuve(Boolean prmneuve) {
		this.neuve = prmneuve;
	}

// méthodes
	public void setQteStockplus(int prmQtereçu)
	{		// permet d'augmenter le stock
		this.qteStock+=prmQtereçu;
	}
	
	public Boolean verifStocksuffisant(int prmQteasortir)
	{     //vérifie si la quantité restant en stock est suffisante
		Boolean ok;
		if(this.qteStock>prmQteasortir)
			ok=true;
		else
		   ok = false;
		return ok;
	}

	public Boolean setQteStockMoins(int prmQtesortie)
	{		// permet d'augmenter le stock
		Boolean ok;
		if( verifStocksuffisant(prmQtesortie))
			ok=false;
		else
			ok=true;
		return ok;
	}
	
	public String CarEnChaine()
	{ 
		String unMessage="";      // le ""peut etre remplacé par null
		unMessage= unMessage+"\n Marque :"+ this.getMarque();
		unMessage = unMessage+"\n Modele :"+ this.getModele();
		unMessage = unMessage+"\n Prix d'achat :"+ this.getPrixAchat();
		unMessage = unMessage+"\n Prix de vente :"+ this.getPrixVente();
		unMessage = unMessage+"\n nombre de portes :"+ this.getNbportes() ;
		unMessage = unMessage+"\n Quantité en stock :"+ this.getQteStock();
		unMessage = unMessage+"\n puissance en chevaux :"+ this.getPuissanceCv();
		unMessage = unMessage+"\n Kilometrage :"+ this.getKilometrage();
		unMessage = unMessage+"\n etat Neuf :"+ this.getNeuve();
		System.out.println(unMessage);
		return unMessage;
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Car mycar ;
     mycar= new Car("CHEVROLET", "Camaro");
     mycar.CarEnChaine();
     mycar.setPrixAchat(28000);
     mycar.setPrixVente(36000);
     mycar.setNbportes(3);
     mycar.setQteStock(15);
     mycar.CarEnChaine();
		
	}

	

}
