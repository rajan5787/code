import java.util.ArrayList;

public class Developer {
	App dat = new App();
	UI u = new UI();
	String Appname;
	String description;

	boolean UploadApp(String Name, String description) {

		if (u.count < 5) {
			dat.AppName[u.count] = Name;
			dat.Description[u.count] = description;
			u.count++;
			return true;
		}
		else{
			return false;
		}
	}

	
}
