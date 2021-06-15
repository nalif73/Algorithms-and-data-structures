package ru.geekbrains;

import java.util.Stack;

public class Test7 {

    public static void main(String[] args) {


        showShortPath();
    }

    private static void showShortPath() {

        Graph graph = new GraphImpl(10);
        graph.addVertex("Москва");
        graph.addVertex("Тула");
        graph.addVertex("Рязань");
        graph.addVertex("Калуга");
        graph.addVertex("Тамбов");
        graph.addVertex("Липецк");
        graph.addVertex("Орел");
        graph.addVertex("Саратов");
        graph.addVertex("Курск");
        graph.addVertex("Воронеж");

        graph.addEdge("Москва","Тула");
        graph.addEdge("Москва","Рязань");
        graph.addEdge("Москва","Калуга");
        graph.addEdge("Тула","Липецк");
        graph.addEdge("Рязань","Тамбов");
        graph.addEdge("Калуга","Орел");
        graph.addEdge("Липецк","Воронеж");
        graph.addEdge("Тамбов","Саратов");
        graph.addEdge("Орел","Курск");
        graph.addEdge("Саратов","Воронеж");
        graph.addEdge("Курск","Воронеж");


       Stack<String> path = graph.findShortPathViaBfs("Москва", "Орел");

            System.out.println("Short path");


            StringBuilder sb = new StringBuilder();
            boolean isFirst = true;

            while ( !path.isEmpty() ) {
                if (!isFirst) {
                    sb.append(" -> ");
                }
                isFirst = false;
                sb.append(path.pop());
            }

            System.out.println(sb);





    }



}
