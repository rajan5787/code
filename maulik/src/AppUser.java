
public class AppUser {
	static String[] downloadedApps;
	UI u = new UI();
	public AppUser(){
		downloadedApps = new String[5];
	}
	
	String showDownloadedApps(int i){
		return downloadedApps[i];
	}
}
