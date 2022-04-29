package com.company.WzorceProjektowe.ChlidrenSingletonCount;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class ChildrenRepositoryImpl implements ChildrenRepository {
    private List<String> names = new ArrayList<>();

    @Override
    public void addChild(String name) {
        names.add(name);
        SingletonChildrenCount.getInstance().count();
    }

    @Override
    public List<String> getChildren() {
        return new ArrayList<>(names);
    }

    @Override
    public void sortChildren() {
        Collections.sort(names);
    }

    @Override
    public void removeDuplicates() {
        HashSet namesSet = new HashSet(names);
        names = new ArrayList<>(namesSet);
    }

    @Override
    public void setNameToUpperCase() {
        for (int i = 0; i < names.size(); i++) {
            String result = names.get(i).toUpperCase();
            names.set(i, result);
        }
    }

    @Override
    public void setNameToLowerCase() {
        for (int i = 0; i < names.size(); i++) {
            String result = names.get(i).toLowerCase();
            names.set(i, result);
        }
    }
}