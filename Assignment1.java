

// Name: Ahmed Omar Salim Adnan
// ID: 1831245042
// Course: CSE215
// Section: 04


import java.util.*;  
import java.sql.Time;
import java.text.SimpleDateFormat;



public class Assignment1 {
    
    static int count = 0;
    static int serialc = 0;
    
    public static void main(String args[]) {
        
        int id[] = new int[1000];
        int serial[] = new int[1000];
        String name[] = new String[1000];
        int age[] = new int[1000];
        Date date[] = new Date[1000];
        Time time[] = new Time[1000];
        
        int opt;
        
            
        Scanner sc= new Scanner(System.in);
        
        while(true){
            
            System.out.print("1) View Appointments 2) Add Appointment 3) Delete an Appointment 4) Update an Appointment 5) Exit. Enter option: ");
            
            opt = sc.nextInt(); 
            
            if(opt==1){
                viewAppointments(id,serial,name,age,date,time);
            }else if(opt==2){
                addAppointment(id,serial,name,age,date,time);
            }else if(opt==3){
                deleteAppointment(id,serial,name,age,date,time);
            }else if(opt==4){
                updateAppointment(id,serial,name,age,date,time);
            }else if(opt==5){
                break;
            }else{
                System.out.println("Invalid Input");
            }
            
            System.out.println("");
            
        }
        
        int z[] = sort(date);
        
        for(int r = 0; r<z.length; r++){
            System.out.println(z[r]);
        }
        
        
    }
    
    public static void viewAppointments(int[] id, int[] serial, String[] name, int[] age, Date[] date, Time[] time){
        
        Time tempTime[] = time;
        Time tmp = new Time(265548);
        int tmp2 = 0;
        
        int index[] = new int[count];
        
        for(int i=0;i<count;i++){
            index[i] = i;
        }
        
        for (int i = 0; i < count; i++){  
            for (int j = i + 1; j < count; j++){  
                
                if (tempTime[j].before(tempTime[i])){  
                    tmp = tempTime[i];
                    tempTime[i] = tempTime[j];  
                    tempTime[j] = tmp;
                    tmp2 = index[i];
                    index[i] = index[j];
                    index[j] = tmp2;
                    
                }  
            }  
         
        }  
        
        
        
        int i = 0;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date today_date = new Date();
        String today = sdf.format(today_date);
        
        
        while(i<count){
            
            String temp = sdf.format(date[index[i]]);
            
            if(temp.equals(today)){
                System.out.println("Appointment ID: " + id[index[i]] + " Serial Number: " + serial[index[i]]);
                System.out.println("Name: " + name[index[i]]);
                System.out.println("Age: " + age[index[i]]);
                System.out.println("Date: " + temp);
                System.out.println("Time: " + time[index[i]].toString());
                System.out.println("");
            }
            
            i++;
        }
          
    }
    
    public static void addAppointment(int[] id, int[] serial, String[] name, int[] age, Date[] date, Time[] time){
        
        serial[count] = ++serialc;
        
        Scanner sc2 = new Scanner(System.in);
        
        System.out.print("Enter name: ");
        name[count]= sc2.nextLine();   
        
        System.out.print("Enter age: ");
        
        age[count]= sc2.nextInt(); 
        
        System.out.print("Enter Day: ");
        int day = sc2.nextInt();
        System.out.print("Enter Month: ");
        int month = sc2.nextInt();
        System.out.print("Enter Year: ");
        int year = sc2.nextInt();
        
        if(month!=1){
            month = month - 1;
        }else{
            month = 0;
        }
        
        date[count] = new GregorianCalendar(year, month, day).getTime(); 
        
        id[count] = Integer.parseInt(Integer.toString(serial[count])+Integer.toString(age[count]));
        
        System.out.print("Enter Hour: ");
        int hour = sc2.nextInt();
        System.out.print("Enter Minute: ");
        int minute = sc2.nextInt();
        
        time[count] =new Time(hour, minute, 0);
        
        
        count++;
        
    }
    
