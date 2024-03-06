package com.kh.model.vo.Food;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ServeStream {

		public void fileSave() {
			
			
			try (BufferedWriter bw = new BufferedWriter(new FileWriter("c_buffer.txt"))){
				
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
		public void fileRead() {
			
			
			
			try (BufferedReader br = new BufferedReader(new FileReader("c_buffer.txt"))){
//				
				
				String value = null;
				while((value = br.readLine()) != null) {
					System.out.println(value);
				}
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			} catch (IOException e1) {
				
				e1.printStackTrace();
			}
		}
		
		
		public void obejectSave() {
			
			
			Product Food = new Product("Food", 1000000);
			Product Food1 = new Product("Food1", 2000000);
			Product Food2 = new Product("Food2", 3000000);
			
			
			
			try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d_product.txt"))){
				
				oos.writeObject(Food);
				oos.writeObject(Food1);
				oos.writeObject(Food2);
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	
}
