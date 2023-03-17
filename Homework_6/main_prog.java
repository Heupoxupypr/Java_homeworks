// -1 - стена, -2 - озеро, -3 - выход

package java_projects.Java_homeworks.Homework_6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class main_prog {
  public static void main(String[] args) {

    var mg = new MapGenerator();

    System.out.println(
        new MapPrinter().rawData(
            mg.getMap())

    );

    var lee = new WaveAlgorithm(mg.getMap());

    lee.Colorize(new Point2D(3, 3));

    System.out.println(
        new MapPrinter().rawData(
            mg.getMap())

    );
    System.out.println(lee.getRoad(new Point2D(10, 10)).toString());

  }
}

class Point2D {
  int x, y;

  public Point2D(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  @Override
  public String toString() {
    return String.format("x: %d  y: %d\n", x, y);
  }
}

// Класс генерации карты
class MapGenerator {
  int[][] map;

  // конструктор класса
  public MapGenerator() {
    int[][] map = {
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 00, 00, 00, -1, 00, 00, 00, 00, 00, 00, 00, 00, 00, -1 },
        { -1, 00, 00, 00, 00, 00, 00, -1, 00, 00, 00, 00, 00, 00, -1 },
        { -1, 00, 00, 00, -1, 00, 00, -1, 00, 00, 00, 00, 00, 00, -1 },
        { -1, 00, 00, 00, -1, 00, -1, -1, -1, -1, 00, 00, 00, 00, -1 },
        { -1, 00, 00, 00, -1, 00, -1, 00, 00, -1, 00, 00, 00, 00, -1 },
        { -1, -1, -1, 00, -1, 00, -1, 00, 00, -1, 00, 00, 00, 00, -1 },
        { -1, 00, 00, 00, -1, 00, -1, 00, 00, -1, -1, -1, 00, 00, -1 },
        { -1, 00, 00, 00, -1, 00, 00, 00, 00, -1, 00, 00, 00, 00, -1 },
        { -1, 00, 00, 00, -1, 00, 00, 00, 00, -1, 00, 00, 00, 00, -1 },
        { -1, 00, 00, 00, -1, -1, -1, -1, -1, -1, 00, 00, 00, 00, -1 },
        { -1, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, -1 },
        { -1, 00, 00, 00, -1, -1, -1, -1, -1, -1, -1, 00, 00, 00, -1 },
        { -1, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 }
    };

    this.map = map;
  }

  // Метод получения карты
  public int[][] getMap() {
    return map;
  }

  // Метод установки стены на карту
  public void setWall(Point2D pos) {
    map[pos.x][pos.y] = -1;
  }

  // Метод установки озера на карту
  public void setLake(Point2D pos) {
    map[pos.x][pos.y] = -2;
  }

  // Метод установки выхода на карту
  public void setExit(Point2D pos) {
    map[pos.x][pos.y] = -3;
  }
}

// Класс вывода карты на экран
class MapPrinter {

  public MapPrinter() {
  }

  public String rawData(int[][] map) {
    StringBuilder sb = new StringBuilder();

    for (int row = 0; row < map.length; row++) {
      for (int col = 0; col < map[row].length; col++) {
        sb.append(String.format("%5d", map[row][col]));
      }
      sb.append("\n");
    }
    for (int i = 0; i < 3; i++) {
      sb.append("\n");
    }

    return sb.toString();
  }

  // Метод для красивового вывода карты на экран
  public String mapColor(int[][] map) {
    StringBuilder sb = new StringBuilder();

    for (int row = 0; row < map.length; row++) {
      for (int col = 0; col < map[row].length; col++) {
        switch (map[row][col]) {
          case 0:
            sb.append(" ");
            break;
          case -1:
            if ((row == 0) || (row == map.length - 1)) {
              sb.append("-");
            } else if ((col == 0) || (col == map[row].length - 1)) {
              sb.append("|");
            } else if ((map[row][col - 1] == -1) || (map[row][col + 1] == -1)) {
              sb.append("-");
            } else if ((map[row - 1][col] == -1) || (map[row + 1][col] == -1)) {
              sb.append("|");
            } else
              sb.append("=");
            break;
          case -2:
            sb.append("O");
            break;
          case -3:
            sb.append("E");
            break;
          default:
            break;
        }
      }
      sb.append("\n");
    }
    for (int i = 0; i < 3; i++) {
      sb.append("\n");
    }
    return sb.toString();
  }
}

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

    // System.out.println("End point "+ exit.toString() + " " + map[exit.x][exit.y] +
    // " " + map[exit.x - 1][exit.y] + " " + map[exit.x][exit.y - 1] + 
    // " " + map[exit.x + 1][exit.y] + " " + map[exit.x][exit.y + 1]);

    System.out.println("End point "+ exit.toString() + " " + map[exit.x][exit.y]);

    if ((map[exit.x][exit.y] != -1) && (map[exit.x][exit.y] != 0)) {
      road.add(new Point2D(exit.x, exit.y));
      while (map[exit.x][exit.y] != 1) {
        if (map[exit.x][exit.y] -1 == map[exit.x - 1][exit.y]) {
          road.add(new Point2D(exit.x - 1, exit.y));
          exit = new Point2D(exit.x - 1, exit.y);
          System.out.println(exit.toString() + " " + map[exit.x][exit.y]);
        } else if (map[exit.x][exit.y] - 1 == map[exit.x][exit.y + 1]) {
          road.add(new Point2D(exit.x, exit.y + 1));
          exit = new Point2D(exit.x, exit.y + 1);
          System.out.println(exit.toString() + " " + map[exit.x][exit.y]);
        } else if (map[exit.x][exit.y] - 1 == map[exit.x + 1][exit.y]) {
          road.add(new Point2D(exit.x + 1, exit.y));
          exit = new Point2D(exit.x + 1, exit.y);
          System.out.println(exit.toString() + " " + map[exit.x][exit.y]);
        } else if (map[exit.x][exit.y] - 1 == map[exit.x][exit.y - 1]) {
          road.add(new Point2D(exit.x, exit.y - 1));
          exit = new Point2D(exit.x, exit.y - 1);
          System.out.println(exit.toString() + " " + map[exit.x][exit.y]);
        }

      }
    } else
      road.add(new Point2D(-1, -1));

    return road;
  }
}