package com.formationo.gdp;

import com.formatioin.gbp.dao.ClientDAO;
import com.formation.gbp.entity.Client;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Client c = new Client();
		ClientDAO cDAO = new ClientDAO();
		c.setNom("forest");
		c.setCode(12345678L);
		cDAO.addClient(c);
		
	}

}
