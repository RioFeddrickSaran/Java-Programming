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
    void minMax(){
        Node temp=tail.next;
        int min=temp.data;
        int max=temp.data;
        do{
            if(temp.data<min) min=temp.data;
            if(temp.data>max) max=temp.data;
            temp=temp.next;
        }while(temp!=tail.next);
        System.out.print("Maximum = "+max+" Minimum = "+min);}}
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        CircularLinkedList list=new CircularLinkedList();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            list.insertTail(sc.nextInt());}
        list.minMax();}}
