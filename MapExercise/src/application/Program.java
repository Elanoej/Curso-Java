package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Map<String , Integer> candidatos = new HashMap<>();
		
		System.out.print("Enter file full path: ");
		String path = sc.nextLine();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			while(line != null) {
				String[] fields = line.split(",");
				String name = fields[0];
				Integer votosFields = Integer.parseInt(fields[1]);
				line = br.readLine();
				
				if(candidatos.containsKey(name)) {
					candidatos.put(name, candidatos.get(name)+votosFields);
				} else {
					candidatos.put(name, votosFields);
				}
			}
			for (String key : candidatos.keySet()) {
				System.out.println(key + ": " + candidatos.get(key));
			}
		} 
		catch (IOException e) {
			System.out.println("Error : " + e.getMessage());
		}
		sc.close();
	}
}
