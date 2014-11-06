public class Noeud<E extends Comparable<E>> {
	
	protected E etq;
	protected Noeud<E> leSon;
	protected Noeud<E> riSon;
	protected int nbFils;
	protected int bal;
	
	//CONSTRUCTEUR
	//public Noeud<E>();
	public Noeud<E>(E base)
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
	
	public int addSon(E x, int variationH) { // on ajoute sur un arbre non vide => constructeur non vide 
		int h;
		if(this == null){
			Noeud<E> B = new Noeud(x);
			this = B;
			return 1;
		}else{
			if(x!=etq){
				if ( x > etq ){
					h = riSon.addSon(x);
				}else{
					h = leSon.addSon(x);
					h = -h;
					if(h == 0){
						return 0;
					}else{
						bal = bal + h;
						equilibrer();
						if(bal == 0){
							return 0;
						}else{
							return 1;
						}
					}
				}
			}else{
				return 0;
			}
		
		
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
	
	public int getBalance(){
		return bal;
	}
	
		public void ROTD() {
		Noeud<E> k = leSon; 
		int a = bal; 
		int b = k.getBalance();
		leSon = k.getRiSon();
		k.riSon = this; /*Rotation*/
		setBal(a-Math.max(b,0)-1);
		k.setBal(Math.min(a-2,a+b-2,b-1);
	}
	public void ROTG() {
		Noeud k = riSon; //b <- fils droit
		int a = balance(); 
		int b = k.balance();
		riSon = k.getLeSon();
		k.leSon = this; /*Rotation*/
		setBal(a-Math.max(b, 0)-1);
		k.setBal(Math.min(a-2, Math.min(a+b, b-1))); //La noeud droit de l'objet est devenu racine.
	}
	
	public void DROTG() {
		riSon.ROTD();
		ROTG();
	}
	
	public void DROTD() {
		leSon.ROTG();
		ROTD();

	}
	
	public void equilibrer(){
		if(bal ==2 ){
			if(riSon.bal >=0){
				ROTG();
			}else{
				riSon  = riSon.ROTD();
				ROTG();
			}
		}else if(bal == -2){
			if(leSon.bal >=0){
				ROTD();
			}else{
				leSon  = leSOn.ROTD();
				ROTD();
			}
		}
	}
	
	public int supp(E x, int variationH){  // A MODIFIER COMME ADD
		if(x>etq){
			riSon.supp(x, variationH);
		}else if(x<etq){
			leSon.supp(x, -variationH);
		}else if(leSon == null)
			//variation = -1
		}else if(rison == null){
			// variation = -1
		}else{
			etq = mini(rison);
			riSon.oterMin(); // vrairation H prend variation de otermin
		}
		
		if(variationH != 0){
			bal = bal + variationH;
			equilibrer();
			if(bal == 0){
				//variationH = -1
		}
	}
	
	public int oterMin(){ //A FAIRE COMME ADD
	}
		
}
