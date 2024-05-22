import javax.swing.*;

public class Task {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            int i=0;
        });}
       public static void questions(){
            //declaring
        int i = 0;

        // Keeps the Numeric Menu open until Quit is chosen
        while (i < 1) {
            String Question = JOptionPane.showInputDialog("""
                    Option 1) Add tasks
                    Option 2) Show report - underdevelopment
                    Option 3) Quit""");

            // When Option 1 is Chosen the getTypeOfTask method is performed
            if (Question.contains("1")) {
                getTypeOfTask();

            } else if (Question.contains("2")) {
                JOptionPane.showMessageDialog(null, "Coming soon"); // underdevelopment

            } else if (Question.contains("3")) {
                JOptionPane.showMessageDialog(null, "Goodbye"); //Quits the program
                i++;
            }
        }
    }

    public static void getTypeOfTask() {
        int numbersOfTasks = Integer.parseInt(JOptionPane.showInputDialog("Enter Amount of Tasks")); //the amount of tasks going to be made
        int[] durations = new int[numbersOfTasks];// initializes the array
        int b=0;

        for (int c = 0; c < numbersOfTasks;) {
            int taskNumber = b + 1;
            int duration = Integer.parseInt(JOptionPane.showInputDialog("Enter Duration for Task " + taskNumber)); //time for task
            durations[c] = duration;

            String task = "";
            int d = 0;
            // Chooses type TaskStatus
            while (d < 1) {
                String taskStatus = JOptionPane.showInputDialog("Task Status"+"\n"+"1. To do"+"\n"+"2. Done"+"\n"+"3. Doing");
                if (taskStatus.contains("1")) {
                    task = "To do";
                    d++;
                } else if (taskStatus.contains("2")) {
                    task = "Done";
                    d++;
                } else if (taskStatus.contains("3")) {
                    task = "Doing";
                    d++;
                }
            } //loop ends


            int t = 0;
            while (t < 1) {
                String taskD = JOptionPane.showInputDialog("Enter Description" + "\n" + "Should not exceed 50 characters");
                boolean checkTaskD = taskD.length() <= 50;
                if (checkTaskD) {
                    JOptionPane.showMessageDialog(null, "Task successfully captured"); //if requirements are met
                    t++; // t is incremented and loop will stop
                } else {
                    JOptionPane.showMessageDialog(null, "Please enter a task description of 50 characters or less");  //if requirements are not met
                }

                String developerDetails = JOptionPane.showInputDialog("Enter Name and Last Name");  // Developers details Name and Surname
                String taskName = JOptionPane.showInputDialog("Task Name");   // The type of feature the task is

                //Generates the taskID
                String firstTwoLetters = taskName.substring(0, Math.min(taskName.length(), 2)).toUpperCase();// takes first 2 letters of task name
                String lastThreeLetters = developerDetails.substring(Math.max(developerDetails.length() - 3, 0)).toUpperCase(); // takes last 3 letters of developers details
                String taskID = firstTwoLetters + ":" + taskNumber + ":" + lastThreeLetters;

                // Displays everything
                String printTaskDetails = "Task Status: " + task + "\n" +
                        "Developer Details:\n" + developerDetails + "\n" +
                        "Task Number: " + taskNumber + "\n" +
                        "Task Name: " + taskName + "\n" +
                        "Task Description: " + taskD + "\n" +
                        "Task ID: " + taskID + "\n" +
                        "Duration: " + duration;
                JOptionPane.showMessageDialog(null, printTaskDetails);
                c++;   // c is incremented and stops at the number of tasks that needed to be completed
                b++;   // b is incremented to add to the numbering of tasks
            }
        }
        JOptionPane.showMessageDialog(null, "Total Hours: " + returnTotalHours(durations));} //Displays total duration

    // Calculates the total Duration of all Tasks
    public static int returnTotalHours(int[] durations) {
        int totalHours = 0;
        for (int duration : durations) {
            totalHours += duration;
        }
        return totalHours;
    }}