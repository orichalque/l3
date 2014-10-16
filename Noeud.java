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
	}
	
	public Noeud<E> getRiSon() {
		return riSon;
	}
	
	public Noeud<E> getLeSon() {
		return leSon;
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
	
	public void ROTG() {
		Noeud k = riSon; //b <- fils droit
		int a = balance(); 
		int b = k.balance();
		riSon = k.getLeSon();
		k.leSon = this; /*Rotation*/
		k.bal
	}
	
	
	
	
	

}
