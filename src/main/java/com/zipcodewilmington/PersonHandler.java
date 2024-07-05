package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }
    // NOTICE how the comments can be used to step-by-step break down the problem into 
    // simple lines of code...
    public String whileLoop() {
        String result = "";
        int i=0;
        while( i<personArray.length){
            String outcome = String.valueOf((personArray[i]));
            result+=outcome;
            i++;
        }
        return result;

    }

    public String forLoop() {
        String result = "";
        for(int i=0; i<personArray.length; i++){
             String outcome = String.valueOf((personArray[i]));
             result+=outcome;
        }
         return result;
        // identify initial value
        // identify terminal condition
        // identify increment

        // use the above clauses to declare for-loop signature
            // begin loop
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop


    }



    public String forEachLoop() {
        String result = "";
        for ( Person i: personArray) {
            String outcome = i.toString();
            result+=outcome;
        }
        return result;
        // identify array's type
        // identify array's variable-name

        // use the above discoveries to declare for-each-loop signature
            // begin loop
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
