/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package personapplication;

/**
 *
 * @author Rishan Aziz
 */
public class TestProgPerson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Person name = new Person();

        Person emp = new Person("Donald", "Jackson");

        System.out.println("Line 3: name: " + name);

        name.setName("Ashley", "Blair");
        System.out.println("Line 5: name: " + name);

        System.out.println("Line 6: emp: " + emp);

        emp.setName("Sandy", "Smith");
        System.out.println("Line 8: emp: " + emp);
    }

}
