package singly_linked_list.student_record_management;

class Student {

    public Node head=null;
    public Node tail=null;

    int size=0;

    public void addAtBeginning(String name,int age,int rollNumber,String grade){
        Node newNode = new Node(name,age,rollNumber,grade);

        if(head == null){
            head = tail =newNode;
            size++;
            return;
        }
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void addAtEnd(String name,int age,int rollNumber,String grade){

        Node newNode = new Node(name,age,rollNumber,grade);

        if(head == null){
            head = tail= newNode;
            size++;
            return;
        }

        tail.next =newNode;
        tail= newNode;
        size++;

    }

    public void addAtSpecificPosition(int position,String name,int age,int rollNumber,String grade){

        Node newNode = new Node(name,age,rollNumber,grade);
        Node temp= head;

        if(position==size){
            addAtEnd(name,age,rollNumber,grade);
            return;
        }
        else if(position==0){
            addAtBeginning(name,age,rollNumber,grade);
            return;
        } else if (position<0 || position>size) {
            System.out.println("Invalid index ");

            return;
        }

        for(int i=0 ;i<position-1;i++){

            temp= temp.next;
        }

        newNode.next= temp.next;
        temp.next = newNode;

        size++;

    }

    public void deleteByRollNumber(int rollNumber){
        Node current = head;

        if(current.next == null && current.rollNumber == rollNumber) {
            head = null;
            size--;
        }

        while(current.next!=null){
            if(current.next.rollNumber == rollNumber) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
            size--;
        }

        System.out.println("Roll  number not found. ");
    }


    public void searchByRollNumber(int rollNumber){

        Node current = head;
        while(current != null){
            if(current.rollNumber == rollNumber) {
                System.out.println("Name of Student : "+current.name);
                System.out.println("Age of Student : "+current.age);
                System.out.println("Roll Number of Student : "+current.rollNumber);
                System.out.println("Grade of Student : "+current.grade);
            }
            current = current.next;
        }

        System.out.println("Roll  number not found. ");

    }

    public void updateGrade(int rollNumber, String newGrade) {

        Node temp = head;
        while (temp != null) {
            if (temp.rollNumber == rollNumber) {
                temp.grade = newGrade;
                System.out.println("Grade updated successfully");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Record not found");
    }

    public void displayRecords() {
        if (head == null) {
            System.out.println("No records to display");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.println("Roll Number: " + temp.rollNumber + ", Name: " + temp.name + ", Age: " + temp.age + ", Grade: " + temp.grade);
            temp = temp.next;
        }
    }
}
