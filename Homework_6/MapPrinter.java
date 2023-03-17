package java_projects.Java_homeworks.Homework_6;

// Класс вывода карты на экран
public class MapPrinter {

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
