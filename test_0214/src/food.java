
	
	import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

	public class Food implements Serializable {
		
		public String name;
		public int kcal;
		
		
		public Food() {
			super();
		}


		public Food(String name, int kcal) {
			super();
			this.name = name;
			this.kcal = kcal;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public int getKcal() {
			return kcal;
		}


		public void setKcal(int kcal) {
			this.kcal = kcal;
		}


		@Override
		public String toString() {
			return "Food [name=" + name + ", kcal=" + kcal + "]";
		}
		
		
		public void fileSave(String fileName) {
			
			Food food = new Food("사과", 20);
			File f1 = new File(fileName);
			
			try ( FileOutputStream fo = new FileOutputStream(f1);
					ObjectOutputStream ob = new ObjectOutputStream(fo)) {
				
				ob.writeObject(food);
			} catch ( FileNotFoundException e) {
				
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}	
		}
		
		
		
		
		
	}

}
