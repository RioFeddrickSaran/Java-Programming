import java.util.Scanner;
class Node{
    int  data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;}}
class LinkedList{
    Node head;
    void insert(int data){
        Node temp=head;
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;}
        while(temp.next!=null){
            temp=temp.next;}
        temp.next=newNode;}
        
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;}}}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        LinkedList list=new LinkedList();
        for(int i=0;i<n;i++){
            insert(sc.nextInt());}
        display();}
