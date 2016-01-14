package delete_add_file;

import java.io.File;

public class ADfile {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		File f = new File("test.txt");
		File folder = new File("test");
		add a = new add();
		a.create(f);
		a.createfolder(folder);
		System.out.println("---------------------------");
		
		Thread.sleep(3000);
		
		delete d = new delete();
		d.delete(f);
		d.deletefolder(folder);
	}

}
