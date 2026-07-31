import java.util.Scanner;
public class ReverseLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;}}
    static Node reverse(Node head){
        Node prev=null;
        Node current=head;
        Node next=null;
        while(current != null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;}
        return prev;}
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
        head=reverse(head);
        printList(head);
        sc.close();}}
