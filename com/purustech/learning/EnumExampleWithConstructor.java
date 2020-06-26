package com.purustech.learning;

public class EnumExampleWithConstructor {

    public static void main(String[] args) {
        // to access the enum value
        System.out.println("Severity of issue is " + BugSeverity.LOW);

        // in switch case statement, we can use
        BugSeverity bugSeverity = BugSeverity.LOW;
        switch (bugSeverity){
            case HIGH:
                System.out.println("Severity of issue is high");
                break;
            case MEDIUM:
                System.out.println("Severity of issue is medium");
        }

        // we can use the static values method which compiler automatically adds when enum is created
        // which returns an array of values defined in enum
        for(BugSeverity sev: BugSeverity.values()){
            System.out.println("Value defined : " + sev);
        }

        // to access the single field value
        System.out.println("Severity weight of HIGH value is " + BugSeverity.HIGH.getSeverityWeightValue());
        System.out.println("Severity weight of HIGH value is " + BugSeverity.HIGH.severityWeight);
    }
}

enum BugSeverity {
   LOW (2) ,
   MEDIUM (5),
   HIGH (10);

   Integer severityWeight;

   BugSeverity(Integer severityWeight){
       this.severityWeight = severityWeight;
   }
   // it can have fields also
   Integer totalSeverities = 3;

   public Integer getSeverityWeightValue(){
       return severityWeight;
   }

   // it can contain methods also
    public BugSeverity getHighSeverity(){
       return HIGH;
    }
}