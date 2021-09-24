package fr.eni.demoInjectionDependance.dal;

public interface RepositoryInterface {
	
	public Object findById();
	public void insert();
	public void delete();
	public Object upgrade();
	
}
