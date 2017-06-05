package fr.fitec.projet.dao;

import java.util.List;

import fr.fitec.projet.entity.User;

public interface IDao<IEntity> {
	
	List<IEntity> selectAll();
	
}
