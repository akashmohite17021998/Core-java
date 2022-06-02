package com.practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.awt.Point;

public class Microsoft {

	 public int solution(String S, int[] X, int[] Y) {
	        ArrayList<Point> list = new ArrayList<>();
	        for (int i = 0; i < X.length; i++) {
	            list.add(new Point(X[i], Y[i], S.charAt(i)));
	        }

	        list.sort(Comparator.comparingDouble(Point::distance));

	        HashMap<Character, Point> map = new HashMap<>();

	        for (int i = 0; i < list.size(); i++) {
	            Point point = list.get(i);
	            if (map.containsKey(point.getTag())) {
	                Point firstPoint = map.get(point.getTag());
	                return Double.compare(firstPoint.distance(), point.distance()) == 0 ? map.size() - 1 : map.size();
	            } else {
	                map.put(point.getTag(), point);
	            }
	        }

	        return map.size();
	    }
}



