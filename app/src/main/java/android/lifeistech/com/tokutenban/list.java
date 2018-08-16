package android.lifeistech.com.tokutenban;

public class list {
    public int point1 = 0;
    public int point2 = 0;


    public list(int point1,int point2){
        this.point1 = point1;
        this.point2 = point2;
    }

    public void swap(){
        int tmp;
        tmp =this.point1;

        point1=point2;
        point2=tmp;



    }

}