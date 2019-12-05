
    public class IceDragon extends Dragon {//inherit dragon use the method in Cow class.

        public IceDragon(String name,String image){
            super(name, image);
            setImage(image);
        }

        public boolean canBreatheFire(){
            fire1=false;
            return fire1;
        }
    }

