package com.company;

import java.util.HashMap;
import java.util.HashSet;

public class RomeEmpire {

    HashMap<Integer, HashSet<Integer>> map; // saves roads between cities
    HashSet<Integer> candidates;
    HashSet<Integer> cities;

    public RomeEmpire() {
        map = new HashMap<Integer, HashSet<Integer>>();
        cities = new HashSet<Integer>();
        candidates = new HashSet<Integer>();
    }

    private boolean pathExist(int from, int destination) {
        if (!map.containsKey(from))
            return false;

        HashSet<Integer> roads = map.get(from);
        if (roads.contains(destination)) {
            return true;
        }

        for (int road :roads) {
            return pathExist(road, destination);
        }
        return false;
    }

    private void addRoad(int from, int destination) {
        candidates.add(destination);
        cities.add(from);
        cities.add(destination);

        HashSet<Integer> destinations = new HashSet<Integer>();
        if (map.containsKey(from))
            destinations = map.get(from);

        destinations.add(destination);
        map.put(from, destinations);

    }

    private boolean isCapital(int city) {
        for (int c: this.cities) {
            if (c == city)
                continue;

            if (!pathExist(c, city)) {
                return false;
            }
        }

        return true;
    }

    public int solution(int[] a, int[] b) throws Exception {
        if (a.length != b.length)
            throw new Exception("Malformed input: input data count does not match.");

        this.map = new HashMap<Integer, HashSet<Integer>>();
        for (int i = 0; i < a.length; i++) {
            if (!map.containsKey(a[i])) {
                addRoad(a[i], b[i]);
            }
        }

        for(int city : this.candidates) {
            if (isCapital(city)) {
                return city;
            }
        }

        return -1;
    }
}

