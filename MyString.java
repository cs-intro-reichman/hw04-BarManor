public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        char[] arr1 = new char[str.length()];
        arr1 = str.toCharArray();
        for (int i=0;i<arr1.length; i++)
        {
            if (((arr1[i] >= 65) && (arr1[i] <= 90))) {
                arr1[i] = (char)(arr1[i] + 32);
            }
        }
        return new String(arr1);
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        char[] arr1 = new char[str1.length()];
        char[] arr2 = new char[str2.length()];
        boolean isContained = false;
        arr1 = str1.toCharArray();
        arr2 = str2.toCharArray();

        if (str1.length() < str2.length()) {
           return false;
        }
        if (str2.length() == 0) {
            return true;
        }

        for(int i=0; i<(arr1.length - arr2.length +1); i++) //runs until we can no longer fit str2 word to what's 
        {                                                   //left of str1 that we are checking.
        if (arr1[i] == arr2[0]) {// only if the first letter is the same        
            if (arr2.length == 1) {
                return true;
            }
            for(int j=1;j<arr2.length;j++){ // if the word is contained, returns True and breaks the loop.
            if(arr1[j+i] == arr2[j])
            {
               isContained = true;
            }
            else{
               isContained = false;
               break;
            }
           }
            if (isContained) { // if we found that smaller is contained, finito la comedia
               break;
        }                                                     
        }      
    }
        return isContained;     
    }
      //boolean var1 = MyString.contains("baba yaga", "baba");
      //boolean var2 = MyString.contains("baba yaga", "");
      //boolean var3 = !MyString.contains("baba yaga", "John Wick is the baba yaga");
      //boolean var4 = !MyString.contains("baba yaga", "Yaga");
      //boolean var5 = !MyString.contains("baba yaga", "babayaga");
}
