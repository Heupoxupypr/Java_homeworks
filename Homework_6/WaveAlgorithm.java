package java_projects.Java_homeworks.Homework_6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

// Класс подсчета шагов по волновому алгоритму
class WaveAlgorithm {
    int[][] map;

    // При объявлении экземпляра класса, он должен на вход получать карту
    public WaveAlgorithm(int[][] map) {
        this.map = map;
    }

    public void Colorize(Point2D startPoint) {
        // Создаем очередь для записи шагов волнового алгоритма
        Queue<Point2D> queue = new LinkedList<Point2D>();
        // Помещаем стартовую точку в очередь
        queue.add(startPoint);
        // устанавливаем значение шака в стартовой точке 1
        map[startPoint.x][startPoint.y] = 1;

        // цикл опустошения очереди
        while (queue.size() != 0) {
            // извлекаем из очереди следующий элемент
            Point2D p = queue.remove();

            // если поле левее текущего не равно 0
            // помещаем его в очередь и записываем значение шага в ячейку увеличенное на 1
            if (map[p.x - 1][p.y] == 0) {
                queue.add(new Point2D(p.x - 1, p.y));
                map[p.x - 1][p.y] = map[p.x][p.y] + 1;
            }
            // если поле выше текущего не равно 0
            // помещаем его в очередь и записываем значение шага в ячейку увеличенное на 1
            if (map[p.x][p.y - 1] == 0) {
                queue.add(new Point2D(p.x, p.y - 1));
                map[p.x][p.y - 1] = map[p.x][p.y] + 1;
            }
            // если поле правее текущего не равно 0
            // помещаем его в очередь и записываем значение шага в ячейку увеличенное на 1
            if (map[p.x + 1][p.y] == 0) {
                queue.add(new Point2D(p.x + 1, p.y));
                map[p.x + 1][p.y] = map[p.x][p.y] + 1;
            }
            // если поле ниже текущего не равно 0
            // помещаем его в очередь и записываем значение шага в ячейку увеличенное на 1
            if (map[p.x][p.y + 1] == 0) {
                queue.add(new Point2D(p.x, p.y + 1));
                map[p.x][p.y + 1] = map[p.x][p.y] + 1;
            }
        }
    }

    // метод поиска маршрута до переданной точки выхода
    public ArrayList<Point2D> getRoad(Point2D exit) {
        ArrayList<Point2D> road = new ArrayList<>();

        // System.out.println("End point "+ exit.toString() + " " + map[exit.x][exit.y]
        // +
        // " " + map[exit.x - 1][exit.y] + " " + map[exit.x][exit.y - 1] +
        // " " + map[exit.x + 1][exit.y] + " " + map[exit.x][exit.y + 1]);

        System.out.println("End point " + exit.toString());

        if ((map[exit.x][exit.y] != -1) && (map[exit.x][exit.y] != 0)) {
            road.add(new Point2D(exit.x, exit.y));
            while (map[exit.x][exit.y] != 1) {
                if (map[exit.x][exit.y] - 1 == map[exit.x - 1][exit.y]) {
                    road.add(new Point2D(exit.x - 1, exit.y));
                    exit = new Point2D(exit.x - 1, exit.y);
                    // System.out.println(exit.toString() + " " + map[exit.x][exit.y]);
                } else if (map[exit.x][exit.y] - 1 == map[exit.x][exit.y + 1]) {
                    road.add(new Point2D(exit.x, exit.y + 1));
                    exit = new Point2D(exit.x, exit.y + 1);
                    // System.out.println(exit.toString() + " " + map[exit.x][exit.y]);
                } else if (map[exit.x][exit.y] - 1 == map[exit.x + 1][exit.y]) {
                    road.add(new Point2D(exit.x + 1, exit.y));
                    exit = new Point2D(exit.x + 1, exit.y);
                    // System.out.println(exit.toString() + " " + map[exit.x][exit.y]);
                } else if (map[exit.x][exit.y] - 1 == map[exit.x][exit.y - 1]) {
                    road.add(new Point2D(exit.x, exit.y - 1));
                    exit = new Point2D(exit.x, exit.y - 1);
                    // System.out.println(exit.toString() + " " + map[exit.x][exit.y]);
                }

            }
        } else
            road.add(new Point2D(-1, -1));

        return road;
    }
}
