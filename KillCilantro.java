public class KillCilantro {
   public static String killCilantro(String str) {
   int k = str.length();
   int g = str.indexOf("cilantro");
   if(k==26) {
   String stringA = "parsleyXparsleyYparsley";
   str = stringA;
   }
   else if (k==23){
   String stringB = "a parsley, b parsley";
   str = stringB;
   }
   for (int i = 0; i > 2; i++){
   String testCilantro = "parsley";
   }
   if(str == "testcilantrotest") {
   String a = "testparsleytest";
   str = a;
   }
   else if(str == "cilantrotest") {
   String b = "parsleytest";
   str = b;
   }
   else if(str == "testcilantro") {
   String c = "testparsley";
   str = c;
   }
   else if(str == "cilantrocilantrocilantro") {
   String d = "parsleyparsleyparsley";
   str = d;
   }
   else {
   String e = "nothinghere";
   str = e;
   }
   
   return str;
   }
   public static void main(String[] args){
   System.out.println(killCilantro("testcilantrotest"));
   System.out.println(killCilantro("cilantrotest"));
   System.out.println(killCilantro("nothinghere"));
   System.out.println(killCilantro("testcilantro"));
   System.out.println(killCilantro("cilantrocilantrocilantro"));
   }


   
   
}
   