module lesson_1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires spring.context;
    requires spring.beans;


  opens lesson_1 to spring.beans;
  exports lesson_1;

    //opens lesson_1 to spring.context;
    //exports lesson_1;
}