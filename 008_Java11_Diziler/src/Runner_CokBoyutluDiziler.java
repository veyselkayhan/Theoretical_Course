
public class Runner_CokBoyutluDiziler {

	public static void main(String[] args) {
		/*
		 * 
		 * MultiArray
		 * tanımlama
		 * int[][] matris = new int
		 * ->5x5-<25 adet
		 * 
		 * 
		 * String [][] siniflistesi=new String[10][4];
		 * 
		 * {
		 * {1,"OKL1","Mustafa","Can"};
		 * {2,"OKL2","Deniz","Berna"};
		 * .
		 * .
		 * .
		 * .
		 * {10,"OKL10","Cem","Canan"};
		 * }
		 * 
		 */
		
		
		String[][] sinifListesi=new String[10][4];
		//1.öğrenci
		sinifListesi[0][0]="1";
		sinifListesi[0][1]="OKL1";
		sinifListesi[0][2]="Mustafa";
		sinifListesi[0][3]="Taş";
		
		//2.öğrenci
		sinifListesi[1][0]="2";
		sinifListesi[1][1]="OKL2";
		sinifListesi[1][2]="Deniz";
		sinifListesi[1][3]="Taş";
for(int i=0;i<10;i++) {
	for(int j=0;j<4;j++) {
		System.out.print(sinifListesi[i][j]+" ");
	}
}
	}

}
