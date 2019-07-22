package cn.itcast;

public class Girl_choose  {
    public static void main(String[] args) {

        Black_Color black_color = new Black_Color();
        Circleshape circleshape = new Circleshape();
        circleshape.setColor(black_color);
        circleshape.draw();

        Blue_Color blue_color = new Blue_Color();
        Rectangleshape rectangleshape = new Rectangleshape();
        rectangleshape.setColor(blue_color);
        rectangleshape.draw();
    }
}
