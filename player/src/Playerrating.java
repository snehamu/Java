public class Playerrating {

    private int Player_position;
    private  String Player_name;
    private static float Critic_onerating;
    private static float Critic_tworating;
    private static float Critic_threerating;
    private float Average_rating;
    private char Category;

    Playerrating(int Player_position, String Player_name){
        this.Player_position = Player_position;
        this.Player_name = Player_name;
    }

    public Playerrating() {
        Object Playerrating;
    }

    static float calculateAverageRating(float Critic_onerating, float Critic_tworating){
        return Critic_onerating + Critic_tworating;
    }

    static float calculateAverageRating(float Critic_onerating, float Critic_tworating, float Critic_threerating, float Average_rating){
        return Critic_onerating + Critic_tworating + Critic_threerating;
    }

    public float calculateCategory(){
        float Average_rating= (Critic_onerating + Critic_tworating + Critic_threerating) / 3;

        if(Average_rating>8){
            System.out.println("A Category");
        }
        else if(Average_rating<=8 && Average_rating>=5){
            System.out.println("B Category");
        }
        else if(Average_rating<5){
            System.out.println("C Category");
        }
        return Average_rating;
    }

    private static void display(){

    }

    private char Category() {
        return Category;
    }

    private float Average_rating() {
        return Average_rating;
    }
    private float Critic_threerating(float Critic_threerating) {
        return Critic_threerating;
    }
    private float Critic_tworating(float Critic_tworating ) {
        return Critic_tworating;
    }
    private float Critic_onerating(float Critic_onerating) {
        return Critic_onerating;
    }

    private String Player_name(String Player_name) {
        return Player_name;
    }

    private int Player_position(int Player_position) {
        return Player_position;
    }

    public static void main(String[] args) {
        Playerrating p = new Playerrating(5,"Dhoni");
    }

}