    public static void deleteAppointment(int[] id, int[] serial, String[] name, int[] age, Date[] date, Time[] time){
        
        int len = id.length;
        int i = 0;
        int temp = 0;
        int[] temp_id = new int[id.length - 1];
        int[] temp_serial = new int[serial.length-1];
        String[] temp_name = new String[name.length-1];
        int[] temp_age = new int[age.length-1];
        Date[] temp_date = new Date[date.length-1];
        Time[] temp_time = new Time[time.length-1];
        
        Scanner sc3= new Scanner(System.in);
        
        System.out.print("Enter Appointment ID to be deleted: ");
        int delete = sc3.nextInt();
        
        
        
        if(id == null) {
            System.out.print("There are no appointments yet");
        }else{
            while (i < len) { 
  
                if (id[i] == delete) {
                    
                    for (int j = 0, k = 0; j < id.length; j++) {
 
                        if (j != i) {
                            temp_id[k] = id[j];
                            temp_serial[k] = serial[j];
                            temp_name[k] = name[j];
                            temp_age[k] = age[j];
                            temp_date[k] = date[j];
                            temp_time[k] = time[j];
                        
                            k++;
                        }else{
                            
                        }
                                        
                    } 
                    
                    int z = 0;
                    while(z<len-1){
                        
                            id[z] = temp_id[z];
                            serial[z] = temp_serial[z];
                            name[z] = temp_name[z];
                            age[z] = temp_age[z];
                            date[z] = temp_date[z];
                            time[z] = temp_time[z];
                        
                            z++;
                        
                    }
                    
                    
                    count--;
                    temp = 1;       
                    
                    break;
                }
                else {
                    i = i + 1;
                }
            }
        }
        
        if(temp==0){
            System.out.println("Appointment ID not found");
        }
        
    }
    public static void updateAppointment(int[] id, int[] serial, String[] name, int[] age, Date[] date, Time[] time){
        
        int len = id.length;
        int i = 0;
        int temp = 0;
        
        Scanner sc3= new Scanner(System.in);
        
        System.out.print("Enter Appointment ID to be updated: ");
        int update = sc3.nextInt();
        
        
        
        if(id == null) {
            System.out.print("There are no appointments yet");
        }else{
            while (i < len) { 
  
                if (id[i] == update) {
                    
                    System.out.print("1) Update date and time 2) Update time 3) Update date. Enter option: ");
                    int opt2 = sc3.nextInt();
                    
                    if(opt2 == 1){
                        
                        System.out.print("Enter Day: ");
                        int day = sc3.nextInt();
                        System.out.print("Enter Month: ");
                        int month = sc3.nextInt();
                        System.out.print("Enter Year: ");
                        int year = sc3.nextInt();
        
                        if(month!=1){
                            month = month - 1;
                        }else{
                            month = 0;
                        }
        
                        date[i] = new GregorianCalendar(year, month, day).getTime();
                        
                        System.out.print("Enter Hour: ");
                        int hour = sc3.nextInt();
                        System.out.print("Enter Minute: ");
                        int minute = sc3.nextInt();
        
                        time[i] =new Time(hour, minute, 0);
                        temp=1;
                        
                    }else if(opt2==2){
                        
                        System.out.print("Enter Hour: ");
                        int hour = sc3.nextInt();
                        System.out.print("Enter Minute: ");
                        int minute = sc3.nextInt();
        
                        time[i] =new Time(hour, minute, 0);
                        temp=1;
                        
                                                 
                    }else if(opt2 == 3){
                        
                        System.out.print("Enter Day: ");
                        int day = sc3.nextInt();
                        System.out.print("Enter Month: ");
                        int month = sc3.nextInt();
                        System.out.print("Enter Year: ");
                        int year = sc3.nextInt();
        
                        if(month!=1){
                            month = month - 1;
                        }else{
                            month = 0;
                        }
        
                        date[i] = new GregorianCalendar(year, month, day).getTime();
                        temp = 1;
                        
                    }else{
                        System.out.println("Invalid Input");
                    }
                    
                    break;
                }
                else {
                    i = i + 1;
                }
            }
        }
        
        if(temp==0){
            System.out.println("Appointment ID not found");
        }
            
            
            
        }
    
    public static int[] sort(int[] serial){
        
        int tempSerial[] = serial;
        
        int indexSerial[] = new int[count];
        
        for(int i=0;i<count;i++){
            indexSerial[i] = i;
        }
        
        for (int i = 0; i < count; i++){  
            for (int j = i + 1; j < count; j++){  
                int tmp = 0;
                int tmp2 = 0;
                if (tempSerial[i] > tempSerial[j]){  
                    tmp = tempSerial[i];
                    tempSerial[i] = tempSerial[j];  
                    tempSerial[j] = tmp;
                    tmp2 = indexSerial[i];
                    indexSerial[i] = indexSerial[j];
                    indexSerial[j] = tmp2;
                    
                }  
            }  
         
        }  
        
        return indexSerial;
    }
    
    public static int[] sort(Date[] date){
        
        Date tempDate[] = date;
        int indexDate[] = new int[count];
        Date tmp = new Date();
        int tmp2;
        
        for(int i=0;i<count;i++){
            indexDate[i] = i;
        }
        
        for (int i = 0; i < count; i++){  
            for (int j = i + 1; j < count; j++){  
                
                if (tempDate[j].before(tempDate[i])){  
                    tmp = tempDate[i];
                    tempDate[i] = tempDate[j];  
                    tempDate[j] = tmp;
                    tmp2 = indexDate[i];
                    indexDate[i] = indexDate[j];
                    indexDate[j] = tmp2;
                    
                }  
            }  
         
        }  
        
        return indexDate;

    }
         
    }
    
        
    