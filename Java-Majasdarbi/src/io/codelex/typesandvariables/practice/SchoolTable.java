package io.codelex.typesandvariables.practice;

public class SchoolTable {
    public static void main(String[] args) {
        //Course names
        String course1 = "English III";
        String course2 = "Precalculus";
        String course3 = "Music Theory";
        String course4 = "Biotechnology";
        String course5 = "Principles of Technology I";
        String course6 = "Latin II";
        String course7 = "AP US History";
        String course8 = "Business Computer Infomation Systems";
        //Teachers
        String teacher1 = "Ms. Lapan ";
        String teacher2 = "Mrs. Gideon";
        String teacher3 = "Mr. Davis";
        String teacher4 = "Ms. Palmer";
        String teacher5 = "Ms. Garcia";
        String teacher6 = "Mrs. Barnett";
        String teacher7 = "Ms. Johannessen";
        String teacher8 = "Mr. James";
        //Create table
        int numberingLength = 5;
        int longestCourseName = course8.length();
        int longestTeacherName = teacher7.length();
        int totalTableWidth = numberingLength + longestTeacherName + longestCourseName;
        int totalTableHeight = 10;
        String table = "";
        for (int column = 0; column < totalTableHeight; column++){
            for(int row = 0; row < totalTableWidth; row++){
                if(column == 0 && row == 0){
                    table += "+" + "-".repeat(totalTableWidth - 2) + "+";
                }else if (column == totalTableHeight - 1 && row == totalTableWidth - 1){
                    table += "+" + "-".repeat(totalTableWidth - 2) + "+" ;
                }else if(row == 0 || row == totalTableWidth - 1 || row == totalTableWidth - longestTeacherName - 1 || row == 4){
                    table += "|";
                }else if(row == 2){
                    table += column + 1;
                }
            }
            table += "\n";
        }
        System.out.println(table);
    }
}
