package stringClassMethod;

public class Length {
    public static void main(String[] args) {
        String name = " abcdefg ";
        // if String is null its shows null pointer exception //String name = null;
        String email =" abcdefg@gmail.com";
        String password = " abc@123";
        System.out.println(" string legth method is used its show length in int value =" +name.length());
        System.out.println(" name ="+ name.length());
        System.out.println(" email"+email.length());
        System.out.println("passware" +password.length());

        System.out.println(" if i want to check length is empty or not  then ");

        int i = name.length();
        if (i == 0){
            System.out.println("name length is empty");
        }else {
            System.out.println(" name length is not empty = "+ i +" character is there");
        }

        System.out.println(" we use isEmpty()  method also for chacking length  ");
        System.out.println(" its show only boolean value like true or false ");
        System.out.println(" name in isEmpty() method  " + name.isEmpty());
        if (name.isEmpty()==true){
            System.out.println("ans true ="+ name.isEmpty());
        }else {
            System.out.println(" ans false = "+ name.isEmpty());
        }

        System.out.println(" ** trim () method ** " );
        System.out.println(" trim() method  1st its can not check front or back value having only space valur like \" String name =\"   abc   \"'; "  );
        System.out.println("2d ith cannot count space value like \' String name= \" \";");
        System.out.println(" its shows value in form of string ");
        System.out.println(" its count center space value like \' String name =\"___abc...xyz___\" ;  ");
        String s = name.trim();
        System.out.println(" ans trim "+ s);

        if ( name.trim().length()==0){
            System.out.println("name.trim().length() =  "+ name.trim().length());
        }
        else {
            System.out.println("name.trim().length() =  "+ name.trim().length());
        }


        System.out.println(" ***  equals() ***   its return boolean type like true or false");

        String s1 = " deepak";
        String s2 = " amit";
        System.out.println("s1 or s2  false = " +s1.equals(s2));
        System.out.println("s1 is empty  false = " +s1.equals(""));

        String s3 = " deepak";
        System.out.println(" sd1 or s3 true = "+s1.equals(s3));
        System.out.println(" ** equalsIgonorcase()");
        String s4 = " Deepak";
        System.out.println("s1 or s4 " +s1.equalsIgnoreCase(s4));
        String s5 = "";

        String f1 = "A";
        String f2 = "A";
        char f3 ='a';
        System.out.println(f1.compareTo(f2));




    }
}
