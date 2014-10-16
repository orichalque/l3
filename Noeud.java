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
	
	public void addSon(Noeud<E> n) {
		if (	) {
			//ajout recursif a faire
		}
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
	
	
	
	
	
	
	

}
