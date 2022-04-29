package com.company.WzorceProjektowe.ChlidrenSingletonCount;

import java.util.List;

public interface ChildrenRepository {
    void addChild(String name);

    List<String> getChildren();

    void sortChildren();

    void removeDuplicates();

    void setNameToUpperCase();

    void setNameToLowerCase();
}