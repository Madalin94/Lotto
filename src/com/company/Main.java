import java.util.*;

public class Main {
    public static final int NUMBERS = 6;
    public static final int MAX_NUMBER = 49;

    public static void main(String[] args) {
        Set<Integer> winningNumbers = createWinningNumbers();
        Set<Integer> ticket = getTicket();
        System.out.println();

        Set<Integer> intersection = new TreeSet<Integer>(ticket);
        intersection.retainAll(winningNumbers);


        System.out.println("Numerele biletului tau sunt " + ticket);
        System.out.println("Numerele castigatoare sunt " +
                winningNumbers);
        System.out.println();
        System.out.println("Ai avut " + intersection.size() +
                " numere nimerite.");
        if (intersection.size() > 0) {
            double prize = 100 * Math.pow(2, intersection.size());
            System.out.println("Numerele potrivite sunt " +
                    intersection);
            System.out.println("Premiul tau este $Felicitari!" + prize);
        }
    }

    public static Set<Integer> createWinningNumbers() {
        Set<Integer> winningNumbers = new TreeSet<Integer>();
        Random r = new Random();
        while (winningNumbers.size() < NUMBERS) {
            int number = r.nextInt(MAX_NUMBER) + 1;
            winningNumbers.add(number);
        }
        return winningNumbers;
    }
    public static Set<Integer> getTicket() {
        Set<Integer> ticket = new TreeSet<Integer>();
        Scanner console = new Scanner(System.in);
        System.out.print("Scrie " + NUMBERS +
                " numere de lotto: ");
        while (ticket.size() < NUMBERS) {
            int number = console.nextInt();
            ticket.add(number);
        }
        return ticket;
    }
}