package com.example.springboot.pojo;

import com.alibaba.fastjson.JSON;

public class COVIDData {

    int currentConfirmedCount;
    int currentConfirmedIncr;
    int confirmedCount;
    int confirmedIncr;
    int suspectedCount;
    int suspectedIncr;
    int curedCount;
    int curedIncr;
    int deadCount;
    int deadIncr;
    int seriousCount;
    int seriousIncr;

    String generalRemark;
    String remark1;
    String remark2;
    String remark3;
    String remark4;
    String remark5;
    String note1;
    String note2;
    String note3;

    String updateTime;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("currentConfirmedCount: ").append(currentConfirmedCount).append("\n")
                .append("currentConfirmedIncr: ").append(currentConfirmedIncr).append("\n")
                .append("confirmedCount: ").append(confirmedCount).append("\n")
                .append("confirmedIncr: ").append(confirmedIncr).append("\n")
                .append("suspectedCount: ").append(suspectedCount).append("\n")
                .append("suspectedIncr: ").append(suspectedIncr).append("\n")
                .append("curedCount: ").append(curedCount).append("\n")
                .append("curedIncr: ").append(curedIncr).append("\n")
                .append("deadCount: ").append(deadCount).append("\n")
                .append("deadIncr: ").append(deadIncr).append("\n")
                .append("seriousCount: ").append(seriousCount).append("\n")
                .append("seriousIncr: ").append(seriousIncr).append("\n")
                .append("generalRemark: ").append(generalRemark).append("\n")
                .append("remark1: ").append(remark1).append("\n")
                .append("remark2: ").append(remark2).append("\n")
                .append("remark3: ").append(remark3).append("\n")
                .append("remark4: ").append(remark4).append("\n")
                .append("remark5: ").append(remark5).append("\n")
                .append("note1: ").append(note1).append("\n")
                .append("note2: ").append(note2).append("\n")
                .append("note3: ").append(note3).append("\n")
                .append("updateTime: ").append(updateTime).append("\n");
        return sb.toString();
    }

    /*
    public COVIDData(int currentConfirmedCount, int currentConfirmedIncr, int confirmedCount, int confirmedIncr, int suspectedCount, int suspectedIncr, int curedCount, int curedIncr, int deadCount, int deadIncr, int seriousCount, int seriousIncr, String generalRemark, String remark1, String remark2, String remark3, String remark4, String remark5, String note1, String note2, String note3, String updateTime) {
        this.currentConfirmedCount = currentConfirmedCount;
        this.currentConfirmedIncr = currentConfirmedIncr;
        this.confirmedCount = confirmedCount;
        this.confirmedIncr = confirmedIncr;
        this.suspectedCount = suspectedCount;
        this.suspectedIncr = suspectedIncr;
        this.curedCount = curedCount;
        this.curedIncr = curedIncr;
        this.deadCount = deadCount;
        this.deadIncr = deadIncr;
        this.seriousCount = seriousCount;
        this.seriousIncr = seriousIncr;
        this.generalRemark = generalRemark;
        this.remark1 = remark1;
        this.remark2 = remark2;
        this.remark3 = remark3;
        this.remark4 = remark4;
        this.remark5 = remark5;
        this.note1 = note1;
        this.note2 = note2;
        this.note3 = note3;
        this.updateTime = updateTime;
    }
    */

    public int getCurrentConfirmedCount() {
        return currentConfirmedCount;
    }

    public void setCurrentConfirmedCount(int currentConfirmedCount) {
        this.currentConfirmedCount = currentConfirmedCount;
    }

    public int getCurrentConfirmedIncr() {
        return currentConfirmedIncr;
    }

    public void setCurrentConfirmedIncr(int currentConfirmedIncr) {
        this.currentConfirmedIncr = currentConfirmedIncr;
    }

    public int getConfirmedCount() {
        return confirmedCount;
    }

    public void setConfirmedCount(int confirmedCount) {
        this.confirmedCount = confirmedCount;
    }

    public int getConfirmedIncr() {
        return confirmedIncr;
    }

    public void setConfirmedIncr(int confirmedIncr) {
        this.confirmedIncr = confirmedIncr;
    }

    public int getSuspectedCount() {
        return suspectedCount;
    }

    public void setSuspectedCount(int suspectedCount) {
        this.suspectedCount = suspectedCount;
    }

    public int getSuspectedIncr() {
        return suspectedIncr;
    }

    public void setSuspectedIncr(int suspectedIncr) {
        this.suspectedIncr = suspectedIncr;
    }

    public int getCuredCount() {
        return curedCount;
    }

    public void setCuredCount(int curedCount) {
        this.curedCount = curedCount;
    }

    public int getCuredIncr() {
        return curedIncr;
    }

    public void setCuredIncr(int curedIncr) {
        this.curedIncr = curedIncr;
    }

    public int getDeadCount() {
        return deadCount;
    }

    public void setDeadCount(int deadCount) {
        this.deadCount = deadCount;
    }

    public int getDeadIncr() {
        return deadIncr;
    }

    public void setDeadIncr(int deadIncr) {
        this.deadIncr = deadIncr;
    }

    public int getSeriousCount() {
        return seriousCount;
    }

    public void setSeriousCount(int seriousCount) {
        this.seriousCount = seriousCount;
    }

    public int getSeriousIncr() {
        return seriousIncr;
    }

    public void setSeriousIncr(int seriousIncr) {
        this.seriousIncr = seriousIncr;
    }

    public String getGeneralRemark() {
        return generalRemark;
    }

    public void setGeneralRemark(String generalRemark) {
        this.generalRemark = generalRemark;
    }

    public String getRemark1() {
        return remark1;
    }

    public void setRemark1(String remark1) {
        this.remark1 = remark1;
    }

    public String getRemark2() {
        return remark2;
    }

    public void setRemark2(String remark2) {
        this.remark2 = remark2;
    }

    public String getRemark3() {
        return remark3;
    }

    public void setRemark3(String remark3) {
        this.remark3 = remark3;
    }

    public String getRemark4() {
        return remark4;
    }

    public void setRemark4(String remark4) {
        this.remark4 = remark4;
    }

    public String getRemark5() {
        return remark5;
    }

    public void setRemark5(String remark5) {
        this.remark5 = remark5;
    }

    public String getNote1() {
        return note1;
    }

    public void setNote1(String note1) {
        this.note1 = note1;
    }

    public String getNote2() {
        return note2;
    }

    public void setNote2(String note2) {
        this.note2 = note2;
    }

    public String getNote3() {
        return note3;
    }

    public void setNote3(String note3) {
        this.note3 = note3;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

}
