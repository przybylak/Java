
class TabliczkaMnozenia{
	public static void main(String[] args){
		int n = Integer.parseInt(args[0]);
		
		for(int i=1; i <= n; i++){
			for (int j=1; j <= n; j++){
				System.out.print(i*j + "\t");
			}
			System.out.println();
		}
		
		for(int i=1; i <= n; i++){
			for (int j=1; j <= n; j++){
				System.out.print(i + "*" + j + "=" + i*j + "\t");
			}
			System.out.println();
		}
		
		for(int i=1; i <= n; i++){
			for (int j=1; j <= n; j++){
				System.out.print(i*j + "\t");
			}
			System.out.println();
		}
		
	}
}
