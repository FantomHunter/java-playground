package com.codehunter.java_demo;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/** Hello world! */
public class App {
  public static void main(String[] args) {
    System.out.println("Hello World!");

    var itemList = new ArrayList<Student>();
    var data = App.class.getClassLoader().getResource("data.txt");
    try (var reader = Files.newBufferedReader(Paths.get(data.toURI()))) {
      String line;
      while ((line = reader.readLine()) != null) {
        var lineArray = line.split(";");
        itemList.add(new Student(lineArray[0], lineArray[1], Integer.parseInt(lineArray[2])));
      }
    } catch (IOException | URISyntaxException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    ;
    itemList.stream().forEach(System.out::println);
    Scanner in = new Scanner(System.in);
    var studentCriteria = new Student(in.next(), in.next(), in.nextInt());
    //    var studentCriteria = new Student("", "thien", 1);
    System.out.println("result found for :" + studentCriteria);
    findStudent(studentCriteria, itemList).stream().forEach(System.out::println);
  }

  private static List<Student> findStudent(Student studentCriteria, ArrayList<Student> itemList) {
    return itemList.stream()
        .filter(student -> isMatchStudent(studentCriteria, student))
        .collect(Collectors.toList());
  }

  private static boolean isMatchStudent(Student studentCriteria, Student student) {
    //    return !studentCriteria.firstname().isBlank() &&
    // student.firstname().contains(studentCriteria.firstname())
    //        || !studentCriteria.lastname().isBlank() &&
    // student.lastname().contains(studentCriteria.lastname());
    return Arrays.stream(Student.class.getDeclaredFields())
        .filter(
            field -> {
              try {
                return Student.class
                    .getMethod(field.getName())
                    .invoke(student)
                    .toString()
                    .contains(
                        Student.class
                            .getMethod(field.getName())
                            .invoke(studentCriteria)
                            .toString());
              } catch (Exception e) {
                e.printStackTrace();
                return false;
              }
            })
        .findAny()
        .isPresent();
  }
}
