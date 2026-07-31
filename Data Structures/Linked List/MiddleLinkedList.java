import java.util.Scanner;
public class MiddleLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;}}
    static Node middleNode(Node head){
        Node fast=head;
        Node slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;}
        return slow;}
    static void printList(Node head){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;}
        System.out.println("null");}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Node head=null;
        Node tail=null;
        for (int i=0;i<n;i++){
            int value=sc.nextInt();
            Node newNode=new Node(value);
            if (head==null){
                head=newNode;
                tail=newNode;}
            else{
                tail.next=newNode;
                tail=newNode;}}
        printList(head);
        Node middle=middleNode(head);
        System.out.println("Middle node value:"+middle.data);
        sc.close();}}
