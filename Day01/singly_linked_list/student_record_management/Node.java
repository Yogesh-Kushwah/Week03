package singly_linked_list.student_record_management;

class Node {
    String name;
    int age;
    int rollNumber;
    String grade;
    Node next;

    public Node(String name,int age,int rollNumber,String grade){
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.grade = grade;
        this.next = null;
    }
}
