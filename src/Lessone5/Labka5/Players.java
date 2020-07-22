package Lessone5.Labka5;

import java.io.Serializable;

public class Players implements Serializable {
    private String nickName;
    private double reating;

    public Players() {
    }

    public Players(String nickName, double reating) {
        this.nickName = nickName;
        this.reating = reating;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public double getReating() {
        return reating;
    }

    public void setReating(double reating) {
        this.reating = reating;
    }

    @Override
    public String toString() {
        return "Players{" +
                "nickName='" + nickName + '\'' +
                ", reating=" + reating +
                '}';
    }
}
