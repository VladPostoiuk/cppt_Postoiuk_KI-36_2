package ship;
import static java.lang.System.out;
public class ShipApp {
public static void main(String[] args) {
Ship ship = new Ship(11,50,5,75);
Ship ship1 = new Ship(12,50,5,75);
Ship ship2 = new Ship(13,50,5,75);
Ship ship3 = new Ship(14,50,5,75);
Ship ship4 = new Ship(15,50,5,75);
Ship ship5 = new Ship(16,50,5,75);
Ship ship6 = new Ship(17,50,5,75);
System.out.println(Ship.max);
/* out.println("Поточний об'єм палива - " + ship.GetCurrentFuelVolume());
out.println("Пройдена відстань - " + ship.GetPassedDistance());
ship.SetCurrentSpeed(12);
ship.Run(5);
out.println("Поточний об'єм палива - " + ship.GetCurrentFuelVolume());
out.println("Пройдена відстань - " + ship.GetPassedDistance());
out.println("Поточна швидкість - " + ship.GetCurrentSpeed());
*/
}
}