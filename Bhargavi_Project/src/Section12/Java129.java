package Section12;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Java129 {

	private static final String FILENAME = "/home/tsuser/Desktop/hig.txt";

	public static void main(String[] args) {

		BufferedWriter bw = null;
		FileWriter fw = null;

		try {

			String content = "enter your name and \n" +
					"enter your score\n"+"u data stored in desktop\n";

			fw = new FileWriter(FILENAME);
			bw = new BufferedWriter(fw);
			bw.write(content);

			System.out.println("Done");

		} catch (IOException e) {

			//e.printStackTrace();

		} finally {

			try {

				if (bw != null)
					bw.close();

				if (fw != null)
					fw.close();

			} catch (IOException ex) {

				//ex.printStackTrace();

			}

		}

	}

}