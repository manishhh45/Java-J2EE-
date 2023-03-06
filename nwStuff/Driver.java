package nwStuff;
public class Driver {
	
	public static void main(String[] args) {
		while(true)
		{
			System.out.println("\n-----(  Menu  )-----");
			System.out.println("1.New missed Call\n2.Display phBook\n3.Dsiplay missed call\n4.Del contact\n5.EXIT\nEnter your choice:");
			int i=DataBaseCallers.sc.nextInt();
			switch (i) {
			
			case 1:DataBaseCallers.addMissedCall();
				break;
			case 2:DataBaseCallers.displayPhoneBook();
				break;
			case 3:DataBaseCallers.displayMissedCalls();
				break;
			case 4:DataBaseCallers.deleteContact();
				break;
			case 5:System.exit(0);
			default:System.out.println("invalid");
				break;
			}
		}
	}
}
