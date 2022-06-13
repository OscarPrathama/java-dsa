package simple;

// beda hasil dengan yang di yt
// https://youtu.be/9kyg1bgPCto?t=1244
public class CalculateInterestSavings {
    
    public static void main(String[] args) {
        double saving = 750_000;
        double interest = 0;
        double interest_count = 0;
        double aside = 0.03;
        double aside_count = 0;
        for (int i = 1; i <= 12; i++) {
            if(i > 1){
                interest = 0.06;
                interest_count = saving*interest;
                saving = saving+interest_count;

                double saving_max = 800_000;
                if(saving >= saving_max){
                    // aside_count = saving*aside;
                    aside_count = saving_max*aside;
                    saving = saving - aside_count;
                }
            }

            System.out.println("======== Month "+i+" ========");
            System.out.println("Tabungan : "+ saving);
            System.out.println("Bunga : "+interest);
            System.out.println("Perhitungan bunga : "+interest_count);
            System.out.println("Sisihan : "+aside);
            System.out.println("Perhitungan Sisihan : "+aside_count);
            System.out.println();
        }
    }

}
