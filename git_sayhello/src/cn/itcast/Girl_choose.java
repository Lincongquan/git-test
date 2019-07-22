package cn.itcast;

public class Girl_choose  {
    public static void main(String[] args) {
        //黑色包包
        Black_Color black_color = new Black_Color();
        Circleshape circleshape = new Circleshape();
        circleshape.setColor(black_color);
        circleshape.draw();
        //蓝色包包
        Blue_Color blue_color = new Blue_Color();
        Rectangleshape rectangleshape = new Rectangleshape();
        rectangleshape.setColor(blue_color);
        rectangleshape.draw();
    }
}
