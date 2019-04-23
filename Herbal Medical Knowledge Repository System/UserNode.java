
public class UserNode {
    private Object userid , password , email , usertype;
    private UserNode link;
    
    public UserNode() {
        userid = null;
        password = null;
        email = null;
        usertype = null;
    }
    
    public UserNode(Object userid , Object password , Object email , Object usertype) {
        this.userid = userid;
        this.password = password;
        this.email = email;
        this.usertype = usertype;
        link = null;
    }
    
    public UserNode(Object userid , Object password , Object email , Object usertype , UserNode next) {
        this.userid = userid;
        this.password = password;
        this.email = email;
        this.usertype = usertype;
        link = next;
    }
    
    public Object getUserid() {
        return userid;
    }
    
    public void setUserid(Object userid) {
        this.userid = userid;
    }
    
    public Object getPassword() {
        return password;
    }
    
    public void setPassword(Object password) {
        this.password = password;
    }
    
    public Object getEmail() {
        return email;
    }
    
    public void setEmail(Object email) {
        this.email = email;
    }
    
    public Object getUsertype() {
        return usertype;
    }
    
    public void setUsertype(Object usertype) {
        this.usertype = usertype;
    }
    
    public UserNode getLink() {
        return link;
    }
    
    public void setLink(UserNode link) {
        this.link = link;
    }
}
