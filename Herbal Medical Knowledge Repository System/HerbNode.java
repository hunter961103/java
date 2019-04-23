
public class HerbNode {
    private Object name , type , image , description , relatedds , relatedtm;
    private HerbNode link;
    
    public HerbNode() {
        name = null;
        type = null;
        image = null;
        description = null;
        relatedds = null;
        relatedtm = null;
    }
    
    public HerbNode(Object name , Object type , Object image , Object description , Object relatedds , Object relatedtm) {
        this.name = name;
        this.type = type;
        this.image = image;
        this.description = description;
        this.relatedds = relatedds;
        this.relatedtm = relatedtm;
        link = null;
    }
    
    public HerbNode(Object name , Object type , Object image , Object description , Object relatedds , Object relatedtm , HerbNode next) {
        this.name = name;
        this.type = type;
        this.image = image;
        this.description = description;
        this.relatedds = relatedds;
        this.relatedtm = relatedtm;
        link = next;
    }
    
    public Object getName() {
        return name;
    }
    
    public void setName(Object name) {
        this.name = name;
    }
    
    public Object getType() {
        return type;
    }
    
    public void setType(Object type) {
        this.type = type;
    }
    
    public Object getImage() {
        return image;
    }
    
    public void setImage(Object image) {
        this.image = image;
    }
    
    public Object getDescription() {
        return description;
    }
    
    public void setDescription(Object description) {
        this.description = description;
    }
    
    public Object getRelatedds() {
        return relatedds;
    }
    
    public void setRelatedds(Object relatedds) {
        this.relatedds = relatedds;
    }
    
    public Object getRelatedtm() {
        return relatedtm;
    }
    
    public void setRelatedtm(Object relatedtm) {
        this.relatedtm = relatedtm;
    }
    
    public HerbNode getLink() {
        return link;
    }
    
    public void setLink(HerbNode link) {
        this.link = link;
    }
}
