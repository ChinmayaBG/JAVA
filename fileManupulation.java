import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

class fileManupulation{
	public static void main(String[] args) {
		String filePathWrite = "output.txt";
		String filePathRead = "sample.txt";
		String content = "Today is Tuesday";

		try {
			BufferedReader br = new BufferedReader(new FileReader(filePathRead));
			String line;
			while((line = br.readLine()) != null){
				System.out.print(line);
			}
			br.close();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		try{
			BufferedWriter br = new BufferedWriter(new FileWriter(filePathWrite));
			br.write(content);
			br.close();
		}
		
		catch(Exception e){
			e.printStackTrace();
		}

		try{
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter any input");

			String name = reader.readLine();
			System.out.println(name);

			int num = Integer.parseInt(reader.readLine());
			System.out.println(num);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}