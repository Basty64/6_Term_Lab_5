package builder.creators.Literature;
import java.util.ArrayList;

    public interface RandCreate {

        public default int getRandomIndex(ArrayList<?> list){return getRandomInteger(list.size());}

        public static  int getRandomInteger(int edge){
            return (int)(Math.random()*edge);
        }

    }
