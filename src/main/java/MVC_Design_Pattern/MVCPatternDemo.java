package MVC_Design_Pattern;

/**
 * @author Albon Idrizi https://www.linkedin.com/in/albonidrizi
 *
 * @The Model-View-Controller (MVC) design pattern is a structural pattern that separates an application into three interconnected components:
 * @Model: Handles the data logic of the application. Responsible for data representation and business rules.
 * @View: Displays the data to the user and sends user actions to the controller.
 * @Controller: Processes input from the user and updates the model and view accordingly.
 * */

public class MVCPatternDemo {
    public static void main(String[] args) {
        // Create the model
        Student model = new Student("Rea Ibrahimi", "25");

        // Create the view
        StudentView view = new StudentView();

        // Create the controller
        StudentController controller = new StudentController(model, view);

        // Display initial details
        controller.updateView();

        // Update the model
        controller.setStudentName("Julieda Janina");
        controller.setStudentRollNo("26");

        // Display updated details
        controller.updateView();
    }
}

