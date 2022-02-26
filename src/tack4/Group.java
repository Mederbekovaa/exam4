package tack4;

import java.awt.*;
import java.util.Objects;

public class Group {
       private String name;
       private int num;
       private int course;

       public String getName() {
              return name;
       }

       public void setName(String name) {
              this.name = name;
       }

       public int getNum() {
              return num;
       }

       public void setNum(int num) {
              this.num = num;
       }



       public int getCourse() {
              return course;
       }

       public void setCourse(int course) {
              this.course = course;
       }



       @Override
       public String toString() {
              return "Group{}";
       }



       @Override
       public boolean equals(Object o) {
              if (this == o) return true;
              if (o == null || getClass() != o.getClass()) return false;
              Group group = (Group) o;
              return course == group.course && num == group.num && Objects.equals(name, group.name);
       }

       @Override
       public int hashCode() {
              return Objects.hash(name, course, num);
       }




}
