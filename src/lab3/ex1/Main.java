package lab3.ex1;

// 1. Допишите в класс «Study» конструктор

class Study {
    private String course;

    public void setCourse(String course) {
        this.course = course;
    }

    public Study(String words)
    {
        setCourse(words);
    }

    public String printCourse() {
        return this.course;
    }
}

class JavaProgram {
    public static void main(String[] args) {
        Study study = new Study("Изучение Java - это просто!");
        System.out.println(study.printCourse());
    }
}

