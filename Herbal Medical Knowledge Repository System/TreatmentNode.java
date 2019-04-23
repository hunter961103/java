
public class TreatmentNode {
    private Object name , type , description , relatedh , relatedds;
    private TreatmentNode link;
    
    public TreatmentNode() {
        name = null;
        type = null;
        description = null;
        relatedh = null;
        relatedds = null;
    }
    
    public TreatmentNode(Object name , Object type , Object description , Object relatedh , Object relatedds) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.relatedh = relatedh;
        this.relatedds = relatedds;
        link = null;
    }
    
    public TreatmentNode(Object name , Object type , Object description , Object relatedh , Object relatedds , TreatmentNode next) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.relatedh = relatedh;
        this.relatedds = relatedds;
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
    
    public Object getDescription() {
        return description;
    }
    
    public void setDescription(Object description) {
        this.description = description;
    }
    
    public Object getRelatedh() {
        return relatedh;
    }
    
    public void setRelatedh(Object relatedh) {
        this.relatedh = relatedh;
    }
    
    public Object getRelatedds() {
        return relatedds;
    }
    
    public void setRelatedds(Object relatedds) {
        this.relatedds = relatedds;
    }
    
    public TreatmentNode getLink() {
        return link;
    }
    
    public void setLink(TreatmentNode link) {
        this.link = link;
    }
}
