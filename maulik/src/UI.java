import java.util.Scanner;

public class UI {
	static int count = 0;
	static int countDownload = 0;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome To the AppStore!");
		Developer dev = new Developer();
		App data = new App();

		boolean a = true;
		while(a){
			System.out.println("\nSelect your user type:");
			System.out.println("1. User");
			System.out.println("2. Developer");
			int selection = sc.nextInt();
			if(selection==1){
				boolean b = true;
				AppUser AU = new AppUser();
				while(b){
					for(int i=0;i<count;i++){
						System.out.println((i+1) + ". " + data.showname(i));
					}
					for(int i=0;i<countDownload;i++){
						System.out.println(i);
					}
					System.out.println("\nSelect App: ");
					int selectedApp = sc.nextInt();
					System.out.println("Description: " + data.Description[selectedApp-1]+"\n");
					System.out.println("1. Download");
					System.out.println("2. Back");
					System.out.println("3. Exit");
					int selectToDownload = sc.nextInt();
					if(selectToDownload==1){
						
						AU.downloadedApps[countDownload++] = data.AppName[selectToDownload-1];
						data.totalDownloads[selectedApp-1]++;
						b = false;
					}
					else if(selectToDownload==2){
						b = true;
					}
					else{
						b = false;
					}
				}
				System.out.println("Downloaded Apps are:\n");
				for(int i=0;i<countDownload;i++)
					System.out.println(AU.showDownloadedApps(i));
				
			}
			else if(selection==2){
				boolean success = false;
				System.out.println("Press 1 to Upload App:");
				int upload = sc.nextInt();
				sc.nextLine();
				System.out.println("Give name of the app:");
				String name = sc.nextLine();
				System.out.println("Give description of the App:");
				String des = sc.nextLine();
				success = dev.UploadApp(name, des);
				System.out.println();
				if(success)
					System.out.println("Uploaded Successfully!");
				else
					System.out.println("AppStore is Full!!");
			}
			else{
				System.out.println("Eneter valid user type!");
				selection = sc.nextInt();
			}
		}
	}

}
