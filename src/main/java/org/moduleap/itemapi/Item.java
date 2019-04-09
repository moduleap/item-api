package org.moduleap.itemapi;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "items")
public class Item {

}
