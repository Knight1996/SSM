package com.knight.dto;

import com.knight.entity.Appointment;
import com.knight.enums.AppointStateEnum;

/**
 * 封装预约执行后结果
 */
public class AppointExecution {

    //图书ID
    private long bookId;
    //秒杀预约结果状态
    private int state;
    //状态标志
    private String stateInfo;
    //预约成功对象
    private Appointment appointment;

    //无参构造器
    public AppointExecution() {

    }

    //预约失败构造器
    public AppointExecution(long bookId, AppointStateEnum stateEnum) {
        this.bookId = bookId;
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();
    }

    //预约成功构造器
    public AppointExecution(long bookId, AppointStateEnum stateEnum, Appointment appointment) {
        this.bookId = bookId;
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();
        this.appointment = appointment;
    }

    public long getBookId() {
        return bookId;
    }

    public int getState() {
        return state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public Appointment getAppointment() {
        return appointment;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public void setState(int state) {
        this.state = state;
    }

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }

    @Override
    public String toString() {
        return "AppointExecution [bookId=" + bookId + ", state=" + state + ", stateInfo=" + stateInfo + ", appointment="
                + appointment + "]";
    }
}
