package ${package}.models;

import leap.orm.annotation.Column;
import leap.orm.annotation.Id;
import leap.orm.annotation.Table;
import leap.orm.model.Model;

@Table(autoCreate = true)
public class Greeting extends Model {

    @Id
    protected Integer id;

    @Column
    protected String  name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}