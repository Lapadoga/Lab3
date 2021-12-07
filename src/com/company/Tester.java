package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Tester {
    /**
     * Size of lists
     */
    public long size;
    /**
     * Table with values
     */
    private String[][] tableWithResult;
    /**
     * Time of start
     */
    private long startTime;
    /**
     * Time of end
     */
    private long endTime;

    /**
     * Constructor
     * @param size
     */
    public Tester(long size) {
        this.size = size;
        startTime = 0;
        endTime = 0;
        tableWithResult = new String[][]{{" ", "Add", "Get", "Delete"},
                {"LinkedList", "0", "0", "0"}, {"ArrayList", "0", "0", "0"}};
    }

    /**
     * Method for testing
     * @throws Exception
     */
    public void startTest() throws Exception {
        LinkedList<String> linkedList = new LinkedList<>();
        ArrayList<String> arrayList = new ArrayList<>();
        testAdd(linkedList);
        tableWithResult[1][1] = String.valueOf(endTime - startTime);
        testGet(linkedList);
        tableWithResult[1][2] = String.valueOf(endTime - startTime);
        testDelete(linkedList);
        tableWithResult[1][3] = String.valueOf(endTime - startTime);
        testAdd(arrayList);
        tableWithResult[2][1] = String.valueOf(endTime - startTime);
        testGet(arrayList);
        tableWithResult[2][2] = String.valueOf(endTime - startTime);
        testDelete(arrayList);
        tableWithResult[2][3] = String.valueOf(endTime - startTime);
    }

    /**
     * Method of testing the add function
     * @param list List
     */
    private void testAdd(List<String> list) {
        if (!list.isEmpty()) {
            list.clear();
        }
        startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add("1");
        }
        endTime = System.currentTimeMillis();
    }

    /**
     * Method of testing the get function
     * @param list List
     * @throws Exception If list is empty
     */
    private void testGet(List<String> list) throws Exception {
        if (list.isEmpty()) {
            throw new Exception("The list is empty! It is impossible to get values in an empty list!");
        }
        startTime = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
        endTime = System.currentTimeMillis();
    }

    /**
     * Method of testing the remove function
     * @param list List
     * @throws Exception If list is empty
     */
    private void testDelete(List<String> list) throws Exception {
        if (list.isEmpty()) {
            throw new Exception("The list is empty! It is impossible to remove values in an empty array!");
        }
        startTime = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            list.remove(i);
        }
        endTime = System.currentTimeMillis();
    }

    /**
     * Print of table
     */
    public void table() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%-15s", tableWithResult[i][j]);
            }
            System.out.println();
        }
    }
}
