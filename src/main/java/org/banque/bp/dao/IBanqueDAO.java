package org.banque.bp.dao;

import java.util.List;

import org.banque.bp.enties.*;

public interface IBanqueDAO {
	public void addClient(Client c);

	public void addEmploye(Employe e, Long numEmpSup);

	public void addGroupe(Groupe g);

	public void addEmployeToGroupe(Long idGroupe, Long idEmp);

	public void addCompte(Compte c, Long numCli, Long numEmp);

	public void addOperation(Operation op, String numCpte, Long numEmp);

	public Compte consulterCompte(String numCpte);

	public List<Client> consulterClientsParNom(String mc);

	public List<Client> consulterClients();

	public List<Groupe> consulterGroupes();

	public List<Employe> consulterEmployes();

	public List<Employe> consulterEmployesParGroupe(Long idG);

	public Employe consulterEmploye(Long idEmp);
	
	
}