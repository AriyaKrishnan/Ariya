package anoud;

public class ExceptionDemo {
		public static void main(String[] args) {
			if(args.length==0) {
				System.out.println("Please Give a Argument Value....");
			}
			else {
				String v=args[0];
				char c=v.charAt(0);
				if(Character.isDigit(c)) {
					int n=Integer.parseInt(c+"");
					if(n==0) {
						System.out.println("Please Enter a Non Zero Value...");
					}
					else {
						System.out.println(n);
						int x=1/n;
					}
				}
				else {
					System.out.println("Please Enter Number as Argument...");
				}
				
			}
		}
	}

