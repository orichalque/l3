public class Noeud<E extends Comparable<E>> {
	
	protected E etq;
	protected Noeud<E> leSon;
	protected Noeud<E> riSon;
	protected int nbFils;
	protected int bal;
	
	//CONSTRUCTEUR
	public Noeud(E base)
	{
		etq = base;
		nbFils=0;
		leSon = null;
		riSon = null;
		bal = 0;
	}
	
	public Noeud<E> getRiSon() {
		return riSon;
	}
	
	public Noeud<E> getLeSon() {
		return leSon;
	}
	
	public void setBal(int i) {
		bal = i;
	}
	
	public boolean isLeaf()
	{
		return nbFils==0;
	}
	
	public boolean isFull()
	{
		return nbFils==2;
	}
	
	public boolean haveRson() {
		return (riSon != null);
	}
	
	public boolean haveLson() {
		return (leSon != null);
	}
	
	public int addSon(Noeud<E> n) {
		if (n = null) {
			
			//incomplet
		}
	}
	

	public Noeud<E> ROTG() {
		Noeud<E> k = riSon; //b <- fils droit
	public void ROTG() {
		Noeud k = riSon; //b <- fils droit
		int a = balance(); 
		int b = k.balance();
		riSon = k.getLeSon();
		k.leSon = this; /*Rotation*/
		setBal(a-Math.max(b, 0)-1);
		k.setBal(Math.min(a-2, Math.min(a+b, b-1))); //La noeud droit de l'objet est devenu racine.
		return k;
	}
	
	public void DROTG() {
		riSon.ROTD();
		ROTG();
	}
	
	public void DROTD() {
		leSon.ROTG();
		ROTD();
		k.bal
	}

	public int height(){
		if(isLeaf()){
			return 0;
		} else {
			return (1 + max(height(riSon, leSon)));
	}
	
	public int balance(){
		return riSon.height() - leSon.height();
	}
	

			return (1 + Math.max(height(riSon, leSon)));
	}
	public int balance(){
		return riSon.height() - leSon.height();
	}
	public int getBalance(){
		return bal;
	}
	
	public Noeaud<E> ROTD() {
		Noeud<E> k = leSon; 
		int a = bal; 
		int b = k.getBalance();
		leSon = k.getRiSon();
		k.riSon = this; /*Rotation*/
		setBal(a-Math.max(b,0)-1);
		k.setBal(Math.min(a-2,a+b-2,b-1);
		return k;
	}	
}
