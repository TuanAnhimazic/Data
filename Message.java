import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
//
public class Message{
    ArrayList<String> arrayList = new ArrayList<String>();
    Queue<String> queue = new LinkedList<String>();
    Scanner sc = new Scanner(System.in);

    String Send;
    String Destination="";

    int buffersize=10;

    void input(){
        Send=sc.nextLine();
    }  
boolean lengthCheck(){
    if (Send.length()==0){
        System.out.print("Message is empty");
       return false;
    }
    else if (Send.length()>250) {
        System.out.print("Message is to long(>250 char");
        return false;
    }
    else {
        return true;
    }}
    
int SendMess(String s){
        int i=0;
        int count=0;
        try
        {
            if (lengthCheck()){
                System.out.printf("Length of the message: "+s.length()+" letter\n");
                System.out.printf("\n");
        while(i<s.length());
        {
            while (arrayList.size()<buffersize&& i<s.length()){
                String characters = s.substring(i,i+1);
                arrayList.add(characters);
                i++;
            }
            for(String item: arrayList){
                System.out.printf(item);
            }
            System.out.printf("\n");
        }
           
        while (arrayList.size()!=0){
            String characters = arrayList.get(0);
            queue.add(characters);
            arrayList.remove(0);
        }

        while(!queue.isEmpty()) {
        Destination += queue.poll();
        }
        count++;
        }
    
}
catch(Exception e) {
    System.out.printf("PROGRAM ERROR: "+ e.getMessage());
}
return count;
}
      
public static void main(String[]arg) {
    Message n = new Message();  
    System.out.printf("Enter Message you want to sent( Max 250):");
    n.input();

    double start = System.currentTimeMillis();
    int count = n.SendMess(n.Send);
    double finish = System.currentTimeMillis();
    double time = (finish - start)/n.buffersize;

    if(count>0) {
        System.out.print("\nThe message is send successfully\n");
        System.out.print("\n=>Received\n");
        System.out.print(n.Destination);
        System.out.print("\n");
        System.out.print("\nThe number of buffer usage: "+ count + "time.");
        System.out.print("\nSpace: "+n.buffersize * 2 + "bytes.");
        System.out.printf("\nTime: %.if ms",time);       
    }
    }    }

       
    


 
