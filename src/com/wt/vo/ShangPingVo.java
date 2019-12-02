package com.wt.vo;

import javax.persistence.*;

@Entity
@Table(name = "echarts_commodity")
public class ShangPingVo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int commid;
    private String  commname;
    private int  commnum;
    private String commtype;

    public int getCommid() {
        return commid;
    }

    public void setCommid(int commid) {
        this.commid = commid;
    }

    public String getCommname() {
        return commname;
    }

    public void setCommname(String commname) {
        this.commname = commname;
    }

    public int getCommnum() {
        return commnum;
    }

    public void setCommnum(int commnum) {
        this.commnum = commnum;
    }

    public String getCommtype() {
        return commtype;
    }

    public void setCommtype(String commtype) {
        this.commtype = commtype;
    }
}