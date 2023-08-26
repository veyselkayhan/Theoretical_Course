package com.veysel.repository;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.veysel.repository.entity.User;

public class UserRepositoryImpl {

	public List <User> getAllUserList(int count){
		List<User>result= new ArrayList();
		Scanner sc= new Scanner(System.in);
		
		try {
			sc=new Scanner(new  URL("https://randomuser.me/api/?results="+count).openStream(),"UTF-8");
			StringBuilder sb = new StringBuilder();
			while(sc.hasNext()) {
				String satir=sc.nextLine();
				sb.append(satir);
				System.out.println(satir);
				
			}
			Gson gson = new Gson();
			JsonElement jeElement = JsonParser.parseString(sb.toString());
			JsonObject joJsonObject = jeElement.getAsJsonObject();
			JsonArray jsonArray =joJsonObject.get("results").getAsJsonArray();
			for(int i=0;i<jsonArray.size();i++) {
				JsonObject o = jsonArray.get(i).getAsJsonObject();
				User user = gson.fromJson(o, User.class);
				result.add(user);
			}
		}catch (Exception e) {
			System.err.println("Hata...:"+e.toString());
		}
		
		return result;
	}
}



