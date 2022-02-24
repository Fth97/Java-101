package Odev;

public class DiziFrekans {

	public static void main(String[] args) {
		int[] sayiDizisi = { 10, 20, 20, 10, 10, 20, 5, 20 };
		int[] bakildimi=new int[sayiDizisi.length];
		int index=0;
		int tempIndex=0;

		System.out.println("Tekrar Sayýlarý");
		int bakilansayi = 0;
        for (int i = 0; i < sayiDizisi.length; i++) {
            int a = 0;
            for (int j = 0; j < sayiDizisi.length; j++) {
                if(sayiDizisi[i]==bakildimi[j])
                {
                    a++;
                }
            }
            if(a == 0 )
            {
                int sayiAdedi = 0;
                for (int t = 0; t < sayiDizisi.length; t++) {
                    if(sayiDizisi[i]== sayiDizisi[t])
                    {
                        sayiAdedi ++;
                    }
                }
                bakildimi[bakilansayi] = sayiDizisi[i];
                bakilansayi ++;
                System.out.println(sayiDizisi[i] + " Sayýsýndan " + sayiAdedi + " tane var ");
                
                    
            }
       }
	}

}

