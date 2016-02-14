/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;


/**
 *
 * @author koryo
 */
@Named
@RequestScoped
public class NewTicketBean {
    private String title;
    private Integer state;

    public String next() {
        System.out.println("title = " + title + ", state = " + state);
        return "ticket.xhtml";
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
    
    
}
