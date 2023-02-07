// public class ExerciseRunner {
//     public static void main(String[] args) {
//         System.out.println(HelloWorld.helloWorld());
//     }
// }

// public class ExerciseRunner {
//     public static void main(String[] args) {
//         System.out.println("Add");
//         System.out.println(IntOperation.addTwoIntegers(1, 2));
//         System.out.println(IntOperation.addTwoIntegers(15, 68));
        
//         System.out.println("Subtract");
//         System.out.println(IntOperation.subtractTwoIntegers(4, 1));
//         System.out.println(IntOperation.subtractTwoIntegers(10, 23));
        
//         System.out.println("Multiply");
//         System.out.println(IntOperation.multiplyTwoIntegers(3, 6));
//         System.out.println(IntOperation.multiplyTwoIntegers(12, 11));
        
//         System.out.println("Divide");
//         System.out.println(IntOperation.divideTwoIntegers(8, 2));
//         System.out.println(IntOperation.divideTwoIntegers(13, 4));
//     }
// }


// public class ExerciseRunner {
//     public static void main(String[] args) {
//         System.out.println("Add");
//         System.out.println(FloatOperation.addTwoFloats(1.0f, 2.5f));
//         System.out.println(FloatOperation.addTwoFloats(15.18f, 68.28347f));

//         System.out.println("Divide");
//         System.out.println(FloatOperation.divideTwoFloats(7.0f, 2.0f));
//         System.out.println(FloatOperation.divideTwoFloats(5.6f, 6.9f));
//     }
// }


// public class ExerciseRunner {
//     public static void main(String[] args) {
//         System.out.println(Chifoumi.getActionBeatenBy(ChifoumiAction.ROCK));
//         System.out.println(Chifoumi.getActionBeatenBy(ChifoumiAction.PAPER));
//         System.out.println(Chifoumi.getActionBeatenBy(ChifoumiAction.SCISSOR));
//     }
// }


// public class ExerciseRunner {
//     public static void main(String[] args) {
//         System.out.println(StringLength.getStringLength("Hello World !"));
//         System.out.println(StringLength.getStringLength(""));
//     }
// }


// public class ExerciseRunner {
//     public static void main(String[] args) {
//         System.out.println(StringConcat.concat("Hello ", "étudiant !"));
//         System.out.println(StringConcat.concat("", "Hello World !"));
//     }
// }


// public class ExerciseRunner {
//     public static void main(String[] args) {
//         System.out.println(StringContain.isStringContainedIn("Hell", "Highway to Hell"));
//         System.out.println(StringContain.isStringContainedIn("Hell", "Hello World !"));
//         System.out.println(StringContain.isStringContainedIn("Bonjour", "hello World !"));
//     }
// }

// public class ExerciseRunner {
//     public static void main(String[] args) {
//         System.out.println(Palindrome.isPalindrome("ressasser"));
//         System.out.println(Palindrome.isPalindrome("Bonjour"));
//         System.out.println(Palindrome.isPalindrome("AbBa"));
//     }
// }

// public class ExerciseRunner {
//     public static void main(String[] args) {
//         int[] array = ComputeArray.computeArray(new int[]{9, 13, 8, 23, 1, 0, 89});
//         for (int i : array) {
//             System.out.print(i + " ");
//         }
//     }
// }

// import java.util.List;

// public class ExerciseRunner {

//     public static void main(String[] args) {
//         System.out.println(ListContains.containsValue(List.of(9, 13, 8, 23, 1, 0, 89), 8));
//         System.out.println(ListContains.containsValue(List.of(9, 13, 8, 23, 1, 0, 89), 10));
//     }
// }


// import java.util.List;

// public class ExerciseRunner {
//     public static void main(String[] args) {
//         System.out.println(ListSearchIndex.findLastIndex(List.of(9, 13, 89, 8, 23, 1, 0, 89), 85));
//         System.out.println(ListSearchIndex.findFirstIndex(List.of(9, 13, 89, 8, 23, 1, 0, 89), 87809));
//         System.out.println(ListSearchIndex.findAllIndexes(List.of(9, 13, 89, 8, 23, 1, 0, 89), 9).toString());
//         System.out.println(ListSearchIndex.findAllIndexes(List.of(43784, 327, 1903, 3847, 327, 327, 3289, 89), 327).toString());
//     }
// }


// import java.util.List;

// public class ExerciseRunner {
//     public static void main(String[] args) {
//         System.out.println(ListEqual.areListEquals(List.of("Alice", "Bob", "Charly", "Emily"), List.of("Alice", "Bob", "Charly", "Emily")));
//         System.out.println(ListEqual.areListEquals(List.of("Alice", "Bob", "Charly", "Emily"), List.of("Alice", "Bob", "Emily", "Charly")));
//     }
// }


