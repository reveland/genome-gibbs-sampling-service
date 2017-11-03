package com.genome.comparer.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Adjacency {

    public int[] index;
    public List<Adjacency> inconflict;

    public Adjacency(int[] index) {
        this.index = index;
        inconflict = new ArrayList<>();
    }

    public int[] getAdjacency() {
        return index;
    }

    public int[] getIndex() {
        return index;
    }

    public void setIndex(int[] index) {
        this.index = index;
    }

    public List<Adjacency> getInconflict() {
        return inconflict;
    }

    public void setInconflict(List<Adjacency> inconflict) {
        this.inconflict = inconflict;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Adjacency adjacency = (Adjacency) o;
        int[] adj1 = adjacency.getAdjacency();
        int[] adj2 = this.getAdjacency();

        return ((adj2[0] == adj1[0] && adj2[1] == adj1[1])
                || (adj2[0] == adj1[1] && adj2[1] == adj1[0]));

    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(index);
        result = 31 * result + (inconflict != null ? inconflict.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return '[' + String.valueOf(index[0]) + ',' + String.valueOf(index[1]) + ']';
    }


}