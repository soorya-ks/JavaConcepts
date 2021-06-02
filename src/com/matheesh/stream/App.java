package com.matheesh.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) throws IOException {

        IntStream.range(1,10).forEach((x) -> System.out.print(x));
        System.out.println();
        IntStream.range(1, 10).skip(4).forEach( x -> System.out.print(x));  // Skips first four elements "forEach(System.out::print)" -> method reference can be used instead of lambda
        System.out.println();
        int sum = IntStream.range(1,10).sum(); // Sums all the elements within the range (1-> inclusive, 10->exclusive)
        System.out.println(sum);
        Stream.of("Zebra", "Apple", "Monkey").sorted().findFirst().ifPresent((x) -> System.out.println(x));

        String[] cars = {"Benz", "Tesla", "Audi", "BMW", "Tata", "Toyota"};
        Stream.of(cars).filter(x -> x.startsWith("T")).sorted().forEach((x) -> System.out.print(x + " "));

        System.out.println();
        Arrays.stream(new int[] {2,3,4,5,6}).map(x -> x*x).average().ifPresent(x -> System.out.println(x));

        List<String> myList = Arrays.asList("Naruto", "AOT", "DBZ", "DemonSlayer");

        myList.stream().map((x) -> x.toLowerCase()).filter(x -> x.startsWith("d")).sorted().forEach(x -> System.out.println(x));

        Stream<String> myString = Files.lines(Paths.get("src/resources/wordFile.txt"));

        myString.sorted().filter(l -> l.length()>6).forEach(l -> System.out.print(l + " "));
        myString.close();

        System.out.print("\nPrinting words containing 'Bo' - ");
        List<String> words = Files.lines(Paths.get("src/resources/wordFile.txt")).filter(x -> x.contains("Bo"))
                .collect(Collectors.toList());
        words.forEach(x -> System.out.print(x + " "));

        System.out.println();

        Stream<String> rows = Files.lines(Paths.get("src/resources/stockDataCsv.txt"));

        int row = (int)rows.map(x -> x.split(",")).filter(x -> x.length>=4).count();  //returns the number of rows has 4 or more values
        rows.close();
        System.out.println("Row count - " + row);

        Stream<String> myRow = Files.lines(Paths.get("src/resources/stockDataCsv.txt")); // stream can be used only one time and needs to be close upon completing operation
        myRow.map(x -> x.split(",")).filter(x-> x.length>3)//.filter(x-> Integer.parseInt(x[1].trim())>15) // something is wrong with this stream operation, check in free time.
                .forEach(x -> System.out.println(x[0].trim() + " " + x[2].trim() + " " + x[3].trim()) );

        myRow.close();
    }
}
