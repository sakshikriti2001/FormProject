package com.NewLearning.ProjectSpring.Entity;


import jakarta.persistence.Entity;

@Entity
public class Course {
    private long ID;
    private String Name;
    private String Description;


//    //constructor
//    public Course(long ID, String Name , String Description) {
//        super();
//        this.ID = ID;
//        this.Name = Name;
//        this.Description = Description;
//    }
//    //Default constructor
//    public Course()
//    {
//        super();
//    }
//    public long getID() {
//        return ID;
//    }
//
//    public void setID(long ID) {
//        this.ID = ID;
//    }
//    public String getName(String Name)
//    {
//        return Name;
//    }
//    public void setName(String Name){
//        this.Name = Name;
//    }
//    public String getDescription() {
//        return Description;
//    }
//    public void setDescription()
//    {
//        this.Description = Description;
//    }
//
//
//
//    @Override
//    public String toString() {
//        return "course{" + "ID=" + ID + ", Name='" + Name + '\'' + ", Description='" + Description + '\'' + '}';
//    }
}
