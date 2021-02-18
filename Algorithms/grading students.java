 public static List<Integer> gradingStudents(List<Integer> grades) {
    for(int i=0;i<grades.size();i++){
        if(grades.get(i)>37&&grades.get(i)%5>2){
            int grade=grades.get(i);
            grade+=5-grade%5;
            grades.set(i,grade);
        }
    }
    return grades;

    }
