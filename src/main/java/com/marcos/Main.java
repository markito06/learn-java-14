package com.marcos;

import java.util.ArrayList;

public class Main {

    public static enum DAY_OF_WEEK {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
    public static void main(String[] args) {

        System.out.println(switchExpressions(DAY_OF_WEEK.WEDNESDAY));

        System.out.println(switchExpressions(DAY_OF_WEEK.SUNDAY));

        System.out.println(textBlocks());

        System.out.println(records().toString());

        System.out.println(patternMatchingOfInstanceof(new Tag("teste")).toString());

        helpFulNullPointerExceptions();
    }

    /**
     * JEP 305 : Pattern Matching for instanceof
     * */
    private static Tag patternMatchingOfInstanceof(Object obj){
        if(obj instanceof Tag tag && "teste".equals(tag.tagName())){
            return tag;
        }
        return null;
    }

    /**
     * JEP 325 : Switch Expressions
     * */
    private static String switchExpressions(DAY_OF_WEEK someday){
        return switch(someday){
            case MONDAY,TUESDAY, WEDNESDAY, THURSDAY,FRIDAY -> "Dia da semana";
            case SATURDAY, SUNDAY -> "Fim de semana";
        };
    }

    /**
     * JEP 355 : Text Blocks
     * */
    private static String textBlocks(){
        return """
                SELECT * FROM
                MyTABLE
                WHERE
                ID = ? AND
                DESC = ?
                ORDER   BY ID DESC             
                """;
    }

    /**
     * JEP 358: Helpful NullPointerExceptions
     * */
    private static void helpFulNullPointerExceptions(){
        String [][] matrix = new String [5][5];
        matrix[1] = new String[5];
        if(matrix[1][0].toUpperCase().equals("S")){ //NullPointer
        }
    }

    /**
     * JEP 359: Records
     * */
    private static Product records(){
       ArrayList<Tag> tags = new ArrayList<>();
       tags.add(new Tag("java14 records"));
       Product abc = new Product("abc", 1.00, tags);
       return abc;
    }

}
