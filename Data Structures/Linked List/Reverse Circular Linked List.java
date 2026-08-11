import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;}}
class CircularLinkedList{
    Node tail;
    void insertHead(int data){
        Node newNode=new Node(data);
        if(tail==null){
            newNode.next=newNode;
            tail=newNode;
            return;}
        newNode.next=tail.next;
        tail.next=newNode;}
    void insertTail(int data){
        Node newNode=new Node(data);
        if(tail==null){
            insertHead(data);
            return;}
        newNode.next=tail.next;
        tail.next=newNode;
        tail=newNode;}
    void reverse(){
        Node first=tail.next;
        Node prev=tail;
        Node current=first;
        do{
            Node next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }while(current!=first);
        tail=first;
        tail.next=prev;}
    void display(){
        Node temp=tail.next;
        do{
            System.out.print(temp.data+" ");
            temp=temp.next;
        }while(temp!=tail.next);}}
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        CircularLinkedList list=new CircularLinkedList();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            list.insertTail(sc.nextInt());}
        list.reverse();
        list.display();}}
