/*
String methods
*/ 
class s0323_2312_0021_string {
    public static void main(String[] args) {
        ////////////////////////////// all the below method return new string, these method do not return change the original string 
        String  str = "parth";
        System.out.println(str.length()); //////// 
        System.out.println(str.charAt(2)); ////////////////
        String str1 = "parTh";
        String str2 = "parth";
        System.out.println(str.equals(str1)); //////////
        System.out.println(str.equalsIgnoreCase(str2)); //////////

        System.out.println(str1.compareTo(str2)); ////////////////
        System.out.println(str1.compareToIgnoreCase(str2)); /////////////
        System.out.println(str1.substring(2)); ////////////////
        System.out.println(str1.substring(2,4));/////////////////
        System.out.println(str1.toUpperCase()); /////////////
        System.out.println(str1.toLowerCase()); /////////////
        System.out.println(str1.trim()); /////////////
        System.out.println(str1.replace("pa","chin"));///////////
        System.out.println(str1.contains("pa")); //////////////////
        // str1.startsWith("pas");
        // str1.endsWith("we");
        // str1.isEmpty();
        // str1.isBlank();
        // str1.indexOf("a");
        // str1.lastIndexOf('t');
        


  }
}
