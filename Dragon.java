public class Dragon extends Cow {//inherit from cow class and using its methods.

    boolean fire1;



    public Dragon (String name, String image){//Constructor
        super(name);
        setImage(image);

    }

    public boolean canBreatheFire(){
        fire1=true;
        return fire1;

    }


}