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

// import java.util.List;
// import java.util.Map;

// public class ExerciseRunner {

//     public static void main(String[] args) {
//         System.out.println(WeddingComplex.createBestCouple(
//                 Map.of("Naruto", List.of("Sakura", "Hinata"), "Sasuke", List.of("Sakura", "Hinata")),
//                 Map.of("Sakura", List.of("Sasuke", "Naruto"), "Hinata", List.of("Naruto", "Sasuke"))));
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


// public class ExerciseRunner {

//     public static void main(String[] args) {
//         CelestialObject defaultStar = new CelestialObject();
//         System.out.println(defaultStar.getX());
//         System.out.println(defaultStar.getY());
//         System.out.println(defaultStar.getZ());
//         System.out.println(defaultStar.getName());

//         defaultStar.setName("Terre");
//         defaultStar.setX(0.43);
//         defaultStar.setY(0.98);
//         defaultStar.setZ(1.43);
//         System.out.println(defaultStar.getX());
//         System.out.println(defaultStar.getY());
//         System.out.println(defaultStar.getZ());
//         System.out.println(defaultStar.getName());
//     }
// }


// public class ExerciseRunner {

//     public static void main(String[] args) {
//         CelestialObject defaultStar = new CelestialObject();
//         CelestialObject earth = new CelestialObject("Terre", 1.0, 2.0, 2.0);

//         System.out.println(CelestialObject.getDistanceBetween(defaultStar, earth));
//         System.out.println(CelestialObject.getDistanceBetweenInKm(defaultStar, earth));
//         System.out.println(CelestialObject.KM_IN_ONE_AU);
//     }
// }

// public class ExerciseRunner {

//     public static void main(String[] args) {
//         CelestialObject celestialObject = new CelestialObject();
//         CelestialObject earth = new CelestialObject("Terre", 1.0, 2.0, 2.0);
//         CelestialObject earth1 = new CelestialObject("Terre", 1.00001, -2.0, 2.0);

//         System.out.println(earth.toString());
//         System.out.println(earth1.toString());
//         System.out.println(earth.equals(earth1));
//         System.out.println(earth.equals(celestialObject));

//         System.out.println(earth.hashCode());
//         System.out.println(earth1.hashCode());
//         System.out.println(celestialObject.hashCode());
//     }
// }


// public class ExerciseRunner {

//     public static void main(String[] args) {
//         Star star = new Star();
        
//         System.out.println(star.getName());
//         System.out.println(star.getX());
//         System.out.println(star.getY());
//         System.out.println(star.getZ());
//         System.out.println(star.getMagnitude());
//     }
// }


// public class ExerciseRunner {

//     public static void main(String[] args) {
//         Star star = new Star();
//         Star star2 = new Star();
//         Star proxima = new Star("Proxima", 18.389, 832.32, 218, 0.4);
//         Star proxima2 = new Star("Proxima", 18.388, 832.32, 218, 0.4);
//         Star proxima3 = new Star("Proxima", 18.388, 832.32, 218, 0);
//         CelestialObject kk = new CelestialObject("Proxima", 18.388, 832.32, 218);
        
//         System.out.println(star.toString());
//         System.out.println(proxima.toString());
//         System.out.println(proxima2.toString());
//         System.out.println(star.equals(star2));
//         System.out.println(star.equals(proxima));
//         System.out.println(proxima.equals(star));
//         System.out.println(proxima.equals(kk));
//         System.out.println(kk.equals(proxima));
//         System.out.println(proxima2.hashCode());
//         System.out.println(proxima3.hashCode());
//         System.out.println(kk.hashCode());
//         System.out.println(proxima.hashCode());
//     }
// }


// public class ExerciseRunner {

//     public static void main(String[] args) {
//         Planet earth = new Planet();
//         Planet naboo = new Planet("Naboo", 17.4389, 8349.1, 8943.92, new Star("Betelgeuse", 128.23, -12.82, 32.328, 1289.3));

//         System.out.println(naboo.toString());
//         System.out.println(earth.toString());
//         System.out.println(naboo.getCenterStar().toString());
//     }
// }


// public class ExerciseRunner {

//     public static void main(String[] args) {
//         Character aragorn = new Character("Aragorn", 20);
//         Character uruk = new Character("Uruk", 5);
        
//         System.out.println(aragorn.toString());
//         System.out.println(uruk.toString());
        
//         aragorn.attack(uruk);

//         System.out.println(uruk.toString());
        
//         aragorn.takeDamage(12);

//         System.out.println(aragorn.toString());
//     }
// }


// public class ExerciseRunner {

//     public static void main(String[] args) {
//         System.out.println(Character.printStatus());

//         Character aragorn = new Character("Aragorn", 20);
//         Character uruk = new Character("Uruk", 15);

//         System.out.println(Character.printStatus());

