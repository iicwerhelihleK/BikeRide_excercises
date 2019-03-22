package bicycles;

import bicycles.models.RoadBike;

import java.util.ArrayList;
import java.util.List;

public class FunRide {
    private int maxNumberOfBikes;
    List<Bicycle>nameOfBikes = new ArrayList<>();

    public FunRide(int maxNumberOfBikes) {
        this.maxNumberOfBikes = maxNumberOfBikes;
    }

    public void acceptMethod(Bicycle bicycle){
        if(nameOfBikes.size() < maxNumberOfBikes ){
            nameOfBikes.add(bicycle);
        }
    }

    public int getCountForType(BicycleType bicycleType){
        int numberOfBikeType = 0;
        for(Bicycle bike: nameOfBikes){
            if(bike.getBicycleType() == bicycleType){
                numberOfBikeType++;
            }

        }
        return numberOfBikeType;

    }

    public int getEnteredCount(){
        return nameOfBikes.size();
    }


}
