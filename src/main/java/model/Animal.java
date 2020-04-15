package model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/**
 * The persistent class for the users database table.
 *
 */
@Entity
@Table(name = "Animals")
@NamedQuery(name = "Animal.findAll", query = "SELECT a FROM Animal a")
@Data
@NoArgsConstructor
public class Animal implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private Integer id;

    private String name;

    private boolean cute;

}
