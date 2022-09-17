package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entitties.LogEntry;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdfISO = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter file path: ");
		String path = sc.nextLine();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			Set<LogEntry> set = new HashSet<>();
			
			String line = br.readLine();
			while(line != null) {
				
				String[] fields = line.split(" ");
				LogEntry logentry = new LogEntry(fields[0], sdfISO.parse(fields[1]));
				set.add(logentry);
				
				line = br.readLine();
			}
			System.out.println("Total users: " + set.size());
		}
		catch(IOException e) {
			System.out.println("Error : " + e.getMessage());
		}
		sc.close();
	}

}
