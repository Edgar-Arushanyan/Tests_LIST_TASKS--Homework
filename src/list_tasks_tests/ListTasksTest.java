package list_tasks_tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ListTasksTest {

    private ListTasks listTasks;

    @BeforeEach
    public void init(){
        listTasks = new ListTasks();
    }
    @Test
    public void removeNamesLength4_test_fourIn_twoOut() {
        List<String> actual = Arrays.asList("John", "Pablo", "Ann", "Jack");
        List<String> expected = Arrays.asList("Pablo", "Ann");


                assertEquals(expected,listTasks.removeNamesLength4(actual));
    }

    @Test
    public void removeNames_test_empty(){
        assertEquals(Arrays.asList(), listTasks.removeNamesLength4(Arrays.asList()));
    }

    @Test
    public void removeNames_test_noNamesLength4() {
        List<String> actual = Arrays.asList("Johnn", "Pablo", "Ann", "Jackk");
        List<String> expected = Arrays.asList("Johnn", "Pablo", "Ann", "Jackk");

        assertEquals(expected, listTasks.removeNamesLength4(actual));
    }

    @Test
    public void removeNames_test_allNamesLength4() {
        List<String> actual = Arrays.asList("John", "Pabl", "Anna", "Jack");
        List<String> expected = Arrays.asList();

        assertEquals(expected, listTasks.removeNamesLength4(actual));

    }
    @Test
    public void compare_test_YesNo() {
        List<Integer> ints1 = Arrays.asList(2, 4, 6, 8);
        List<Integer> ints2 = Arrays.asList(5, 4, 6, 9);

        List<String> expected = Arrays.asList("No", "Yes", "Yes", "No");

        assertEquals(expected,listTasks.compareYesNo(ints1 , ints2));

    }


    @Test
    public void compare_test_AllNumbersAre_No() {
        List<Integer> ints1 = Arrays.asList(2, 4, 6, 8);
        List<Integer> ints2 = Arrays.asList(7, 6, 5, 9);

        List<String> expected = Arrays.asList("No", "No", "No", "No");

        assertEquals(expected,listTasks.compareYesNo(ints1 , ints2));

    }

    @Test
    public void compare_test_Yes_or_No() {
        List<Integer> ints1 = Arrays.asList(2, 4, 6, 8);
        List<Integer> ints2 = Arrays.asList(2, 5, 3, 9);

        List<String> expected = Arrays.asList("Yes", "No", "No", "No");

        assertEquals(expected,listTasks.compareYesNo(ints1 , ints2));

    }

    @Test
    public void reversed_test_OneToFive_in_order(){
        List<Integer> actual = Arrays.asList(1,2,3,4,5);
        List<Integer> expected = Arrays.asList(5,4,3,2,1);

        assertEquals(expected,listTasks.reversed(actual));
    }

    @Test
    public void reversed_test_OnesAndTwoTwos_in_order() {
        List<Integer> actual = Arrays.asList(1, 1, 2, 2);
        List<Integer> expected = Arrays.asList(2, 2, 1, 1);

        assertEquals(expected, listTasks.reversed(actual));
    }

    @Test
    public void reversed_OnesAndTwosAntThree_in_order(){
        List<Integer> actual = Arrays.asList  ( 1,1,2,2,3 );
        List<Integer> expected = Arrays.asList( 3,2,2,1,1 );

        assertEquals(expected,listTasks.reversed(actual));
    }

}