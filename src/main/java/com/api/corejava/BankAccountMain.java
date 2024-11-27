package com.api.corejava;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;

public class BankAccountMain {
		public static void main(String[] args) {

			try {
				BankAccountModel accountModel = new BankAccountModel();
				accountModel.addAccount("323", "Shyam", 800);
				accountModel.addAccount("123", "Shivam", 13312);
				
				accountModel.displayBankDetails("323");
				accountModel.displayBankDetails("123");
				
				
				ObjectMapper mapper = new ObjectMapper();
				
				String mapped = mapper.writeValueAsString(accountModel);
				System.out.println("Mapped :" + mapped);
				System.out.println("================");
				accountModel.addBalance("323", 10.0);
			} catch (JsonProcessingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			//		System.out.println(accountModel.addAccount("323", "Shyam", 800));
//			accountModel.displayAccount("123");
//			accountModel.displayAccount("323");
//			accountModel.displayAccount("1234");

	}
}
