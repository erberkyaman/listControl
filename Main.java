public class Main {
    public static void main(String[] args) {
        int [] list = {1,22,6,14,6,23,23,58,11,5,130,58};

        System.out.println("Tekrar Eden Çift Sayılar : ");
        for (int i=0; i< list.length;i++){
            if(list[i]%2==0){
                for (int j=0; j< list.length;j++){
                    if((i!=j ) && (list[i]==list[j])){
                        System.out.println(list[i]);
                    }

                }
            }

        }

    }
}