//         Character winner = Character.fight(aragorn, uruk);

//         System.out.println(winner.toString());
//         System.out.println(Character.printStatus());
//     }
// }


// public class ExerciseRunner {

//     public static void main(String[] args) {
//         Character aragorn = new Character("Aragorn", 20);
//         Monster slime = new Monster("Slime", 15);

//         System.out.println(Character.printStatus());

//         Character winner = Character.fight(aragorn, slime);

//         System.out.println(Character.printStatus());
//     }
// }


// public class ExerciseRunner {

//     public static void main(String[] args) {
//         Sorcerer gandalf = new Sorcerer("Gandalf", 20, 5);
//         Character frodon = new Character("Frodon", 20);
//         Sorcerer saroumane = new Sorcerer("saroumane", 10, 3);

//         Character.fight(frodon, saroumane);
        
//         gandalf.heal(frodon);

//         System.out.println(Character.printStatus());
//     }
// }


// public class ExerciseRunner {

//     public static void main(String[] args) {
//         Templar alistair = new Templar("Alistair", 20, 5, 4);
//         Templar roderick = new Templar("Roderick", 10, 3, 2);

//         Character.fight(alistair, roderick);

//         alistair.heal(alistair);

//         System.out.println(Character.printStatus());
//     }
// }


// public class ExerciseRunner {

//     public static void main(String[] args) {
//         Templar alistair = new Templar("Alistair", 18, 2, 4);
//         Sorcerer morrigan = new Sorcerer("Morrigan", 21, 5);
//         Monster dragon = new Monster("Dragon", 12);

//         dragon.attack(alistair);
//         dragon.attack(morrigan);
        
//         alistair.attack(dragon);
//         morrigan.attack(dragon);

//         System.out.println(Character.printStatus());
//     }
// }


// public class ExerciseRunner {

//     public static void main(String[] args) {
//         Weapon narsil = new Weapon("Narsil", 15);
//         Weapon baguette = new Weapon("Baguette magique", 20);
//         Weapon massue = new Weapon("Massue", 8);
//         Monster troll = new Monster("Troll", 30,  massue);
//         Sorcerer dumbledore = new Sorcerer("Dumbledore", 25, 5, baguette);
//         Templar alistair = new Templar("Alistair", 18, 2, 3, narsil);

//         Character.fight(alistair, troll);

//         System.out.println(Character.printStatus());
//     }
// }

// public class ExerciseRunner {

//     public static void main(String[] args) throws DeadCharacterException {
//         Sorcerer roro = new Sorcerer("roro",10, 0, null);
//         Weapon feu = new Weapon("Boule de feu", 7);
//         Sorcerer triss = new Sorcerer("Triss Merigold", 30, 5, feu); 
//         Templar geralt = new Templar("Geralt de Riv", 28, 2, 5, feu); 
//         DeadCharacterException exceptionTriss = new DeadCharacterException(triss);
//         DeadCharacterException exceptionGeralt = new DeadCharacterException(geralt);
//         DeadCharacterException exception32 = new DeadCharacterException(roro);
        
//         System.out.println(exceptionTriss.getMessage());
//         System.out.println(exception32.getMessage());
//         System.out.println(exceptionGeralt.getMessage());
//     }
// }


// public class ExerciseRunner {

//     public static void main(String[] args) {
//         Weapon excalibur = new Weapon("Excalibur", 7);
//         Weapon baton = new Weapon("Baton", 3);
//         Templar arthur = new Templar("Arthur", 30, 5, 3, excalibur);
//         Sorcerer merlin = new Sorcerer("Merlin", 28, 2, baton);

//         try {
//             arthur.takeDamage(50);
//         } catch (DeadCharacterException e) {
//             System.out.println(e.getMessage());
//         }

//         try {
//             arthur.takeDamage(2);
//         } catch (DeadCharacterException e) {
//             System.out.println(e.getMessage());
//         }
//         try {
//             arthur.attack(merlin);
//         } catch (DeadCharacterException e) {
//             System.out.println(e.getMessage());
//         }
//     }
// }

import java.util.List;

public class ExerciseRunner {

    public static void main(String[] args) {
        Galaxy galaxy = new Galaxy();
        CelestialObject lune = new CelestialObject("Lune", -123.12, 392.238, 32.31);
        Star betelgeuse = new Star("Betelgeuse", 128.23, -12.82, 32.328, 1289.3);
        Planet naboo = new Planet("Naboo", 17.4389, 8349.1, 8943.92, betelgeuse);
        
        galaxy.addCelestialObject(lune);
        galaxy.addCelestialObject(betelgeuse);
        galaxy.addCelestialObject(naboo);
        
        List<CelestialObject> celestialObjects = galaxy.getCelestialObjects();
        
        for (CelestialObject celestialObject : celestialObjects) {
            System.out.println(celestialObject.toString());
        }
    }
}