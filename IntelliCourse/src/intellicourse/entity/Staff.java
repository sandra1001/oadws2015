package intellicourse.entity;
// Generated 29.11.2015 23:06:33 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Staff generated by hbm2java
 */
public class Staff  implements java.io.Serializable {


     private int uid;
     private User user;
     private Set lectures = new HashSet(0);

    public Staff() {
    }

	
    public Staff(User user) {
        this.user = user;
    }
    public Staff(User user, Set lectures) {
       this.user = user;
       this.lectures = lectures;
    }
   
    public int getUid() {
        return this.uid;
    }
    
    public void setUid(int uid) {
        this.uid = uid;
    }
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    public Set getLectures() {
        return this.lectures;
    }
    
    public void setLectures(Set lectures) {
        this.lectures = lectures;
    }




}

