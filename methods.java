public class methods {
    public static void main(String[] args) {
        display("tim",calculatehighscore(1500));
        display("Sri ram",calculatehighscore(900));
        display("ram",calculatehighscore(400));
        display("Sri ",calculatehighscore(50));
    }
    public static void display(String name,int highScore){
        System.out.println(name+" managed to get into position "+highScore+" on the high score table");
    }

    public static int calculatehighscore(int score) {
        if(score>1000){
            return 1;
        }else if(score > 500 && score <1000 ){
            return 2;
        }else if(score > 100 && score <500){
            return 3;
        }else{
            return 4;
        }

    }
}
