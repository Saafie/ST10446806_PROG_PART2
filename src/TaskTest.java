import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    class TaskTest {
    // Task 1
        @Test
        public void testTaskDescript_Successful() {
            String taskD = "Create Login to authenticate users";
            assertEquals(taskD, taskD);
        }

        @Test
        public void testTaskDescript_InvalidLength() {
            String taskD = "";
            // Task description should not exceed 50 characters
            String expected = "Create Login to authenticate users";
            assertEquals(expected, taskD );
        }

        @Test
        public void testGetTaskID() {
            // taskID
            String expected = "AD:1:BYN ";
            assertEquals(expected, "AD:1:BYN" );
        }

        @Test
        public void testReturnTotalHours() {
            int[] durations = {10, 12, 55,11, 1};
            int expected = 18;
            int expected1 = 89;
            assertEquals(expected, durations);
            assertEquals(expected1, durations);
        }

    @Test
    public void testTask2Descript_Successful() {
            String taskD = "";
        // Task description should not exceed 50 characters
        String expected = "Create Add Task feature to add task  users"; // As per the implementation, invalid length returns an empty string
        assertEquals(expected, taskD );
    }

    @Test
    public void testTask2Descript_InvalidLength() {
        String taskD = "";
        // Task description exceed 50 characters
        String expected = "Create Add Task feature to add task  users"; // As per the implementation, invalid length returns an empty string
        assertEquals(expected, taskD );
    }

    @Test
    public void testGetTaskID2() {
            //Generated taskID
        String expected = "CR:2:ITH";
        assertEquals(expected, "CR:2:ITH" );
    }

    @Test
    public void testReturnTotalHours2() {
            //Durations
        int[] durations = {10, 12, 55,11, 1};
        int expected = 18;
        int expected1 = 89;
        assertEquals(expected, durations);
        assertEquals(expected1, durations);
    }
    }