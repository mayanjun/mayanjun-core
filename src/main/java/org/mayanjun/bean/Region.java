package org.mayanjun.bean;

import java.io.Serializable;
import java.util.List;

/**
 * @author mayanjun
 * @since 2018/7/9
 */
public class Region implements Serializable {

    private Region parent;

    private String name;

    private String number;

    private List<Region> children;

    public Region() {
    }

    public Region(Region parent, String name, String number, List<Region> children) {
        this.parent = parent;
        this.name = name;
        this.number = number;
        this.children = children;
    }

    public Region(Region parent) {
        this.parent = parent;
    }

    public Region getParent() {
        return parent;
    }

    public void setParent(Region parent) {
        this.parent = parent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public List<Region> getChildren() {
        return children;
    }

    public void setChildren(List<Region> children) {
        this.children = children;
    }
}
