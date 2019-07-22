package cn.itcast;

import java.text.CollationElementIterator;

public abstract class Shape {
    public Color color;//引入一个特性

    public void setColor(Color send){// 提供set方法
        this.color=send;
    }

    public abstract void draw();//提供一个抽象方法

}