// public class ExerciseRunner {
//     public static void main(String[] args) {
//         System.out.println(ParseDate.parseIsoFormat("2022-04-25T20:51:28.709039322"));
//         System.out.println(ParseDate.parseFullTextFormat("lundi 25 avril 2022"));
//         System.out.println(ParseDate.parseTimeFormat("09 heures du soir, 07 minutes et 23 secondes"));
//     }
// }


// import java.time.LocalDate;
// import java.time.LocalDateTime;
// import java.time.LocalTime;

// public class ExerciseRunner {

//     public static void main(String[] args) {
//         System.out.println(FormatDate.formatToFullText(LocalDateTime.of(2021, 8, 22, 13, 25, 46)));
//         System.out.println(FormatDate.formatSimple(LocalDate.of(2022, 2, 13)));
//         System.out.println(FormatDate.formatIso(LocalTime.of(16, 18, 56, 8495847)));
//     }
// }

// import java.time.LocalDate;
// import java.time.LocalDateTime;
// import java.time.LocalTime;
// import java.time.Duration;
// import java.time.Period;

// public class ExerciseRunner {

//     public static void main(String[] args) {
//         Duration duration = DifferenceBetweenDate.durationBetweenTime(LocalTime.of(12, 54, 32), LocalTime.of(21, 23, 53));
//         System.out.println(duration.toHoursPart() + "H" + duration.toMinutesPart() + "M" + duration.toSecondsPart() + "S");
//         Period period = DifferenceBetweenDate.periodBetweenDate(LocalDate.of(2020, 10, 13), LocalDate.of(2022, 5, 8));
//         System.out.println(period.getYears() + "Y" + period.getMonths() + "M" + period.getDays() + "D");
//         System.out.println(DifferenceBetweenDate.numberOfHoursBetweenDateTime(LocalDateTime.of(2022, 4, 12, 16, 18, 56), LocalDateTime.of(2022, 5, 10, 21, 54, 56)));
//     }
// }


// import java.util.List;

// public class ExerciseRunner {

//     public static void main(String[] args) {
//         System.out.println(Sort.sort(List.of(15, 1, 14, 18, 14, 98, 54, -1, 12)).toString());
//         System.out.println(Sort.sortReverse(List.of(15, 1, 14, 18, 14, 98, 54, -1, 12)).toString());
//     }
// }


// import java.util.Set;

// public class ExerciseRunner {

//     public static void main(String[] args) {
//         System.out.println(KeepTheChange.computeChange(18, Set.of(1, 3, 7)));
//     }
// }


// import java.util.Set;

// public class ExerciseRunner {

//     public static void main(String[] args) {
//         System.out.println(Wedding.createCouple(Set.of("Pikachu", "Dracaufeu", "Tortank"), Set.of("Legolas", "Aragorn", "Gimli")));
//         System.out.println(Wedding.createCouple(Set.of("Pikachu", "Dracaufeu", "Tortank","jack"), Set.of("Legolas", "Aragorn", "Gimli")));
//         System.out.println(Wedding.createCouple(Set.of("Pikachu", "Dracaufeu", "Tortank","jack","erik"), Set.of("Legolas", "Aragorn", "Gimli")));
//     }
// }

// public class ExerciseRunner {

//     public static void main(String[] args) {
//         CelestialObject celestialObject = new CelestialObject();
//         System.out.println(celestialObject.x);
//         System.out.println(celestialObject.y);
//         System.out.println(celestialObject.z);
//         System.out.println(celestialObject.name);
//     }
// }

// public class ExerciseRunner {

//     public static void main(String[] args) {
//         CelestialObject defaultStar = new CelestialObject();
//         System.out.println(defaultStar.x);
//         System.out.println(defaultStar.y);
//         System.out.println(defaultStar.z);
//         System.out.println(defaultStar.name);

//         CelestialObject earth = new CelestialObject("Terre", 0.43, 0.98, 1.43);
//         System.out.println(earth.x);
//         System.out.println(earth.y);
//         System.out.println(earth.z);
//         System.out.println(earth.name);
//     }
// }


public class ExerciseRunner {

    public static void main(String[] args) {
        CelestialObject defaultStar = new CelestialObject();
        System.out.println(defaultStar.getX());
        System.out.println(defaultStar.getY());
        System.out.println(defaultStar.getZ());
        System.out.println(defaultStar.getName());

        defaultStar.setName("Terre");
        defaultStar.setX(0.43);
        defaultStar.setY(0.98);
        defaultStar.setZ(1.43);
        System.out.println(defaultStar.getX());
        System.out.println(defaultStar.getY());
        System.out.println(defaultStar.getZ());
        System.out.println(defaultStar.getName());
    }
}