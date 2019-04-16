package org.acme.quickstart;

import java.util.Date;

/**
 * Demo
 */
public class Demo {

    String name;
    String tech;
    String city;
    String audience;

    public Demo() {
    }

    public Demo(String name, String tech, String city, String audience) {
        this.name = name;
        this.tech = tech;
        this.city = city;
        this.audience = audience;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the tech
     */
    public String getTech() {
        return tech;
    }

    /**
     * @param tech the tech to set
     */
    public void setTech(String tech) {
        this.tech = tech;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the audience
     */
    public String getAudience() {
        return audience;
    }

    /**
     * @param audience the audience to set
     */
    public void setAudience(String audience) {
        this.audience = audience;
    }

    
}