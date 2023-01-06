package hust.soict.minh.aims.media.comparator;

import java.util.Comparator;

import hust.soict.minh.aims.media.Media;

public class MediaComparatorTitleCost implements Comparator<Media> {
    @Override
    public int compare(Media o1, Media o2){
        String title1 = o1.getTitle();
        String title2 = o2.getTitle();
        int sComp = title1.compareTo(title2);
        if (sComp != 0) {
            return sComp;
        }
        Double cost1 = o1.getCost();
        Double cost2 = o2.getCost();
        return cost1.compareTo(cost2);
    }
}
