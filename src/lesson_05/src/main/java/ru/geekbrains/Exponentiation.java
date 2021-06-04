package ru.geekbrains;

public class Exponentiation {

    public static void main(String[] args) {
        float x = -2;
        float y = -8;

        System.out.printf("%s в степени %s равно %s", x, y, inDegree(x, y));

    }

    public static float inDegree(float x, float y) {

        if (y == 1) return x;
        if (y == -1) return 1 / x;
        if (y >= 1) {
            return x * inDegree(x, y - 1);
        } else {
            return (1 / x * inDegree(x, y + 1));
        }
    }

}
