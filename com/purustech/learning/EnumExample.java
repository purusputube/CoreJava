package com.purustech.learning;

public class EnumExample {

    public static void main(String[] args) {
        // to access the enum value
        System.out.println("Severity of issue is " + Severity.LOW);

        // in switch case statement, we can use
        Severity bugSeverity = Severity.LOW;

        switch (bugSeverity){
            case HIGH:
                System.out.println("Severity of issue is high");
                break;
            case MEDIUM:
                System.out.println("Severity of issue is medium");
                break;
        }

        // we can use the static values method which compiler automatically adds when enum is created
        // which returns an array of values defined in enum
        for(Severity sev: Severity.values()){
            System.out.println("Value defined : " + sev);
        }
        System.out.println(Severity.LOW.totalSeverities);
    }
}

enum Severity {
   LOW ,
   MEDIUM ,
   HIGH ;

   // it can have fields also
   Integer totalSeverities = 3;

   // it can contain methods also
    public Severity getHighSeverity(){
       return HIGH;
    }
}