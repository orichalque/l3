class Prof{ 
	protected Facade f;
		
	public Prof(Facade f_) { 
		f = f_;
	}
	
	public void debut()  {
		f.debut();
	}
	
	public void fin() {
		f.fin();
	}
}
