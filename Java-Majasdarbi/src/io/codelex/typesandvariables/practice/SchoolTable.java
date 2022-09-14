package io.codelex.typesandvariables.practice;

import java.sql.Array;

public class SchoolTable {
    public static void main(String[] args) {
        //Course names
        String[] allCourses = {"English III","Precalculus","Music Theory","Biotechnology",
                "Principles of Technology I","Latin II","AP US History","Business Computer Information Systems" };

        //Teachers
        String[] allTeachers = {"Ms. Lapan","Mrs. Gideon","Mr. Davis","Ms. Palmer","Ms. Garcia","Mrs. Barnett",
                "Ms. Johannessen","Mr. James"};
        //Create table
        int numberingLength = 5;
        int longestCourseName = allCourses[7].length();
        int longestTeacherName = allTeachers[6].length();
        int totalTableWidth = numberingLength + longestTeacherName + longestCourseName;
        int totalTableHeight = 10;
        int teachers = 0;
        StringBuilder table = new StringBuilder();
        for(int i = 0; i < totalTableHeight;i++){
            if(i == 0){
                table.append("+").append("-".repeat(totalTableWidth)).append("+");
            }else if(i == totalTableHeight - 1){
                table.append("+").append("-".repeat(totalTableWidth)).append("+");
            }else {
                table.append("| ").append(teachers + 1).append(" |").append(" ".repeat(longestTeacherName - allTeachers[teachers].length())).append(allTeachers[teachers]);
                table.append("|").append(" ".repeat(longestCourseName - allCourses[teachers].length())).append(allCourses[teachers]).append("|");
                teachers++;
            }
            table.append("\n");
        }
        System.out.println(table);
    }
}
