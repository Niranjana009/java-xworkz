package com.xworkz.bar.runner;

import com.xworkz.bar.constants.BarType;
import com.xworkz.bar.dao.BarDAO;
import com.xworkz.bar.dao.BarDAOImpl;
import com.xworkz.bar.dto.BarDTO;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			BarDTO dto=new BarDTO(2,"Gangotri","BTM",BarType.BAR_RESTAURANT,10000D,30000D);
			BarDTO dto1=new BarDTO(3,"Bhargavi","DODDABALLAPURA",BarType.BAR_RESTAURANT,10000D,30000D);
			BarDAO dao = new BarDAOImpl();
			BarDAO dao1 = new BarDAOImpl();
			dao.save(dto);
			dao1.save(dto1);
	}

}
