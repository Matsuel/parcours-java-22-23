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

public class ExerciseRunner {
    public static void main(String[] args) {
        int[] array = ComputeArray.computeArray(new int[]{9, 13, 8, 23, 1, 0, 89});
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}