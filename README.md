+----------------------------------+----------------------------------+
| ![](vertopal_b7                  | > CSE 215: Programming Language  |
| 1b8287ea0e4e508cb696668f6e510f/m | > II                             |
| edia/image1.png){width="0.875in" |                                  |
| height="1.0249989063867018in"}   |                                  |
+==================================+==================================+
|                                  | > Sec -- 4, Faculty: SvA         |
+----------------------------------+----------------------------------+
|                                  | > Programming Assignment \# 1,   |
|                                  | > Marks: 100                     |
+----------------------------------+----------------------------------+
|                                  | > **Deadline:**                  |
+----------------------------------+----------------------------------+

+----------------------------------------------------------------------+
| > **Instruction:**                                                   |
| >                                                                    |
| > 1\. Use A4 sized papers\                                           |
| > 2. Answer everything using a pen. Pencil is not allowed.           |
| >                                                                    |
| > 3\. Write your answers on both sides of the papers. If you leave   |
| > any side then you will be penalised.                               |
| >                                                                    |
| > 4\. Use a separate paper on top of your answer script that must    |
| > include course name, section number, current semester, your name,  |
| > your ID, Homework number. Use the format provided in the forum.    |
+----------------------------------------------------------------------+

> **Problem Statement**\
> Suppose that you need to develop a computer program using Java for a
> clinic where the manager of the clinic will be able to manage patient
> appointments by doing the following: The management will be as
> follows:
>
> • A maximum of 1000 appointments in the clinic management.
>
> • A particular appointment ID (auto generated), patients' name, serial
> of appointment of current day, age, appointment date, appointment time
> should be saved.
>
> The following methods should work as mentioned:
>
> Firstly, take arrays of type int, int, String, int, Date, Time for
> appointment ID, serial, name, age, date and time of appointment of
> size 1000 and then use the following methods to manipulate the list:
>
> • **void main(String\[\] args):**Using a while loop, display five
> options to the clinic manager:
>
> 1\. View appointments
>
> 2\. Add appointment
>
> 3\. Delete an appointment
>
> 4\. Update an appointment
>
> 5\. Exit
>
> When the user selects option 1, display all the appointments of
> current day invoking the \'viewAppointments' method.
>
> When the user selects option 2, the 'addAppointment' method is
> invoked. When the user selects option 3, the 'deleteAppointment'
> method is invoked. When the user selects option 4, the
> 'updateAppointment' method is invoked. When the user selects option 5,
> the loop is broken and the system is closed.

  --- --------------------------------------------------------------------
  •   • **void viewAppointments(int\[\] id, int\[\] serial, String\[\]**
  --- --------------------------------------------------------------------

> **name, int\[\] age, Date\[\] date, Time\[\] time)**: This method
> shows all
>
> the appointments of the current date to the user sorted according to
> appointment time.
>
> •**void addAppointment(int\[\] id, int\[\] serial, String\[\] name,
> int\[\] age, Date\[\] date, Time\[\]
> time):**!\"\#\$%!&\'(\#)\*!+%,%!(\#\'!-%\'.!/).!+!
> !!0+(\$\'1(2%!1+&\'3!+4\'3!+00)\$1(&\'1(!\*+(\'!+1\*!(\$&\'!+1\*!+\*\*%!(\#\'!+00)\$1(&\'1(!()!(\#\'!5\$%(!
>
> !!+66).\*\$14!()!6+56-5+(\'\*!%\'.\$+5!)/!(\#+(!\*+78
>
> •**void deleteAppointment(int\[\] id, int\[\] serial, String\[\] name,
> int\[\] age, Date\[\] date, Time\[\] time):** This method takes an
> appointment ID as input from user and deletes the corresponding
> appointment from the arrays.
>
> • **void updateAppointment(Date\[\] date, Time\[\] time):** This
> method first
>
> asks the user the appointment ID to be updated. Then it asks the user
> for 3 options:
>
> 1\. Update date and time.
>
> 2\. Update time.
>
> 3\. Update date.
>
> Based on the selection of the user, the user will update the
> information of appointment in the
>
> passed arrays.
>
> •**int\[\] sort(int\[\] serial):** This method takes the serial array
> as input and creates another integer array that stores the index
> values of the array after sorting the
>
> values in ascending order.
>
> **•int\[\] sort(Date\[\] date):** This method takes the date array as
> input and creates another integer array that stores the index values
> after sorting the date array in ascending
>
> order.
>
> Complete the main method class as directed above.Then answer the
> following questions based on your analysis of the work.
>
> 1\. There are two methods in the class above, both named as "sort",
> which object-oriented
>
> feature allowed you to do that? Describe briefly.
>
> 2\. What could be a challenge if you want to modify any information of
> an appointment or
>
> add/delete an appointment from the class record?
>
> 3\. There are three ways that can be adopted for inserting comments.
> How are they different?
>
> 4\. In your management system, when do you think an array index out of
> bound exception might occur? What steps would you take to avoid such
> exceptions and errors? Explain briefly.
>
> 5\. There are **10 points** for coding style.
