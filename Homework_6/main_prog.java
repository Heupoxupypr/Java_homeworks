// -1 - стена, -2 - озеро, -3 - выход

package java_projects.Java_homeworks.Homework_6;

public class main_prog {
  public static void main(String[] args) {

    var mg = new MapGenerator();

    System.out.println(
        new MapPrinter().rawData(
            mg.getMap())

    );

    // System.out.println(
    //     new MapPrinter().mapColor(
    //         mg.getMap())

    // );

    var lee = new WaveAlgorithm(mg.getMap());

    lee.Colorize(new Point2D(2, 11));

    System.out.println(
        new MapPrinter().rawData(
            mg.getMap())

    );
    System.out.println(lee.getRoad(new Point2D(1, 1)).toString());

  }
}







